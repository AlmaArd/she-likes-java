package com.sda.she_likes_java.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class MyGreatDictionary {
    private List<WordsBilingual> dictionary;

    public MyGreatDictionary() {
        dictionary = new ArrayList<>();
    }
    public void fillWithWordsBilingual(List<WordsBilingual> listOfWords) {
        dictionary.addAll(listOfWords);
    }
    public void translateFromSourceLanguageToDestiny(String sourceWord) {
        // iterate the list
        for (WordsBilingual currentWordsPair : dictionary) {
            // compare sourceWord with source language from the current item
            if (currentWordsPair.getSourceLanguage().equals(sourceWord)) {
                // if we find the word, finish iteration. Provide nice mesage to the user
                String translated = currentWordsPair.getDestinyLanguage();
                System.out.println("Translate of [%s] is [%s]".formatted(sourceWord, translated));
                return;
            }
        }
        //if we went through whole list, and didn't find - say sorry
        System.out.println("Sorry, no translation of [%s]".formatted(sourceWord));




    }
}
