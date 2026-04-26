package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ReportCriteriaServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String start = req.getParameter("start");
        String end = req.getParameter("end");

        res.sendRedirect("report_result.jsp?start=" + start + "&end=" + end);
    }
}