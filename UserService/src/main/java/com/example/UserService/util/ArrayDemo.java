package com.example.UserService.util;

import java.util.Arrays;

public class ArrayDemo {

    public int[] fill(int number){
        int[] arr = new int[10];
        Arrays.fill(arr, 7);
        return arr;
    }
    public int[] copy(int[] param, int initVal,int start, int length){
        int[] arr = new int[10];
        System.arraycopy(param,initVal,arr,start,length);
        return arr;
    }

}
