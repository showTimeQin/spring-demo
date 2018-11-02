package com.example.demo.event;

import com.example.demo.initanddestroy.BeanWayService;
import com.example.demo.initanddestroy.JSR250WayService;
import com.example.demo.initanddestroy.PrePostConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello event");
        context.close();
    }
}
