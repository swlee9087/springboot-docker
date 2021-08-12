package com.example.UserService.inheritance;
//1
import lombok.Data;

import javax.persistence.Id;

@Data
public class ItemDto {
    @Id
    private long itemId;
}
