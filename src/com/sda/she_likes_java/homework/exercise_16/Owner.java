package com.sda.she_likes_java.homework.exercise_16;

import com.sda.she_likes_java.classes.constructor.FullAddress;

public class Owner {

    /*Create a hierarchy of classes:
use a separate package: exercise_16
new Owner class with private fields
First name
Surname,
Animal
class Animal containing the fields
first name
age
breed
Use private variables and create get/set methods
Create a toString() method for each class.
Create a main method and a sample class hierarchy. (edited)

     */
    private String firstname;
    private String surname;

    private Animal animal;

    public Owner(String firstname, String surname, Animal animal) {
        this.firstname = firstname;
        this.surname = surname;
        this.animal = animal;
    }

    public Owner() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", animal=" + animal +
                '}';
    }

    public static void main(String[] args) {
        Animal dog = new Animal("Gile", 3, "Terrier");
        Owner owner = new Owner("Alma", "Ardarav", dog);
        System.out.println( "Owner and her dog: " +owner);

    }

}