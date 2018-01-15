package com.hujian.girl.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.hujian.girl.controllers.GirlController.*(..))")
    public void log() {

    }
    @Before("log()")
    public void doBefore() {
        logger.info("Before");
    }

    @After("log()")
    public void doAfter() {
        logger.info("After");
    }
}
