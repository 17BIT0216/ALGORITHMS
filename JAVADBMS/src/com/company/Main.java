package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:/Macintosh HD/Users/arungiri/Desktop/Java Programs/JAVADBMS/test.db");
        }
        catch (SQLException e)
        {
            System.out.println("Exception aaya");

        }
    }
}
