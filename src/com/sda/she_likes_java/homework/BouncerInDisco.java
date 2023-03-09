package com.sda.she_likes_java.homework;

import java.util.Scanner;

//Exercise 9.
//Bouncer in a disco
//Prepare a new class BouncerInDisco and in it
//- get the user’s age and height from the console
//- only people who are at least 16 years old and taller (or shorter than - at your choice) can enter the disco
//- print a text saying how the verification went in both cases
public class BouncerInDisco {
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
