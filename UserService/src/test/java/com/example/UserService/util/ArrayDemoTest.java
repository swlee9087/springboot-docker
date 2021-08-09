package com.example.UserService.util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class ArrayDemoTest {
    @Mock
    ArrayDemo arrayDemo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        arrayDemo = new ArrayDemo();
    }

    @Test
    void test_fill() {
        String s = "";
        int[] arr = arrayDemo.fill(7);
        for(int i : arr){s+=i;}
        assertEquals("7777777777",s);
    }

    @Test
    void test_copy() {
        String s = "";
        int[] arr = arrayDemo.copy(new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7, 7}, 0, 4, 2);
        for (int i : arr) {
            s += i;
        }
        assertEquals("7770077",s);
    }

    @Test
    void test_createIntegerArray(){
//        int[] arr = arrayDemo.createIntegerArray(1,6);
//        String s = "";
//        for(int e: arr){
//            s+=e;
//        }
//        assertEquals("12345",s);
//        int[]arr = arrayDemo.createIntegerArray(1,11);
//        String s = "";
//        for(int e:arr){
//            s+=e;
//        }assertEquals("12345678910",s);
//        String s="";
//        int[] arr= arrayDemo.createIntegerArray(1,8);
//        for(int e:arr){
//            s+=e;
//        }assertEquals("1234567",s);
//        String s="";
//        int[] arr= arrayDemo.createIntegerArray(1,9);
//        for(int e:arr){
//            s+=e;
//        }assertEquals("12345678",s);
//        String s="";
//        int[]arr= arrayDemo.createIntegerArray(1,4);
//        for(int e: arr){
//            s+=e;
//        }assertEquals("123",s);
        String s="";
        int[] arr= arrayDemo.createIntegerArray(3,9);
        for(int i:arr){
            s+=i;
        }assertEquals("345678",s);
    }
}