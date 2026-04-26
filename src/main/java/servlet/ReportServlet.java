package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ReportServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/HotelDB", "root", "password");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT SUM(TotalAmount) FROM Reservations");

            double revenue = 0;
            if (rs.next()) {
                revenue = rs.getDouble(1);
            }

            req.setAttribute("revenue", revenue);

            RequestDispatcher rd = req.getRequestDispatcher("reports.jsp");
            rd.forward(req, res);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}