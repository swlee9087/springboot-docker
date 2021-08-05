package com.example.UserService.item.controller;

import com.example.UserService.item.repository.ItemRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ItemController {
    @GetMapping
    Mono<?> home(){
        return null;
    }
    //p87
    @PostMapping("/add/{id}")
    Mono<String> addToCart(@PathVariable String id){
        return null;
    }
}
