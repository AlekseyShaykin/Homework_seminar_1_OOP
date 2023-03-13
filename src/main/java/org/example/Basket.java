package org.example;

import lombok.Data;

import java.util.Arrays;


@Data


public class Basket {
    public String[] productInBasket;

    public String basketName;


    public Basket(String... productInBasket) {
        this.productInBasket = productInBasket;
    }

    public Basket(String basketName) {
        this.basketName = basketName;
    }


    @Override
    public String toString() {
        return "Basket: " + productInBasket + Arrays.toString(productInBasket);
    }

    public String[] getProductInBasket() {
        for (String i : productInBasket) {
            System.out.println(i);
        }
        return productInBasket;
    }

    public String getBasketName() {
        return basketName;
    }
}



