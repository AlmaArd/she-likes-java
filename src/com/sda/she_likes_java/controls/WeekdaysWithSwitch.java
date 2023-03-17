package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class WeekdaysWithSwitch {

    public static void main(String[] args) {
        // 1..7
        // 1 means monday
        // 7 means sunday
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Hey, provide the ordinal number of weekday: ");
        int ordinalNumberOfWeekday = inputReader.nextInt();

        switch (ordinalNumberOfWeekday) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                System.out.println("Weekend is about to start");
               // break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
            default:
                System.out.println("Don't cheat!!!");
        }

    }
}

