package com.sda.she_likes_java.polymorphism;

public class Cat
        extends Animal {
    // extend - pratesti. if Cat extends animal - cat is animal
    @Override // improoving or customizing behavior which I inherited for my parent
    public void makeSound() {
        System.out.println("Miau");

    }
    public void sleep() {
        System.out.println("Cat is sleeping");

    }
}
