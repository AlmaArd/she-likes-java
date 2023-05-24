package com.sda.she_likes_java.homework.exercise_28;


import java.util.Comparator;

public class SortingByItemLength implements Comparator<MyDate> {

    @Override
    public int compare(MyDate o1, MyDate o2) {
        System.out.println("Using Main Of MyDate class");
        return o2.getName().length() - o1.getName().length();
    }
}
