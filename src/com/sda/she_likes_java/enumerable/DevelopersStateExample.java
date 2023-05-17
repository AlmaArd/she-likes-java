package com.sda.she_likes_java.enumerable;

import java.sql.SQLOutput;

public class DevelopersStateExample {

    public static void main(String[] args) {
        System.out.println("Hey, let's start the day");

        ProgrammersStates myState = ProgrammersStates.NORMAL;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel: " + myState.getDescription());

        System.out.println("I've got new task. Great!!!");
        myState = ProgrammersStates.GOD_MODE;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel: " + myState.getDescription());


        System.out.println("after a while I'm exhausted - stupid task");
        myState = ProgrammersStates.EXHAUSTED;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel: " + myState.getDescription());

        myState = null;
        System.out.println("rebooting system:)");

        String one = "one-value";
        String two = one;

        if (one == two) {
            System.out.println("the same object pointed by one and two");
        }
        compareEnums(ProgrammersStates.GOD_MODE);
        System.out.println("Enums methods");
        System.out.println("name: " + ProgrammersStates.GOD_MODE.name());
        System.out.println("ordinal: " + ProgrammersStates.GOD_MODE.ordinal());
       ProgrammersStates [] allStates = ProgrammersStates.values();
        System.out.println("Should be NORMAL: " +allStates[2]);
    }



    public static void compareEnums(ProgrammersStates someState) {
        if (someState == ProgrammersStates.GOD_MODE) {
            System.out.println("Good mode enabled:)");
        }
    }
}
