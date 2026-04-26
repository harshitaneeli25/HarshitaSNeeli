package dao;

import java.sql.*;
import java.util.*;
import model.Reservation;

public class ReservationDAO {

    private Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/HotelDB",
            "root",
            "password" // change your password
        );
    }

    // ADD
    public void addReservation(Reservation r) throws Exception {
        Connection con = getConnection();

        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO Reservations VALUES (?, ?, ?, ?, ?, ?)");

        ps.setInt(1, r.getReservationID());
        ps.setString(2, r.getCustomerName());
        ps.setString(3, r.getRoomNumber());
        ps.setDate(4, r.getCheckIn());
        ps.setDate(5, r.getCheckOut());
        ps.setDouble(6, r.getTotalAmount());

        ps.executeUpdate();
        con.close();
    }

    // DISPLAY
    public List<Reservation> getAllReservations() throws Exception {
        List<Reservation> list = new ArrayList<>();

        Connection con = getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM Reservations");

        while (rs.next()) {
            Reservation r = new Reservation();

            r.setReservationID(rs.getInt(1));
            r.setCustomerName(rs.getString(2));
            r.setRoomNumber(rs.getString(3));
            r.setCheckIn(rs.getDate(4));
            r.setCheckOut(rs.getDate(5));
            r.setTotalAmount(rs.getDouble(6));

            list.add(r);
        }

        con.close();
        return list;
    }

    // DELETE
    public void deleteReservation(int id) throws Exception {
        Connection con = getConnection();

        PreparedStatement ps = con.prepareStatement(
            "DELETE FROM Reservations WHERE ReservationID=?");

        ps.setInt(1, id);
        ps.executeUpdate();
        con.close();
    }

    // ✅ UPDATE (FIXED METHOD)
    public boolean updateReservation(Reservation r) throws Exception {

        Connection con = getConnection();

        PreparedStatement ps = con.prepareStatement(
            "UPDATE Reservations SET CustomerName=?, RoomNumber=?, CheckIn=?, CheckOut=?, TotalAmount=? WHERE ReservationID=?"
        );

        ps.setString(1, r.getCustomerName());
        ps.setString(2, r.getRoomNumber());
        ps.setDate(3, r.getCheckIn());
        ps.setDate(4, r.getCheckOut());
        ps.setDouble(5, r.getTotalAmount());
        ps.setInt(6, r.getReservationID());

        int rows = ps.executeUpdate();

        con.close();

        // ✅ return true if updated
        return rows > 0;
    }
}