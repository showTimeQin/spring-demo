package com.example.demo.conditional;

public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
