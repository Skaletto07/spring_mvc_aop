package com.kostkin.mvc_hibernate_aop.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLoggingAspect {
    public static Logger log = LogManager.getLogger(MyLoggingAspect.class);

    @Around("execution(* com.kostkin.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMethodsAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String methodName = methodSignature.getName();

        log.debug("Begin of " + methodName);

        Object targetMethodResult = joinPoint.proceed();
        log.debug("End of " + methodName);
        return targetMethodResult;
    }



}
