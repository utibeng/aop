package com.utibe;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BusinessClass businessClass = (BusinessClass) context.getBean(BusinessClass.class);

        businessClass.setName( "CCC" );
        //manager.createEmployee(new EmployeeDTO());

    }
}