package com.example.lab4.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.lab4.service.*.*(..))")
    public void before(JoinPoint jp) {
        System.out.println("[AOP BEFORE] " + jp.getSignature());
    }

    @AfterReturning("execution(* com.example.lab4.service.*.*(..))")
    public void afterReturn(JoinPoint jp) {
        System.out.println("[AOP AFTER RETURN] " + jp.getSignature());
    }

    @AfterThrowing("execution(* com.example.lab4.service.*.*(..))")
    public void afterThrow(JoinPoint jp) {
        System.out.println("[AOP THROW] " + jp.getSignature());
    }
}
