package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HouseProgram {
    public static void main(String[] args) {
        List<House> myHouses = new ArrayList<>();
        myHouses.add(new House(10, 2, 5, "Spain"));
        myHouses.add(new House(5, 2, 1, "Latvia"));
        myHouses.add(new House(4, 2, 1, "Estonia"));
        myHouses.add(new House(2, 1, 1, "Poland"));


        Collections.sort(myHouses);
        System.out.println("sorted by natural way: " + myHouses);

        ComparingHouseByNumberOfTheFloors comparingHouseByNumberOfFloors = new ComparingHouseByNumberOfTheFloors();
        HouseComparingByCountry houseComparingByCountry = new HouseComparingByCountry();
        Collections.sort(myHouses,
                comparingHouseByNumberOfFloors
                        .reversed()
                        .thenComparing(houseComparingByCountry));

    }
}
