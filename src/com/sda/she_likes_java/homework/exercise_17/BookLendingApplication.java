package com.sda.she_likes_java.homework.exercise_17;

import java.util.Random;

public class BookLendingApplication {
    /*Exercise 17
Create a Book Lending application
This contains a book class with the following fields
- author
- title
- year of publication
Create 3 different books at the beginning and then a random number of them.
To create a random number of objects, use the “Random” class and a loop that will execute as many times as the nextInt() method returns.
At the very end, write out the number of books created - use a variable of type “static”.
  */
    public static void main(String[] args) {
        Book firstBook = new Book("J.K.Rowling", "Harry Potter and the Philosopher's Stone", 1997);
        Book secondBook = new Book("J.K.Rowling", "Harry Potter and the Chamber of Secrets", 1998);
        Book thirdBook = new Book("J.K.Rowling", "Harry Potter and the Prisoner of Azkaban", 1999);
        // tie kiekviena new Book iškviečiam konstruktorių public Book
        // ir perduodam konstruktoriaus parametrus į new Book objekto parametrus.
        // ir padidina numberOfLentBooks per +1
        Random generator = new Random();
        int number = generator.nextInt(1, 6);

        for (int i = 0; i < number; i++) {
            Book randomBook = new Book("J.K.Rowling", "Harry Potter " + i, 1997);
        }
        System.out.println("Number of generated books " +Book.getNumberOfLentBooks());

    }


}
