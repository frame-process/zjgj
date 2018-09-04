package com.zjgj.uc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.zjgj.uc.util.JsonResult;
import com.zjgj.uc.util.ResultCode;

@Aspect
@Component
public class ServiceAspect {
	
    private Logger logger = LoggerFactory.getLogger(ServiceAspect.class);
    @Value("${app.name}")
    private String appName;

    @Pointcut("execution (public * com.zjgj.uc.*.impl.*.*(..))")
    private void definePointcut(){
    }

	@Around("definePointcut()")
    public Object notify(ProceedingJoinPoint pjp) {
        //获取类名.方法名
        String classAndMethodName = pjp.getSignature().toShortString();
        String packClssMeth = pjp.getTarget().getClass().getPackage().getName() + "." + classAndMethodName;
        try {
            logger.info("业务调用[{}],入参:{}", classAndMethodName, JSON.toJSONString(pjp.getArgs()));
        	//执行
            Object result = pjp.proceed();
            logger.info("业务调用[{}],返回值:{}", classAndMethodName, JSON.toJSONString(result));
            return result;
        } catch (Exception exception) {
            logger.error("调用的方法【{}】,入参：{}",
                    classAndMethodName, JSON.toJSONString(pjp.getArgs()), exception);
            return JsonResult.fail(ResultCode.ERROR);
        } catch (Throwable throwable) {
            logger.error("调用的方法【{}】,入参：{}",
                    classAndMethodName, JSON.toJSONString(pjp.getArgs()), throwable);
            return JsonResult.fail(ResultCode.ERROR);
        } finally {
        	
        }
    }
}
