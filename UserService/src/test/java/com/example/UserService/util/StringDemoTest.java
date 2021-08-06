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
class StringDemoTest {
    @Mock
    StringDemo stringDemo;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        stringDemo = new StringDemo();
    }

    @Test
    void concat() {
        assertEquals("BananaBread", stringDemo.concat("Banana","Bread"));
        }

    @Test
    void substring() {
        assertEquals("efg", stringDemo.substring("cdefg",2));
    }

    @Test
    void testSubstring() {
        assertEquals("ef", stringDemo.substring("cdefg",2, 4));
    }

    @Test
    void compareTo() {  //overload
        assertEquals("0", stringDemo.compareTo("murder","murder"));
    }

    @Test
    void compareToIgnoreCase() {
        assertEquals("0", stringDemo.compareToIgnoreCase("abc","ABC"));
    }

    @Test
    void removeHyphenInRegiNum() {
        assertEquals("1122334455667", stringDemo.removeHyphenInRegiNum("112233-4455667"));
    }
}