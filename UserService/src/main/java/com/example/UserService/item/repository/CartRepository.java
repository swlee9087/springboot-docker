package com.example.UserService.item.repository;

import com.example.UserService.item.entity.Cart;
import com.example.UserService.item.entity.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CartRepository extends ReactiveCrudRepository<Cart,String> {


}
