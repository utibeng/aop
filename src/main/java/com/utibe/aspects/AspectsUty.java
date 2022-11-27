package com.utibe.aspects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectsUty {
    private static final Logger logger = LogManager.getLogger();

    @Before("setNamePointcut()")
    public void beforeLoggingAdvice(){
        logger.info("Now ENTERING method getName() of class Business class");
    }

    @After("setNamePointcut()")
    public void afterLoggingAdvice(){
        logger.info("Generic Pointcut: Now EXITING method getName() of class Business class");
    }

    //@Pointcut("execution(public void com.utibe.BusinessClass.setName(String))")
    //public void setNamePointcut(){}

    //execution(void m(..))

    @Pointcut( "execution(public void com.utibe.BusinessClass.*(..) )" )
    public void setNamePointcut(){}
}
