package com.example.UserService.util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class MyUtilTest {
    @Mock
    MyUtil myUtil;
    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        myUtil = new MyUtil();
    }
    @DisplayName("Print Current Time")

    @Test
//    void now() {
//        System.out.println(myUtil.now());
//    }
    void test_usedTime(){
        System.out.println(myUtil.usedTime("9","30","00","18","00","00"));
    }
}