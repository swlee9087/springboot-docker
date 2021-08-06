package what;

import org.apache.tomcat.jni.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class DateTime {
    public String now(){
        return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
    public String findChristmas(LocalDate today, String month, String date) {
        // LocalDate today = ;
        //System.out.println("today: " + LocalDate.now());

        //LocalDate christmas = ;
        //System.out.println("Christmas: " + LocalDate.of(LocalDate.now().getYear(), 12, 25));

        //ocalDate eve = christmas.minusDays(1);
        //return "Countdown to Christmas Eve: " + LocalDate.of(LocalDate.now().getYear(), 12, 25).minusDays(1);

        //Period left = Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear(), 12, 25));
//        return "Days until Christmas: "
//                +Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear(), 12, 25)).getMonths()
//                + " Months and "+Period.between(LocalDate.now(), LocalDate.of(LocalDate.now().getYear(), 12, 25)).getDays()
//                +" Days. \n(Start saving up for those presents...)";
        Period p = Period.between(today, LocalDate.of(today.getYear(), Integer.parseInt(month), Integer.parseInt(date)));
        return String.format("%s 년 %s 개월, %s 일 남았습니다",p.getYears(), p.getMonths(), p.getDays());
    }
}
