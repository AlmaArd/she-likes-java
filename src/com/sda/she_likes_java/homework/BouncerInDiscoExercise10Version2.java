package com.sda.she_likes_java.homework;

import java.util.Scanner;
//Exercise 10.
//A story about bouncers in a disco
//Prepare a new class BouncersInDiscoStory and in it
//- get the user’s age, ability to sing well and height from the console
//- there are two bouncers in the disco: young and old
//- Young checks if the person is adult, tall (or short :)) and can sing well
//- Old has some kind of sight problem - so if any of the conditions are met, the person can enter the disco
//- people try to cheat, so if someone is rejected by the young bouncer they try again with the old one:)

public class BouncerInDiscoExercise10Version2 {
    public static void main(String[] args) {
        System.out.println("Exercise 10 - Bouncer in disco");

        System.out.println();

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Welcome to the disco, I am ");
        System.out.println(" And tell me what is Your height");
        int userAge = inputReader.nextInt();
        double userHeight = inputReader.nextDouble();
        boolean


        if (userAge >= 16) {
            if (userHeight > 1.6) {
                System.out.println("Please enter the disco");
            } else {
                System.out.println("You are too short, please leave");
            }
        } else {
            System.out.println("You are too young, please leave");
        }
    }
}
