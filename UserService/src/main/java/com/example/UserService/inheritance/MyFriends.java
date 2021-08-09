package com.example.UserService.inheritance;

import lombok.Data;
import lombok.NoArgsConstructor;

public class MyFriends {
    public Friend[] getFriends() {
        Friend[] friends = new Friend[3];
        int count = 0;
        String[] names={"Brad Pitt", "Jennifer Aniston", "Angelina Jolie"};
        String[] majors={"CompSci","Accounting","Arts"};
        String[] departments={"IT","Finance","Marketing"};
        String[] phones={"010-0001","010-0002","010-0003"};
        for(int i=0;i<friends.length;i++){
//            if(i<2){
//                friends[i] = new UniFriend(names[i],majors[i],phones[i]);
//            }else{
//                friends[i] = new CompFriend(names[i],departments[i],phones[i]);
//            }
            friends[i] = (i<2) ? new UniFriend(names[i],majors[i],phones[i])
            : new CompFriend(names[i],departments[i-2],phones[i]);
        }
        return friends;
    }
    //Friend[] friends
}
@NoArgsConstructor
@Data class Friend{
    protected String name;
    protected String phone;
    public Friend(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
}
@Data final class UniFriend extends Friend{
    private String major;
    public UniFriend(String name, String major, String phone){
        super(name,phone);  //inherited
        this.major=major;
    }
    @Override
    public String toString(){
        return String.format("University Friend: %s %s %s",name,major,phone);
    }
}
@Data final class CompFriend extends Friend{
    private String department;
    public CompFriend(String name,String department,String phone){
        super(name,phone);
        this.department=department;
    }
    @Override
    public String toString(){
        return String.format("Company Friend: %s %s %s", name, department,phone);
    }
}