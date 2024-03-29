package com.sda.she_likes_java.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal someAnimal = new Animal();
        // object new Animal created
        // and assinged to the variable Animal, ot the same type
        Cat myCat = new Cat();
        Animal secondCat = new Cat();
        secondCat.makeSound();
        Animal dog = new Dog();
        dog.makeSound();

        callAnimal(someAnimal);
        callAnimal(myCat);
        callAnimal(dog);
        Elephant elephant = new Elephant();
        callAnimal(new Elephant());
        callAnimal(elephant);

        Object anotherCat = new Cat();
      //  anotherCat.makeSound();
        Animal animalCat = new Cat();

        Cat thirdCat = new Cat();
    }

    public static void callAnimal(Animal animal) {
        animal.makeSound();
    }
    public static void callAnimal(Dog animal) {
            animal.makeSound();
    }
    public static void callAnimal(Cat animal) {
        animal.makeSound();
    }
}