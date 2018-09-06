package com.zjgj.cas.common.filter;

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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CaptchaServlet extends HttpServlet {
    private static String numberAndLetter = "abcdefghijklmnopqrstuvwxyz";

    public CaptchaServlet() {
    }
    @RequestMapping("/captcha.jpg")
    public void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0L);
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
        String var15 = getRandomString(4).toUpperCase();
        g.drawString(var15, 10, 35);
        g.dispose();
        req.getSession().setAttribute("captcha", var15);
        ImageIO.write(image, "PNG", response.getOutputStream());
    }

    public static Color getRandColor() {
        Random random = new Random();
        int r = random.nextInt(200);
        int g = random.nextInt(200);
        int b = random.nextInt(200);
        return new Color(r, g, b);
    }

    public static String getRandomString(int len) {
        char[] chars = numberAndLetter.toCharArray();
        String str = "";

        for(int i = 0; i < len; ++i) {
            char c = chars[(new Random()).nextInt(numberAndLetter.length())];
            str = str + String.valueOf(c);
        }

        return str;
    }

    public static Font loadFont(String fontFileName, float fontSize) {
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
