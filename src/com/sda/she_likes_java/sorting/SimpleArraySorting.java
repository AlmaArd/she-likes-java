package com.sda.she_likes_java.sorting;

import java.util.Arrays;

public class SimpleArraySorting {
    public static void main(String[] args) {
        int [] numbers = new int[4]; // in Java everything except primitive is an object. Array of the primitive is primitive too

        int [] numbers2 = {1, 2, 5, 4, -1};
        Object arrayObject = numbers2;
        System.out.println(numbers2.length);

        // Arrays - it's a class, contains useful methods for arrays
        // Collections - it's a class, contains useful methods for collections

        Arrays.sort(numbers2);
        System.out.println("numbers2: " + numbers2);
        System.out.println(Arrays.toString(numbers2));
    }
}
