package com.sda.she_likes_java.homework.exercise_18;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Airplane myAirplane = new Airplane();
        myAirplane.takeOff();
        myAirplane.takeOff();
        System.out.println("Let's go to Vilnius");
        myAirplane.flyTo(25, 54);
        myAirplane.land();
        myAirplane.land();
    }
}
