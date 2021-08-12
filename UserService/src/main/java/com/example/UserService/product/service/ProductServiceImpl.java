package com.example.UserService.product.service;

import com.example.UserService.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ProductServiceImpl {
    private final ProductRepository productRepository;
}
