package com.sda.she_likes_java.homework.exercise_22;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lets buy some products for dinner");

        ShoppingCart shoppingCart = new ShoppingCart();
        Item milk = new Item("Dobilas", 1.8);
        Item bread = new Item("Agota", 2.1);
        Item yogurt = new Item("Smilga", 1.5);

        shoppingCart.addProductToBasket(milk);
        shoppingCart.addProductToBasket(bread);
        shoppingCart.addProductToBasket(yogurt);
        System.out.println("Display products in the shopping cart");

        shoppingCart.displayProducts();

        System.out.println("The total price of the basket of products is: " + shoppingCart.calculateTotalBasketValue());

    }
}
