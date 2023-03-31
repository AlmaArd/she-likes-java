package com.sda.she_likes_java.homework.exercise_16;

public class Homework {
    public static void main(String[] args) {
        Owner owner = new Owner();
        Animal dog = new Animal();

        owner.setFirstname("Alma");
        owner.setSurname("Ardarav");
        owner.setAnimal(dog);

        dog.setAnimalName("Gile");
        dog.setAnimalBreed("Terrier");
        dog.setAnimalAge(2);

        System.out.println(owner.toString());

    }
}
