package com.sda.she_likes_java.homework;

import java.util.Random;
import java.util.Scanner;

// Draw three numbers using the Random.nextInt() function.
//Sort them and output them from smallest to largest.
public class Exercise13NumbersWithRandomNextInt {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber1 = numberGenerator.nextInt(20);
        int someRandomNumber2 = numberGenerator.nextInt(20);
        int someRandomNumber3 = numberGenerator.nextInt(20);
        System.out.println(" Your 1st random number is - " + someRandomNumber1);
        System.out.println(" Your 2nd random number is - " + someRandomNumber2);
        System.out.println(" Your 3rd random number is - " + someRandomNumber3);
        if (someRandomNumber1 < someRandomNumber2 && someRandomNumber1 < someRandomNumber3 && someRandomNumber2 < someRandomNumber3) {
            System.out.println(someRandomNumber1);
            System.out.println(someRandomNumber2);
            System.out.println(someRandomNumber3);
            if (someRandomNumber2 < someRandomNumber1 && someRandomNumber2 < someRandomNumber3 && someRandomNumber1 < someRandomNumber3) {
                System.out.println(someRandomNumber2);
                System.out.println(someRandomNumber1);
                System.out.println(someRandomNumber3);
                if (someRandomNumber3 < someRandomNumber2 && someRandomNumber2 < someRandomNumber1 && someRandomNumber3 < someRandomNumber1) {
                    System.out.println(someRandomNumber3);
                    System.out.println(someRandomNumber2);
                    System.out.println(someRandomNumber1);
                    if (someRandomNumber2 < someRandomNumber3 && someRandomNumber2 < someRandomNumber1 && someRandomNumber3 < someRandomNumber1) {
                        System.out.println(someRandomNumber2);
                        System.out.println(someRandomNumber3);
                        System.out.println(someRandomNumber1);
                        if (someRandomNumber1 < someRandomNumber3 && someRandomNumber1 < someRandomNumber2 && someRandomNumber3 < someRandomNumber2) {
                            System.out.println(someRandomNumber1);
                            System.out.println(someRandomNumber3);
                            System.out.println(someRandomNumber2);
                            if (someRandomNumber3 < someRandomNumber1 && someRandomNumber1 < someRandomNumber2 && someRandomNumber3 < someRandomNumber2) {
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println(someRandomNumber3);
            System.out.println(someRandomNumber1);
            System.out.println(someRandomNumber2);
        }
    }
}
