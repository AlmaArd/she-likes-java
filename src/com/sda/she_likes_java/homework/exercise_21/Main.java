package com.sda.she_likes_java.homework.exercise_21;

public class Main {
    public static void main(String[] args) {
        Ship justShip = new Ship();
        //ship reference = new Ship - object
        justShip.move();
        Vehicle ship = new Ship();
        justShip.move();
        ship.move();
        // ship. swim();
        ((Floating) ship).swim(); //Casting

        Vehicle airplane = new Airplane();
        airplane.move();
        ((Flying) airplane).fly();// this is casting

        Vehicle submarine = new Submarine();
        submarine.move();
        ((Diving) submarine).dive(); //this is casting

    }
}
