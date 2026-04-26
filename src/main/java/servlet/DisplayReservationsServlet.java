package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DisplayReservationsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        RequestDispatcher rd = req.getRequestDispatcher("reservationdisplay.jsp");
        rd.forward(req, res);
    }
}