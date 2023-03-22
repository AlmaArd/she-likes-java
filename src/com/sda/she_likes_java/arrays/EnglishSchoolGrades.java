package com.sda.she_likes_java.arrays;

import java.util.Random;

public class EnglishSchoolGrades {
    public static void main(String[] args) {
        int[] myGradesOnEnglishClass = new int[10000];

        Random gradeGenerator = new Random(7);
        // initializing grades in some random scores - created virtual grades
        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            myGradesOnEnglishClass[index] = 1+ gradeGenerator.nextInt(6); //in PL max grade is 6; 1+ (6) - kad nebūtų 0
        }
        for (int index = 0; index < myGradesOnEnglishClass.length; index++) {
            System.out.println("my grade on index nr: " + index + " is: " + myGradesOnEnglishClass[index]);
        }
    }
}
