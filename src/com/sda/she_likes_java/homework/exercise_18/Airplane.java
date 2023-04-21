package com.sda.she_likes_java.homework.exercise_18;

import java.sql.SQLOutput;

public class Airplane {
    /*Exercise 18.
Create an Airplane class that provides the following operations:
- 1)takeOff
- 2)land
- 3)flyTo(int xCoordinates, int yCoordinates)
- 4)retrieve the current state of the aeroplane (flies/waits in hangar)
When implementing, remember that:
- the aircraft must be in the air to land
- you cannot take off if you are already in the air
- use variables to store internal state
- check the use of your class in the main method
     */

private int xCoordinates;
private int yCoordinates;
private int zCoordinates;


public void takeOff() {
    yCoordinates++;
    System.out.println("Plane, fly up");
}

public void flyTo(){
    xCoordinates++;
    zCoordinates++;
    System.out.println("Plane, fly to");

}
    public void land () {
        yCoordinates--;
        System.out.println("Plane, get down");
    }

    public Airplane(int xCoordinates, int yCoordinates, int zCoordinates) {
        this.xCoordinates = xCoordinates;
        this.yCoordinates = yCoordinates;
        this.zCoordinates = zCoordinates;
    }

    public String airplaneFlies() {
        return "";
    }
    public String airplaneWaitsInHangar() {
        return "";
    }
}

