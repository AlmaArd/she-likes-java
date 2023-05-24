package com.sda.she_likes_java.homework.exercise_28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyDate> myDate = new ArrayList<>();

        myDate.add(new MyDate("February16th"));
        myDate.add(new MyDate("March11th"));
        myDate.add(new MyDate("January13th"));
        myDate.add(new MyDate("May1st"));
        myDate.add(new MyDate("June24th"));
        myDate.add(new MyDate("July6th"));

        Collections.sort(myDate, new SortingByItemLength());
        System.out.println("My sorted dates names: " +myDate);
    }
}
