package com.sda.she_likes_java.homework;

// A story about bouncers in a disco
//Prepare a new class BouncersInDiscoStory and in it
//- get the user’s age, ability to sing well and height from the console
//- there are two bouncers in the disco: young and old
//- Young checks if the person is adult, tall (or short :)) and can sing well
//- Old has some kind of sight problem - so if any of the conditions are met, the person can enter the disco
//- people try to cheat, so if someone is rejected by the young bouncer they try again with the old one:)

import java.util.Scanner;

public class BouncerInDiscoExercise10 {
    public static void main(String[] args) {
        System.out.println("Hello, I am young bouncer");
        System.out.println("I am checking Your age, height and ability to sing");
        System.out.println("First let me know Your age now");

        int age;
        double height;
        boolean canSing;

        Scanner inputReader = new Scanner(System.in);
        age = inputReader.nextInt();

        String declineMessage = "Sorry, go home:)";

        System.out.println("Now let me know Your height: ");
        height = inputReader.nextDouble();

        System.out.println("Please sing to me now: ");
        canSing = inputReader.hasNextBoolean();



        boolean isAllowedToPartyYoung = age >= 18 && height >= 2.0 && canSing;
        boolean isNotAllowedToPartyYoung = age < 18 || height < 2.0 || !canSing;
        boolean isAllowedToPartyOld = age >= 18 || height >= 2.0 || canSing;

        if (isAllowedToPartyYoung) {
        } else {
            System.out.println(declineMessage);

            System.out.println("Hello , I am old bouncer");
            System.out.println("I am checking Your age, height and ability to sing");

            System.out.println("Let me know Your age");
            age = inputReader.nextInt();

            System.out.println("Now let me know Your height: ");
            height = inputReader.nextDouble();
            canSing = inputReader.hasNextBoolean();

            System.out.println("Please sing to me now: ");
            canSing = inputReader.hasNextBoolean();

            if (isAllowedToPartyOld) {
                System.out.println("Have a great time at party!!!");

            }
        }
            System.out.println(declineMessage);
        }
    }

