package com.sda.she_likes_java.homework.exercise_18;

import java.sql.SQLOutput;

public class Airplane {
    /*Exercise 18.
Create an Airplane class that provides the following operations:
- 1)takeOff
- 2)land
- 3)flyTo(int xCoordinates, int yCoordinates)
- 4)retrieve the current state of the airplane (flies/waits in hangar)
When implementing, remember that:
- the aircraft must be in the air to land
- you cannot take off if you are already in the air
- use variables to store internal state
- check the use of your class in the main method
     */

    private boolean isFlying;
    private int xCoordinatesOfDestiny;
    private int yCoordinatesOfDestiny;

    public boolean isFlying() {
        return isFlying;
    }

    public int getxCoordinatesOfDestiny() {
        return xCoordinatesOfDestiny;
    }

    public int getyCoordinatesOfDestiny() {
        return yCoordinatesOfDestiny;
    }

    public void takeOff() {
        if (!isFlying) {
            isFlying = true;
            System.out.println("take off in progress");
        } else {
            System.out.println("I've already started");
        }
    }

    public void land() {
        if (isFlying) {
            isFlying = false;
            System.out.println("landing in progress");
        } else {
            System.out.println("I've already landed");
        }
    }

    public void flyTo(int xCoordinatesOfDestiny, int yCoordinatesOfDestiny) {
        if (!isFlying) {
            System.out.println("I need to take off first");
        } else {
            System.out.println("Ok, let's go to: [%d, %d]".formatted(xCoordinatesOfDestiny, yCoordinatesOfDestiny));
            this.xCoordinatesOfDestiny = xCoordinatesOfDestiny;
            this.yCoordinatesOfDestiny = yCoordinatesOfDestiny;
        }
    }
}


