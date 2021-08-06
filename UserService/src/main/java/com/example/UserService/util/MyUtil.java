package com.example.UserService.util;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

// practice. --> MyUtilTest

public class MyUtil {
//    public String now(){
//        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
//    }
//    public String findChristmas(LocalDate today, String month, String date) {
//        // LocalDate today = ;
//        //System.out.println("today: " + LocalDate.now());
//
//        //LocalDate christmas = ;
//        //System.out.println("Christmas: " + LocalDate.of(LocalDate.now().getYear(), 12, 25));
//
//        //ocalDate eve = christmas.minusDays(1);
//        //return "Countdown to Christmas Eve: " + LocalDate.of(LocalDate.now().getYear(), 12, 25).minusDays(1);
//
//        //Period left = Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear(), 12, 25));
////        return "Days until Christmas: "
////                +Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear(), 12, 25)).getMonths()
////                + " Months and "+Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear(), 12, 25)).getDays()
////                +" Days. \n(Start saving up for those presents...)";
//        Period p = Period.between(today, LocalDate.of(today.getYear(), Integer.parseInt(month), Integer.parseInt(date)));
//        return String.format("%s 년 %s 개월, %s 일 남았습니다",p.getYears(), p.getMonths(), p.getDays());
//    }
    public String usedTime(String hour1, String min1, String sec1,
                           String hour2, String min2, String sec2){
        return "Total time: " + getTime((int)Duration.between(
                getLocalTime(hour1, min1, sec1),getLocalTime(hour2,min2,sec2)).getSeconds());
    }
    private LocalTime getLocalTime(String hour, String min, String sec){
        return LocalTime.of(Integer.parseInt(hour),Integer.parseInt(min),Integer.parseInt(sec));
    }
    private String getTime(int sec){
        int hour = sec/(60*60);
        int minute = (sec - hour*(60*60))/60 ;
        int second = sec%60;
        return String.format("%d Hours, %d Minutes, %d Seconds", hour, minute, second);
    }
//    public String now() {
//            LocalDateTime dt = LocalDateTime.now();
//            LocalDateTime mt2 = dt.plusHours(22);
//            mt2 = mt2.plusMinutes(35);
//            System.out.println("Conference Call with UK Buyer @ " + mt2);
//        }

}
