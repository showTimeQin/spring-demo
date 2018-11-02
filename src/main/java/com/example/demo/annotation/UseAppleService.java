package com.example.demo.annotation;

//不使用@Service
public class UseAppleService {
    private AppleService appleService;

    //不使用@Autowire
    public void setAppleService(AppleService appleService){
        this.appleService = appleService;
    }

    public String sayHello(){
        return appleService.sayHello("apple");
    }
}
