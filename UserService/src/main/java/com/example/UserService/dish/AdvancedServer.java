package com.example.UserService.dish;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;


@Data
class Dish {
    private String description;
    private boolean delivered = false;

    Dish(String description){
        this.description = description;
    }

    public static Dish deliver(Dish dish){
        Dish deliveredDish = new Dish(dish.description);
        deliveredDish.delivered = true;
        return deliveredDish;
    }
    @Override
    public String toString(){
        return delivered ? description +" eat" : description +" wait";
    }
}
class KitchenService {
    Flux<Dish> getDishes(){
        return Flux.just(new Dish("Supreme Combination Pizza"),
                new Dish("Oven-baked Cheese Spaghetti"),
                new Dish("Hot Wings"));
    }
}
@RequiredArgsConstructor class PrototypeServer {
    private final KitchenService kitchen;
    Flux<Dish> doingMyJob(){
        return kitchen.getDishes().map(dish -> Dish.deliver((dish)));
    }
}
@RequiredArgsConstructor
class AdvancedServer {
    private final KitchenService kitchen;
    Flux<Dish> doingMyJob(){
        return kitchen.getDishes()
                .doOnNext(dish -> System.out.println(dish))
                .doOnError(error -> System.out.println(error.getMessage()))
                .doOnComplete(() -> System.out.println("All dishes have been served"))
                .map(Dish::deliver);
    }
}

public class Restaurant {
    public void subscribe() {
        AdvancedServer server = new AdvancedServer(new KitchenService());
        server.doingMyJob().subscribe(
                dish -> System.out.println(dish),
                throwable -> System.out.println(throwable)
        );
    }
}
