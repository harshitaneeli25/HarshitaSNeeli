package com.example;

import java.sql.*;

public class InsertEmp {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee", "root", "password");

            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO Emp VALUES (101,'Ramesh',25000)");
            stmt.executeUpdate("INSERT INTO Emp VALUES (102,'Ravi',20000)");
            stmt.executeUpdate("INSERT INTO Emp VALUES (103,'Suresh',22000)");
            stmt.executeUpdate("INSERT INTO Emp VALUES (104,'Raj',24000)");
            stmt.executeUpdate("INSERT INTO Emp VALUES (105,'Anil',18000)");

            System.out.println("5 Records Inserted!");

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}