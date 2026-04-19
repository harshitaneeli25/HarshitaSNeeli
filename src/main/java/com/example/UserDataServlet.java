package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String des = request.getParameter("designation");

        // Server-side validation
        if (name == null || name.isEmpty() ||
            email == null || !email.contains("@") ||
            des == null || des.isEmpty()) {

            response.sendRedirect("index.jsp");
            return;
        }

        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("des", des);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}