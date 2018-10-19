package com.dcm.springbootdemo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.persistence.Basic;

@Aspect
@Component
public class HttpAspect {

    private final static Logger logger= LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.dcm.springbootdemo.controller.UserController.*(..))")
    public void log()
    {
    }
    @Before("log()")
    public void doBefore()
    {
        logger.info("11111111111111111111");
    }
    @After("log()")
    public void logup()
    {
        logger.info("22222222222222222222");
    }
}
