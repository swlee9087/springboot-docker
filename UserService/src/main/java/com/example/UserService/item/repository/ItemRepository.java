package com.example.UserService.item.repository;

import com.example.UserService.item.entity.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ItemRepository extends ReactiveCrudRepository<Item,String> {
//    itemRepository.save(new Item("Alf alarm clock", 19.99)).subscribe()
}
