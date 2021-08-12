package com.example.UserService.inheritance;
//3
import com.example.UserService.inheritance.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;  //cannot GSetter, so +final +@RqAC


}
