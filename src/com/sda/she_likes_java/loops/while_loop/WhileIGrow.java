package com.sda.she_likes_java.loops.while_loop;

public class WhileIGrow {

    public static void main(String[] args) {
        int ageOfTheKid = 1;

        while (ageOfTheKid <= 18) {
            System.out.println("Mommy can I go to disco??");
            System.out.println("No");

//            ageOfTheKid = ageOfTheKid + 1;
            ageOfTheKid++; //this is shorter version of: ageOfTheKid = geOfTheKid + 1;
        }

        System.out.println("I am " + ageOfTheKid + " years old, Mama: yes, go!");
    }
}
