package com.sda.she_likes_java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtils {

    /**
     * Script for creating table
     * CREATE TABLE TEST
     * (ID INT PRIMARY KEY, NAME VARCHAR(255));
     *
     * Script for inserting one record(row) into table
     * INSERT INTO
     *  TEST(ID, NAME)
     *  VALUES(1, 'Alma');
     *
     *  Script for reading data
     *  SELECT ID, NAME
     *  FROM TEST;
     *
     *  Script for updating data
     * UPDATE TEST -- name of table to update
     * SET NAME = 'Inese' -- column value to change
     * WHERE ID=2 -- selected row
     * Script for deleting data
     * DELETE
     * FROM TEST
     * WHERE ID=3;
    */
    // handle internally
    // by getting connection we are sending some queries(uzklausas) to database
    public static Connection getConnection () {
        // trows SQLExeption
        try {
            return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Data/she-goes-tech", "sa", "sa");
        } catch (SQLException e) {
            System.out.println("Exception occured during database connection: " + e);
            return null;
        }



    }

    // declare
    public static Connection getConnectionButSometimesThrowException() throws SQLException {
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/Data/she-goes-tech",
                "sa",
                "sa");
    }
}
