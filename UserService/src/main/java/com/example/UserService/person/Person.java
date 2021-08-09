package com.example.UserService.person;


import lombok.Data;
//gsttr로 이뤄진 dto객체를 어떻게????

@Data
public final class Person {
    private String regiNum;
    private String passNum;

    Person(String rnum, String pnum){
        regiNum = rnum;
        passNum = pnum;
    }
    Person(String rnum){ //overloading
        regiNum = rnum;

    }
//    void showPersonalInfo(){
//        System.out.println("주민등록번호; " +regiNum);
//        if(passNum != 0)
//            System.out.println("여권번호: "+passNum+'\n');
//        else
//            System.out.println("여권 없어요. \n");
//    }
}
