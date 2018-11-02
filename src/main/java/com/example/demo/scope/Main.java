package com.example.demo.scope;

import com.example.demo.aop.AopConfig;
import com.example.demo.aop.DemoAnnotationService;
import com.example.demo.aop.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
        System.out.println("s1是否与s2相等：" + s1.equals(s2));
        System.out.println("p1是否与p2相等：" + p1.equals(p2));
        context.close();
    }
}
