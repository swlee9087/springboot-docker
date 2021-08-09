package com.example.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController  //microservice type ctrlr unlike monolithic ctrlr
public final class HomeController {
    @GetMapping("/")
    public String home(){
        return new SimpleDateFormat("yyyy-MM-dd hh:MM:ss").format(new Date());
        //2 objs into 1
    }
}