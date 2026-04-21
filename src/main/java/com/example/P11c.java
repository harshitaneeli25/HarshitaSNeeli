package com.example;
import java.sql.*;
import java.util.Scanner;

public class P11c{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Employee", "root", "password");

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO Emp VALUES (?, ?, ?)");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter Emp No:");
                int eno = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Emp Name:");
                String name = sc.nextLine();

                System.out.println("Enter Salary:");
                int sal = sc.nextInt();

                ps.setInt(1, eno);
                ps.setString(2, name);
                ps.setInt(3, sal);

                ps.executeUpdate();
                System.out.println("Record Inserted!");
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}