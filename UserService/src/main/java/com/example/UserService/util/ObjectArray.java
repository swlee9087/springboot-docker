package com.example.UserService.util;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
class Product{
    private final int productId;
    private final String description;   //final = no more changes allowed
}
public final class ObjectArray {
    public Product[] createCart(){
        Product[] cart = new Product[5];
        String[] productNames={"Coffee", "Computer","Apple","Dress","Fairytale Book"};
//        Product p1 = new Product(1, "Coffee");
//        Product p2 = new Product(2, "Computer");
//        Product p3 = new Product(3, "Apple");
//        Product p4 = new Product(4, "Dress");
//        Product p5 = new Product(5, "Fairytale Book");

//        for(int i=0; i<cart.length;i++){
//            cart[i]= new Product(i+1,productNames[i+1]);
//        }
        for(int i=0; i< cart.length;i++){
            cart[i]=new Product(i+1, productNames[i]);
        }
        return cart;
    }

}
