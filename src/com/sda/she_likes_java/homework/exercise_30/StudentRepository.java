package com.sda.she_likes_java.homework.exercise_30;

import java.util.List;

public class StudentRepository {
    private static final String allStudentsQuery = """
            SELECT ID, NAME, SURNAME, AGE, SEX
            FROM STUDENT
            """;

    private static final String findStudentsById = """
            SELECT ID, NAME, SURNAME, AGE, SEX
            FROM STUDENT
            WHERE ID = %d
            """;


    public static List<Student> getAllUsers() {
        return List.of();
    }
}
