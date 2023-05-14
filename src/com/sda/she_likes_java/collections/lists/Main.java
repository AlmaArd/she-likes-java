package com.sda.she_likes_java.collections.lists;

import com.sda.she_likes_java.collections.sets.Trousers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        a = 6;

        final int b = 7; // final - modifier, jį uždedant prieš int, rneleidžia b keisti bv reikšmių
       // b = 8;
        List<Trousers> trousers = new ArrayList<>(); // Array list - is extendable
        trousers.add(new Trousers("jeans", "big star"));
        trousers.add(new Trousers("jeans", "primark"));

        showItemsFromTheList(trousers);
        // let's add another item to the list. After forts list You can add
        trousers.add(new Trousers("jeans", "primark"));

        // paprastesnis, naujesnis List sukurimas su limited number of items - 3 items , thats all. List.of - si frozen list
        List<Trousers> trousersList = List.of(
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star")
        );
        showItemsFromTheList(trousersList);  // we are not allowed to add item inside, only 3 items. Like below
       // trousers.add(new Trousers("jeans", "primark"));
        // we have to create new list - trousersList2
        List<Trousers> trousersList2 = List.of(
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star"),
                new Trousers("jeans", "big star")
        );


    }

    public static void showItemsFromTheList(List<Trousers> items) {
        // enhanced (patobulinta) for loop
        for (Trousers currentItem: items) {
            System.out.println(currentItem);
        }
        for (int i = 0; i < items.size(); i++) {
            Trousers currentItem = items.get(i);
            System.out.println(items.get(i));
        }

    }
}
