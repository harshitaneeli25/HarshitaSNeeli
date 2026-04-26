package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.ReservationDAO;

public class DeleteReservationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            int id = Integer.parseInt(req.getParameter("id"));

            new ReservationDAO().deleteReservation(id);

            res.sendRedirect("reservationdisplay.jsp");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}