package com.example.UserService.inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class FriendTest {
    @Mock Friend friend;
    @Mock UniFriend uniFriend;
    @Mock CompFriend compFriend;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        uniFriend=new UniFriend("Brad Pitt","CompSci","010-0001");
        compFriend=new CompFriend("Jennifer Aniston","Accounting","010-0002");
        friend=new Friend("Angelina Jolie","010-0003");
    }
    @Test
    public void test_showDetail(){
        assertEquals("Angelina Jolie",friend.getName());
        assertEquals("CompSci",uniFriend.getMajor());
        assertEquals("Accounting",compFriend.getDepartment());
        assertEquals("010-0002",friend.getPhone());

    }
}  // NOGADA