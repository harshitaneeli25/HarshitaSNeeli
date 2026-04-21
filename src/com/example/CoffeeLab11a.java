package com.example;

import java.sql.*;
import java.util.Scanner;

public class CoffeeLab11a {

    public static void main(String[] args) {

        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to MySQL
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test", "root", "password");

            // 3. Read existing records
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM coffee");

            System.out.println("----- Existing Coffee Records -----");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getDouble("price"));
            }

            // 4. Insert new record
            Scanner sc = new Scanner(System.in);

            System.out.println("\nEnter new coffee details:");
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO coffee VALUES (?, ?, ?)");

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setDouble(3, price);

            ps.executeUpdate();

            System.out.println("✅ Record Inserted Successfully!");

            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error occurred:");
            e.printStackTrace();
        }
    }
}
