package com.sda.she_likes_java.homework.exercise_27;

import com.sda.she_likes_java.sorting.SortedPerson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MyDate march11th =new MyDate(1917,02, 16, "Day of the Restoration of the State of Lithuania");
        MyDate feb16th =new MyDate(1990,03, 11, "Day of the Restoration of Lithuania's independence");
        List<MyDate> dates = new ArrayList<>();
        dates.add(new MyDate(1917,02, 16, "Day of the Restoration of the State of Lithuania"));
        dates.add(new MyDate(1990,03, 11, "Day of the Restoration of Lithuania's Independence"));
        dates.add(new MyDate(2004,03, 29, "Lithuania joined NATO"));
        dates.add(new MyDate(1991,01, 13, "Defenders of Freedom Day"));

        Collections.sort(dates);

        march11th.compareTo(feb16th);
        System.out.println("After sorting: " +dates);



    }
}
