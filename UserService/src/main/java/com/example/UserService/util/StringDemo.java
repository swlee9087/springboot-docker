package com.example.UserService.util;

import lombok.Data;


public final class StringDemo {
    public final String concat(String s1, String s2){
        return s1.concat(s2);
    }
    public final String substring(String s, int idx){
        return s.substring(idx);
    }
    public final String substring(String s, int start, int end){
        return s.substring(start,end);
    }
    public final int compareTo(String s1, String s2){
        return s1.compareTo(s2);
    }
    public final int compareToIgnoreCase(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
    public final String removeHyphenInRegiNum(String regiNum){
        return regiNum.replace("-",""); //p263. 선분리 후붙임
    }
}
