package com.sda.she_likes_java.objects;

public class HouseExample {

    public static void main(String[] args) {
        House myHouse = new House(4, 2); //here we created new object
        System.out.println("I've got new house: " + myHouse);
        //stage1

        System.out.println("Currently my house has got " + myHouse.getNumberOfRooms() + " rooms");
        System.out.println("I need more rooms...");
        myHouse.setNumberOfRooms(5);
        //stage2

        System.out.println("Hey, I've got more rooms now...");
        System.out.println("Currently my house has got " + myHouse.getNumberOfRooms() + " rooms");
        System.out.println("============================================");
        HouseOwner wife = new HouseOwner("Mary", myHouse);
        //stage3
        HouseOwner husband = new HouseOwner("Jack", myHouse);
        //stage4
        System.out.println("Mary would like to repair her house");
        wife.getHouse().setNumberOfBathrooms(3); // House house = wife.getHouse(); house.setNumberOfBathrooms(3);
        System.out.println("Currently the house looks like this: " +myHouse);
        //stage5

        husband.getHouse().setNumberOfBathrooms(1);
        System.out.println("Currently the house looks like this: " +myHouse);
        //stage6
        System.out.println("Mary: " +wife);
        System.out.println("Jack: " +husband);

        myHouse = new House(1, 1);
        System.out.println("Now myHouse reference: " +myHouse);
        System.out.println("Mary: " +wife);
        System.out.println("Jack: " +husband);
        //stage7

        myHouse = new House(10, 10);
        wife.setHouse(myHouse);
        //stage8
        System.out.println();
        System.out.println("Mary: " +wife);
        System.out.println("Jack: " +husband);
        wife.setHouse(husband.getHouse());
        //stage9
    }
}
