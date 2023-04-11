package com.sda.she_likes_java.homework.exercise_17;

public class Book {

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
    private String author;
    private String title;
    private int yearOfPublication;
    private static int numberOfLentBooks;


    public Book(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        numberOfLentBooks++;
    }

    public static int getNumberOfLentBooks() {
        return numberOfLentBooks;
    }

    public static void setNumberOfLentBooks(int numberOfLentBooks) {
       Book.numberOfLentBooks = numberOfLentBooks;

    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
