package com.sda.she_likes_java.common_behaviour.wrong_approach;

public class Penguin extends Bird implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Penguins are excellent swimmers");

    }
}
