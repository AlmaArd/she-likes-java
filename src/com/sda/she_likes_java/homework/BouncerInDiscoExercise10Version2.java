package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoExercise10Version2 {
    public static void main(String[] args) {
        System.out.println("Exercise 9 - Bouncer in disco");

        System.out.println();

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Welcome to the disco, tell me how old are You");
        System.out.println(" And tell me what is Your height");
        int userAge = inputReader.nextInt();
        double userHeight = inputReader.nextDouble();

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
