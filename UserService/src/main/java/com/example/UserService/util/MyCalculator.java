package com.example.UserService.util;

public class MyCalculator {
    public String plus(int a, int b){
        return String.valueOf(a+b);
    }
    public String minus(int a, int b){
        return String.valueOf(a-b);
    }
    public String multiply(int a, int b){
        return String.valueOf(a*b);
    }
    public String divide(int a, int b){
        return String.valueOf(a/b);
    }
    public String remainder(int a, int b){
        return String.valueOf(a%b);
    }
}
