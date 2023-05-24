package com.sda.she_likes_java.homework.exercise_28;
// my date for exercise 28 from exercise 27
import java.util.Objects;

public class MyDate  {

    private String name;

    @Override
    public String toString() {
        return "MyDate{" +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }


    public MyDate(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(name, myDate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}
