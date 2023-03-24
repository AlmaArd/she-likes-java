package com.sda.she_likes_java.homework;
/*
Create class with name Address
Put next variables inside it:
- country,
- city,
- street
- postal code
Use proper data types.
Try to create two different addresses objects and init them with some values.
 */

public class Address {

        String country;
        String city;
        String street;
        int postalCode;
        String postalCodeOther;
    public static void main(String[] args) {
        Address myCurrentAddress = new Address();
        myCurrentAddress.country = "Lithuania";
        myCurrentAddress.city = "Vilnius";
        myCurrentAddress.postalCodeOther = "LT-04140";
        myCurrentAddress.street = "Jonazoliu street";

        System.out.println("Hello, my address is: " + myCurrentAddress.country + " "+ myCurrentAddress.city + " "+ myCurrentAddress.postalCodeOther + " "+ myCurrentAddress.street );

        Address myHometownAddress = new Address();
        myHometownAddress.country = "Lithuania";
        myHometownAddress.city = "Alytus";
        myHometownAddress.postalCode = 6337;
        myHometownAddress.street = "Topoliu street";

        System.out.println("Hello, my hometown address is %s %s %d %s " .formatted(myHometownAddress.country, myHometownAddress.city, myHometownAddress.postalCode, myHometownAddress.street));


        // System.out.println(" Hi, I'm %s %s. I am %s years old.".formatted(name, surname, age));
        // %s means String wildcard
        // %d means number wildcard







    }
}
