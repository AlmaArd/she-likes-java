package com.sda.she_likes_java.homework.exercise_16;

public class Animal {
    /*Animal
class Animal containing the fields
first name
age
breed
use private variables and create get/set methods
Create a toString() method for each class.
Create a main method and a sample class hierarchy. (edited)
*/
    private String animalName;
    private int animalAge;
    private String animalBreed;

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                ", animalAge=" + animalAge +
                ", animalBreed='" + animalBreed + '\'' +
                '}';
    }
    public Animal(String animalName, int animalAge, String animalBreed) {
        this.animalName = animalName;
        this.animalAge = animalAge;
        this.animalBreed = animalBreed;
    }

    public Animal() {
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public static void main(String[] args) {
        Animal dog = new Animal ();
        dog.animalName = "Gile";
        dog.animalAge = 2;
        dog.animalBreed = "Terrier";

        Animal createdWithFullConstructor = new Animal("Gile", 3, "Terrier");
        System.out.println("Animal:" +createdWithFullConstructor);

    }
}
