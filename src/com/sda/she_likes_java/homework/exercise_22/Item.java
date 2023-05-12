package com.sda.she_likes_java.homework.exercise_22;

import java.util.Objects;

//*Item is also the class to be created.
//It is to contain the following fields:
//- product name
//- product price.*
public class Item {
    private String productName;
    private double productPrice;

    public Item(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Double.compare(item.productPrice, productPrice) == 0 && productName.equals(item.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice);
    }

    @Override
    public String toString() {
        return "Item{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    public String getProductName() {
        return productName;
    }



    public double getProductPrice() {
        return productPrice;
    }


}
