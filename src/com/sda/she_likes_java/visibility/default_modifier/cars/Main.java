package com.sda.she_likes_java.visibility.default_modifier.cars;

public class Main {
    public static void main(String[] args) {
        // I'm refering to the class iside the same package.
        // Thats why we can use class Car, which is default but in the same package cars
        Car carWithDefaultVisibility = new Car();
    }
}
