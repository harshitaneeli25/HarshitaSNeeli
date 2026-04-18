package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int count = 0;
        Cookie cookies[] = request.getCookies();

        // Check existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        count++;

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(count));

        // Set expiry (30 seconds for demo)
        nameCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<p>You have visited this page " + count + " times.</p>");
        out.println("<p><b>Note:</b> Cookie will expire in 30 seconds.</p>");
        out.println("</body></html>");
    }
}