package com.sda.she_likes_java.controls;

import java.util.Scanner;

public class WeekdaysWithIf {

    public static void main(String[] args) {
        // 1..7
        // 1 means monday
        // 7 means sunday
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Hey, provide the ordinal number of weekday: ");
        int ordinalNumberOfWeekday = inputReader.nextInt();
        if (ordinalNumberOfWeekday == 1) {
            System.out.println("It's Monday");
        } else if (ordinalNumberOfWeekday == 2) {
            System.out.println("It's Tuesday");
        } else if (ordinalNumberOfWeekday == 3) {
            System.out.println("It's Wednesday");
        } else if (ordinalNumberOfWeekday == 4) {
            System.out.println("It's Thursday");
        } else if (ordinalNumberOfWeekday == 5) {
            System.out.println("It's Friday");
        } else if (ordinalNumberOfWeekday == 6) {
            System.out.println("It's Saturday");
        } else if (ordinalNumberOfWeekday == 7) {
            System.out.println("It's Sunday");
        } else {
            System.out.println("Don't cheat!!!");
        }
    }
}
