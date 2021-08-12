package com.example.UserService.product.controller;

import com.example.UserService.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;  //2, red line so +@RdAC
}
