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

        Scanner inputReader = new Scanner(System.in);

        String declineMessage = "Sorry, go home:)";
        int age = inputReader.nextInt();
        System.out.println("Now let me know Your height: ");
        double height = inputReader.nextDouble();
        System.out.println("Please sing to me now: ");
        boolean canSing = inputReader.hasNextBoolean();

        boolean isAllowedToPartyYoung = age >= 18 && height >= 2.0 && canSing;
        boolean isNotAllowedToPartyYoung = age < 18 || height < 2.0 || !canSing;
        boolean isAllowedToPartyOld = age >= 18 || height >= 2.0 || canSing;

        if (!isAllowedToPartyYoung) {
            System.out.println("Hello , I am old bouncer");
            System.out.println("I am checking Your age, height and ability to sing");
            System.out.println("Let me know Your age");
            System.out.println("Now let me know Your height: ");
            System.out.println("Please sing to me now: ");
            if (isAllowedToPartyOld) {
                System.out.println("Have a great time at party!!!");
            } else {
                System.out.println(declineMessage);
            }
        } else {
            System.out.println(declineMessage);
        }
    }
}

// if (age >= 18) {
//                System.out.println("Ok, so You're adult:)");
//                System.out.println("Let me know Your height: ");
//                int height = inputReader.nextInt();
//                if (height >= 200) {
//                    System.out.println("Great!!!! Welcome to the party:)");
//                } else {
//                    System.out.println(declineMessage);
//                }
//            } else {
//                System.out.println(declineMessage);
//            }
//        }
//    }