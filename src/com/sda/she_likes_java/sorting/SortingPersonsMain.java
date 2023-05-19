package com.sda.she_likes_java.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingPersonsMain {
    public static void main(String[] args) {
        SortedPerson olaf = new SortedPerson("Olaf", 22);
        SortedPerson gustaw = new SortedPerson("Gustaw", 11);
        SortedPerson zorro = new SortedPerson("Zorro", 11);
        SortedPerson zorra = new SortedPerson("Zorra", 11);
        List<SortedPerson> persons = new ArrayList<>();
        persons.add(olaf);
        persons.add(gustaw);
        persons.add(zorro);
        persons.add(zorro);
        persons.add(zorra);

        Collections.sort(persons);
        System.out.println("After sorting: " + persons);

        // if returns -1 that means: olaf, gustaw
        // if returns 1 that means: gustaw, olaf
        //System.out.println("olaf.compareTo(gustaw); " + olaf.compareTo(gustaw));
        // its says hey Olaf please compare yourself to gustaw
        Comparator<SortedPerson> reversedAgeOrder = new AgedReversedOrderOfSortedPersons();
        Collections.sort(persons, reversedAgeOrder);
        System.out.println("Reversed order based on age: " + persons);


        List<String> names = new ArrayList<>();
        names.add("Ramune");
        names.add("Lina");
        names.add("Alma");
        names.add("Karolina");
        Collections.sort(names);
        System.out.println("sorted names: " + names);

        Collections.sort(persons, new LexicalOrderForSortedPerson());
        System.out.println("persons sorted by name: " + persons);

        Collections.sort(persons, new ReverseLexicalOrderForSortedPerson());
        System.out.println("persons sorted by name - reverse: " + persons);
    }
}
