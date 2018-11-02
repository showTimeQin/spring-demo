package com.example.demo.annotation;

import com.example.demo.aop.AopConfig;
import com.example.demo.aop.DemoAnnotationService;
import com.example.demo.aop.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String args[]){
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
//        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
//        System.out.println(useFunctionService.sayHello());
//        context.close();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppleConfig.class);
        UseAppleService useAppleService = context.getBean(UseAppleService.class);
        System.out.println(useAppleService.sayHello());
        context.close();

    }
}
