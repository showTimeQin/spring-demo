package com.example.demo.initanddestroy;

import com.example.demo.scope.DemoPrototypeService;
import com.example.demo.scope.DemoSingletonService;
import com.example.demo.scope.ScopeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }
}
