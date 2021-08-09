package com.example.UserService.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class BusinessManTest {
    @Mock BusinessMan businessMan;

    @BeforeEach
    void setUp() {
        businessMan = new BusinessMan("Naver","Developer");
        businessMan.setName("LEE Sun Shin");
    }
    @DisplayName("inheritance example")
    @Test
    public void test_showName(){
        assertEquals("LEE Sun Shin",businessMan.getName());
        assertEquals("Naver",businessMan.getCompany());
        assertEquals("Developer",businessMan.getPosition());
    }
}