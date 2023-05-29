package com.sda.she_likes_java.homework.exercise_30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtilsForStudentClass {
    public static Connection getConnection () {
        try {
            return DriverManager.getConnection("jdbc:h2:~\\Data\\she-goes-tech", "sa", "sa");
        } catch (SQLException e) {
            return null;
        }
    }
}
