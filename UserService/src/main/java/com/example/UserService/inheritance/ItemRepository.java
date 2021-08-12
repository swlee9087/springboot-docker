package com.example.UserService.inheritance;
//2
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<ItemDto,Long> {  //1 inheritance(=unified restraint)


}
