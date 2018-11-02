package com.example.demo.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppleConfig {
    @Bean
    public AppleService appleService(){return new AppleService();}

    @Bean
    public UseAppleService useAppleService(){
        UseAppleService useAppleService = new UseAppleService();
        useAppleService.setAppleService(appleService());
        return useAppleService;
    }

    @Bean
    public UseAppleService useAppleService(AppleService appleService){
        UseAppleService useAppleService = new UseAppleService();
        useAppleService.setAppleService(appleService);
        return useAppleService;
    }
}
