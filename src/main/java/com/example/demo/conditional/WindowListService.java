package com.example.demo.conditional;

import org.springframework.stereotype.Service;

public class WindowListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
