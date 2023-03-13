package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;


@AllArgsConstructor
@NoArgsConstructor
public class Product {
    protected String name;
    protected int price;
    protected String range;

    public Product(String name) {
        this.name = name;
    }

    public void getName() {
        System.out.println(name);
    }


    @Override
    public String toString() {
        return "PRODUCT " +
                "name= " + name + "; price: " + price + "; range: " + range;
    }

}





