package com.sda.she_likes_java.homework.exercise_15;

import com.sda.she_likes_java.classes.Address;
import com.sda.she_likes_java.classes.Person;

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
        Parent myParentMother = new Parent();
        myParentFather.name = "Jonas";
        myParentFather.surname = "Ardaravicius";
        myParentMother.name = "Zinaida";
        myParentMother.surname = "Ardaraviciene";


        Address myParentsAddress = new Address();
        myParentsAddress.country = "Lithuania";
        myParentsAddress.city = "Alytus";
        myParentsAddress.postalCode = 6337;
        myParentsAddress.street = "Topoliu street";


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

        System.out.println("Family information:");
        System.out.println("Hello, my fathers name is %s and surname is %s" .formatted(myParentFather.name,myParentFather.surname));
        System.out.println("Hello, my mothers name is %s and surname is %s" .formatted(myParentMother.name,myParentMother.surname));
        System.out.println("Hello my parents address is %s, %s, postal code LT - %d, %s" .formatted(myParentsAddress.country, myParentsAddress.city, myParentsAddress.postalCode, myParentsAddress.street));
        System.out.println("Children:");
        System.out.println("First child: %s, %s, age %d" . formatted(myParentFirstChild.name, myParentFirstChild.surname, myParentFirstChild.age));
        System.out.println("And address: %s" .formatted(myParentFirstChild.address));
        System.out.println("Second child: %s, %s, age %d" . formatted(myParentSecondChild.name, myParentSecondChild.surname, myParentSecondChild.age));
        System.out.println("And address: %s" .formatted(myParentSecondChild.address));

    }
}


