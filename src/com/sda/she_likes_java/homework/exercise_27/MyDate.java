package com.sda.she_likes_java.homework.exercise_27;
//Create a MyDate class containing three fields:
//- year - of type int
//- month - of type int
//- day - of type int
//Implement the Comparable interface for your class.
//Create a Main class, add four MyDate objects to the list and perform sorting.

import java.util.Objects;

public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;
    private final String name;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public MyDate(int year, int month, int day, String name) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day && Objects.equals(name, myDate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day, name);
    }

    @Override
    public int compareTo(MyDate o) {
        return year - o.getYear();
    }
}
