package com.example.UserService.product.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Product {
    @Id
    public String productId;

}
