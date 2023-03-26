package com.sda.she_likes_java.homework;
/*Create a Parent class containing the following variables:
- first name
- surname
- address - (use the class Address)
- firstChild (use class Person)
- secondChild (use class Person)
 */
public class Parent {
    String name;
    String surname;


    public static void main(String[] args) {
        Parent myParentFather = new Parent();
        myParentFather.name = "Jonas";
        myParentFather.surname = "Ardaravicius";


        Address myParentFatherAddress = new Address();
        myParentFatherAddress.country = "Lithuania";
        myParentFatherAddress.city = "Alytus";
        myParentFatherAddress.postalCode = 6337;
        myParentFatherAddress.street = "Topoliu street";

        Person myParentFirstChild = new Person();
        myParentFirstChild.name = "Alma";
        myParentFirstChild.surname = "Ardaraviciute";
        myParentFirstChild.age = 39;
        myParentFirstChild.address = "Jonazoliu st 19 - 11, Vilnius, Lithuania";

        Person myParentSecondChild = new Person();
        myParentSecondChild.name = "Mindaugas";
        myParentSecondChild.surname = "Ardaravicius";
        myParentSecondChild.age = 34;
        myParentSecondChild.address = "Unknown st 5 - 10, Amsterdam, Netherlands";

        System.out.println("Hello, my parent father name is %s and surname is %s and address is %s %s %d %s" .formatted(myParentFather.name,myParentFirstChild.surname, myParentFatherAddress.country, myParentFatherAddress.city, myParentFatherAddress.postalCode, myParentFatherAddress.street));

    }
}

class Address {
    Address myAddress = new Address();
    String country;
    String city;
    String street;
    int postalCode;
    String postalCodeOther;

}

class Person {

    String name;
    String surname;
    int age;
    String address;
}

