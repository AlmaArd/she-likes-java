package com.sda.she_likes_java.homework.exercise_22;

//Create a shopping cart class.
//Add as a field an items variable of type List<Item> - to store products.
//*Item is also the class to be created.
//It is to contain the following fields:
//- product name
//- product price.*
//The shopping cart class should provide the following operations:
//- add product to basket
//- displaying products in the shopping cart
//- calculation of the total basket value.
//Create a Main class and check the operations of your classes.

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class
ShoppingCart {

       private List<Item> items;
       public ShoppingCart() {
           this.items = new ArrayList<>();
       }
    public void addProductToBasket(Item product) {
        items.add(product);
    }

    public void displayProducts() {
        System.out.println("Items in shopping cart: " + items);
    }
    public double calculateTotalBasketValue() {
        double sum = 0;
        for (int i = 0; i < items.size(); i++) { // items.size - tai metodas pasakantis kiek prekių yra krepšelyje
            // items[i]
            //items.size() is like array.length
            // VAT 10
            sum += (items.get(i).getProductPrice()*1.23); // daugina iš VAT
        }
        return sum;
    }
}



