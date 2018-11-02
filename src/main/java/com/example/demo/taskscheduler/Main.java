package com.example.demo.taskscheduler;

import com.example.demo.profile.DemoBean;
import com.example.demo.profile.ProfileConfig;
import com.example.demo.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);

    }
}
