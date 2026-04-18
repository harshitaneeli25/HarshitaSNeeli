//6a. Build a servlet program to find the factorial of a number using HTML with step by step procedure.


package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get input from form
        int num = Integer.parseInt(request.getParameter("num"));

        long fact = 1;

        // Calculate factorial
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        // Display result
        out.println("<html><body>");
        out.println("<h2>Factorial Result</h2>");
        out.println("<p>Factorial of " + num + " is: " + fact + "</p>");
        out.println("</body></html>");
    }
}
