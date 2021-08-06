package com.example.UserService.util;
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
class MyCalculatorTest {
    @Mock
    MyCalculator myCalculator;
    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
        myCalculator = new MyCalculator();
    }
    @DisplayName("does this calculator work?")

    @Test
    void plus() {
        //System.out.println("Plus: "+);
        assertEquals(6, myCalculator.plus(3,9));
    }

    @Test
    void minus() {
        //System.out.println("Minus: "+);
        assertEquals(7, myCalculator.minus(9,2));
    }

    @Test
    void multiply() {
        //System.out.println("Multiply: "+);
        assertEquals(12, myCalculator.multiply(4,3));
    }

    @Test
    void divide() {
        //System.out.println("Divide: "+myCalculator.divide(8,2));
        assertEquals(4, myCalculator.divide(8,2));
    }

    @Test
    void remainder() {
        //System.out.println("Remainder: "+);
        assertEquals(1, myCalculator.remainder(7,3));
    }
}