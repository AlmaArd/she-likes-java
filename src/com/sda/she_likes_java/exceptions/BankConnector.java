package com.sda.she_likes_java.exceptions;

import java.util.Random;

public class BankConnector {

    public Integer accountBalance() throws Exception {
        // trying to connect to real account :)
        Random random = new Random();
        int randomNUmber = random.nextInt();

        // 100 % 2-> 0
        // 101 % 2-> 1
        if (randomNUmber % 2 == 0) {
            return 1000;
        } else {
            System.out.println("Network error");
            throw new Exception("Connection error");
        }
    }

    public Integer accountBalanceAlwaysSuccessful() {
        Random random = new Random();
        int randomNumber = random.nextInt();
        if (randomNumber % 2 == 0) { // % 2 == 0 - skai2ius be liekanos, dalinanat i6 2
            return 100;
        } else {
            System.out.println("Not ok");
            return  -100;
        }

    }

}