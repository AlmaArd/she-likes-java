package com.sda.she_likes_java.enumerable;


import java.util.List;

public class SeasonsExample {
    public static void main(String[] args) {
        // Person me = new Person();
        // Person me2 = new Person();
        // Person me3 = new Person();
        // Person me4 = new Person();

        Seasons myFavouriteOne = Seasons.SUMMER;
        System.out.println("Average temp during summer is: "
                + myFavouriteOne.getAverageTemp());
        System.out.println("Summer's activity: " +myFavouriteOne.getActivity());

        Seasons autumn = Seasons.AUTUMN;
        System.out.println("summer: " +myFavouriteOne);

        // we can create list for instances
        List<Seasons> seasonsList = List.of (
                Seasons.WINTER,
                Seasons.AUTUMN
        );
    }
}
