package com.sda.she_likes_java.homework.exercise_30;

//Exercise 30
//Write SQL scripts:
//- Create a Student table with fields:
//- ID of type Integer
//- Name type varchar(255)
//- Surname type varchar(255)
//- Age type Integer
//- SEX type varchar(255)
//Write a script to insert 5 rows into the Student table
//Add a script to delete students by ID

public class Student {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private String sex;

    public Student(Integer id, String name, String surname, Integer age, String sex) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
