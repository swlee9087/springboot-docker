package com.example.UserService.dish;
// Flux<Dish> example Using Pub-Sub(Observer) Pattern

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Data
final class Dish{
    private String description;
    private boolean delivered = false;
    public static Dish deliver(Dish dish){
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }
    Dish(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public boolean isDelivered(){
        return delivered;
    }
    @Override
    public final String toString(){
        return "Dish{ description='"+description+'\''+", delivered="+delivered+'}';
        //return delivered ? description+" eaten" : description +" waiting for it";
    }
}
@Service  //add this to let USA refresh
final class KitchenService{
    Flux<Dish> getDishes(){
        return Flux.just(
                new Dish("Super Supreme Comination Pizza"),
                new Dish("Oven-baked Cheese Spaghetti with Meatballs"),
                new Dish("Hot Wings"),
                new Dish("Soft Drinks"),
                new Dish("A pack of smoke")
        );
    }
}

@RequiredArgsConstructor
final class SimpleServer{
    private final KitchenService kitchen;
    Flux<Dish> doingMyJob(){
        return this.kitchen.getDishes().map(dish -> Dish.deliver(dish));

    }
}

@RequiredArgsConstructor
final class PoliteServer{
    private final KitchenService kitchen;
    Flux<Dish> doingMyJob(){
        return this.kitchen.getDishes()
                .doOnNext(dish -> System.out.println("Here is your "+dish+"! Enjoy!"))
                .doOnError(error -> System.out.println("So sorry about "+error.getMessage()))
                .doOnComplete(()-> System.out.println("Thanks for coming!"))
                .map(Dish::deliver);
    }
}

public final class Restaurant {
    public void subscribe(){
        PoliteServer server=new PoliteServer(new KitchenService());
        server.doingMyJob().subscribe(
                dish -> System.out.println(dish),
                throwable -> System.out.println(throwable)
        );
    }
}
