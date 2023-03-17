package com.sda.she_likes_java.homework;

// A story about bouncers in a disco
//Prepare a new class BouncersInDiscoStory and in it
//- get the user’s age, ability to sing well and height from the console
//- there are two bouncers in the disco: young and old
//- Young checks if the person is adult, tall (or short :)) and can sing well
//- Old has some kind of sight problem - so if any of the conditions are met, the person can enter the disco
//- people try to cheat, so if someone is rejected by the young bouncer they try again with the old one:)

import java.util.Scanner;

public class BouncerInDiscoExercise10WithFunctions {
    public static void main(String[] args) {
        System.out.println("Hello, I am young bouncer");

        System.out.println("I am checking Your age, height and ability to sing");


        int age;
        int height;
        boolean canSing;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("First let me know Your age now");
        age = inputReader.nextInt();


        System.out.println("Now let me know Your height: ");
        height = inputReader.nextInt();

        System.out.println("Please sing to me now: ");
        canSing = inputReader.nextBoolean();


        boolean isAllowedToParty = checkedByYoungBouncer(age, height, canSing);


        if (isAllowedToParty) {
            System.out.println("Welcome to the disco!!!");
        } else {
            System.out.println("Sorry, go home");
            System.out.println("I'll try with second bouncer");

            System.out.println("Hello , I am old bouncer");
            System.out.println("I am checking Your age, height and ability to sing");
            System.out.println("How old are You? ");
            age = inputReader.nextInt();

            System.out.println("Now let me know Your height: ");
            height = inputReader.nextInt();

            System.out.println("Can You sing Well?  ");
            canSing = inputReader.nextBoolean();

            isAllowedToParty = checkedByOldBouncer(age, height, canSing);

            if (isAllowedToParty) {
                System.out.println("Have a great time at party!!!");
            } else {
                System.out.println("Sorry, go home");
            }
        }

    }

// first line is function prototype

    public static boolean checkedByYoungBouncer(int age, int height, boolean canSing) {
        return age >=18 && height >200 && canSing == true;
    }

    public static boolean checkedByOldBouncer (int age, int height, boolean canSing) {
        return age >=18 || height >200 || canSing == true;
    }
}
