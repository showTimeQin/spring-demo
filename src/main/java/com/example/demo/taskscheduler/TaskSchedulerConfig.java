package com.example.demo.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.example.demo.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
