package com.example.UserService.person;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)

class PersonTest {
    @Mock     Person jung; //p243 2인 정보
    @Mock     Person hong;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        jung = new Person("335577","112233");
        hong = new Person("775544");
    }
    @Test
    void showPersonInfo(){
        assertEquals("335577",jung.getRegiNum());
        assertEquals("112233",jung.getPassNum());
        assertEquals("775544",hong.getRegiNum());
        assertEquals(null,hong.getPassNum());
    }



}