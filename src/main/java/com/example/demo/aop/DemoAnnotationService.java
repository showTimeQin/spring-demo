package com.example.demo.aop;

import com.example.demo.aop.Action;
import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截得add操作")
    public void add(){}
}
