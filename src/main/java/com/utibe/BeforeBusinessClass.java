package com.utibe;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Aspect
public class BeforeBusinessClass {

    private static final Logger logger = LogManager.getLogger();

    @Before("setNamePointcut()")
    public void beforeLoggingAdvice(){
        logger.info("Now ENTERING method getName() of class Business class");
    }

    @After("setNamePointcut()")
    public void afterLoggingAdvice(){
        logger.info("Now EXITING method getName() of class Business class");
    }

    @Pointcut("execution(public void com.utibe.BusinessClass.setName(String))")
    public void setNamePointcut(){}


}


