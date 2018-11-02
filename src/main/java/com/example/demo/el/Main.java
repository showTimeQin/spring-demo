package com.example.demo.el;

import com.example.demo.aop.AopConfig;
import com.example.demo.aop.DemoAnnotationService;
import com.example.demo.aop.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
