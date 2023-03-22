package com.sda.she_likes_java.homework;

import java.util.Random;

public class Exercise13ArrayWith100Elemets {
    public static void main(String[] args) {
        //Create an int array with 100 elements
        //Initialise each element with a value 3 times greater than the current index
        //e.g.
        //numbers[0] = 3 * 0 - mano kode vadinasi "element"
        //numbers[10] = 3 * 10.
        /*

         */
        //Create an int array with 100 elements
        int[] element = new int[100];
        // Random elementGenerator = new Random(3);

        // initialization phase
        // first index is: 0
        // last index is: element.length - 1
        for (int i = 0; i < element.length; i++) { // i = 0 first element
            System.out.println("Current value of i is: [" +i + "]");
            element[i] = 3 * i;
            // numbers[i-1 ]; i - can be below 0
        }
        // read data from last element till firs element
        for (int i = element.length -1; i > -1; i--) { // i = numbers.length last element; Nenaudoti direct values, kaip 99
            // jeigu nori i > -1 kitaip rasyti, i >=0
            System.out.println("element[" + i + "] is: " + element[i]);
        }

    }
}
