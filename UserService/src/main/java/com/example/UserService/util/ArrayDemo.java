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
    public int[] createIntegerArray(int start, int end){
//        int len = end - start;  //specify length btwn int start& end for array size below
//        int[] integerArray = new int[len];
//        int j = 0;
//        for(int i=start; i<end;i++){
//            integerArray[j] = i;
//            j++;
//        }
//        return integerArray;
//        int len = end - start;
//        int[] integerArray = new int[len];
//        int j=0;
//        for(int i=start; i<end; i++){  //1~8,i<len ==> 1234560; so X len
//            integerArray[j]=i;
//            j++;
//        } return integerArray;
//        int len=end - start;
//        int[]integerArray = new int[len];
//        int j=0;
//        for(int i=start; i<end; i++){
//            integerArray[j]=i;
//            j++;
//        } return integerArray;
//        int len = end - start;
//        int[]integerArray = new int[len];
//        int j=0;
//        for(int i=start; i<end; i++){
//            integerArray[j]=i;
//            j++;
//        }return integerArray;
//        int len = end - start;
//        int[]integerArray=new int[len];
//        int j=0;
//        for(int i=start;i<end;i++){
//            integerArray[j]=i;
//            j++;
//        }return integerArray;
        int len = end - start;
        int[]integerArray=new int[len];
        int j=0;
        for(int i=start;i<end;i++){
            integerArray[j]=i;
            j++;
        } return integerArray;
    }

}
