package com.zjgj.cas.web;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apereo.cas.web.support.WebUtils;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.webflow.execution.RequestContext;

import com.zjgj.cas.util.ConstUtil;
@RestController
public class CaptchaController {
    @GetMapping("/check")
    public String check(RequestContext context, MessageContext messageContext) {
        String captcha = context.getRequestParameters().get("captcha");
        Object session_captcha = WebUtils.getHttpServletRequestFromExternalWebflowContext(context).getSession().getAttribute("captcha");
        if(captcha != null && session_captcha != null && this.valid(captcha, session_captcha.toString())) {
            return "success";
        } else {
            MessageBuilder msgBuilder = new MessageBuilder();
            msgBuilder.defaultText("验证码错误！");
            messageContext.addMessage(msgBuilder.error().build());
            return "error";
        }
    }
    
    private boolean valid(String c1, String c2) {
        return c1.equalsIgnoreCase(c2);
    }
    
    @GetMapping("/captcha.jpg")
    public void Captcha(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0L);
        response.setContentType("image/png");
        short width = 136;
        byte height = 45;
        BufferedImage image = new BufferedImage(width, height, 1);
        Graphics2D g = (Graphics2D)image.getGraphics();
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Random random = new Random();
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);
        g.setColor(Color.lightGray);

        for(int fontFile = 0; fontFile < 155; ++fontFile) {
            int captchaFont = random.nextInt(width);
            int code = random.nextInt(height);
            int xl = random.nextInt(12);
            int yl = random.nextInt(12);
            g.drawLine(captchaFont, code, captchaFont + xl, code + yl);
        }
        
        String var13 = req.getRealPath("/WEB-INF/classes/monter.ttf");
        Font var14 = loadFont(var13, 28.0F);
        g.setColor(getRandColor());
        g.setFont(var14);
        String var15 = getRandomString(ConstUtil.VALIDATE_CODE_LEN).toUpperCase();
        g.drawString(var15, 10, 35);
        g.dispose();
        req.getSession().setAttribute("captcha", var15);
        ImageIO.write(image, "PNG", response.getOutputStream());
    }

    private Color getRandColor() {
        Random random = new Random();
        int r = random.nextInt(200);
        int g = random.nextInt(200);
        int b = random.nextInt(200);
        return new Color(r, g, b);
    }

    private String getRandomString(int len) {
        char[] chars = ConstUtil.VALIDATE_CODE_CHAR.toCharArray();
        String str = "";

        for(int i = 0; i < len; ++i) {
            char c = chars[(new Random()).nextInt(ConstUtil.VALIDATE_CODE_CHAR.length())];
            str = str + String.valueOf(c);
        }

        return str;
    }

    private Font loadFont(String fontFileName, float fontSize) {
        try {
            File e = new File(fontFileName);
            FileInputStream aixing = new FileInputStream(e);
            Font dynamicFont = Font.createFont(0, aixing);
            Font dynamicFontPt = dynamicFont.deriveFont(fontSize);
            aixing.close();
            return dynamicFontPt;
        } catch (Exception var6) {
            var6.printStackTrace();
            return new Font("宋体", 0, 14);
        }
    }
}
