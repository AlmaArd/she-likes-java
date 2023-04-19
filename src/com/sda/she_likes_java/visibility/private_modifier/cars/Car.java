package com.sda.she_likes_java.visibility.private_modifier.cars;

// it's not possisble to mark class as private
public class Car {
    private String brand;
    public String model;


    public String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    String colour;
}
