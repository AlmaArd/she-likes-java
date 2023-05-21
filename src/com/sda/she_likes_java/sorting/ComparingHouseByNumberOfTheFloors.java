package com.sda.she_likes_java.sorting;

import java.util.Comparator;

public class ComparingHouseByNumberOfTheFloors implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        int firsHouseNumberOfFloors = o1.getNumberOfFloors();
        int secondHouseNumberOfFloors = o2.getNumberOfFloors();

        return 0;
    }
}
