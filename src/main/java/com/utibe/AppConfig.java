package com.utibe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy //Enables @AspectJ
public class AppConfig {

    @Bean
    public BusinessClass generateBusinessClass(){
        return new BusinessClass("Effiong", 21);
    }

    @Bean
    public BeforeBusinessClass generateAspectBusinessClass(){
        return new BeforeBusinessClass();
    }

}