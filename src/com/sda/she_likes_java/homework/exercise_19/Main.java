package com.sda.she_likes_java.homework.exercise_19;

public class Main {
    public static void main(String[] args) {
        Vehicle someVehicle = new Vehicle();
        Ship myShip = new Ship();
        Plane myPlane = new Plane();

        callVehicle(someVehicle);
        System.out.println("");

        callVehicle(myShip);
        System.out.println("");

        callVehicle(myPlane);
        System.out.println("");


    }

    public static void callVehicle(Vehicle vehicle) {
        vehicle.move();
    }
    public static void callVehicle(Ship vehicle) {
        vehicle.move();
    }
    public static void callVehicle(Plane vehicle) {
        vehicle.move();
    }
}


