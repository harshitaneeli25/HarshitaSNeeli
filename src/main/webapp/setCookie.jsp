<%@ page language="java" %>
<%
    String name = request.getParameter("cname");
    String domain = request.getParameter("domain");
    String ageStr = request.getParameter("age");

    int age = 60; // default value

    // Null and empty check (FIX for your error)
    if (ageStr != null && !ageStr.trim().isEmpty()) {
        try {
            age = Integer.parseInt(ageStr);
        } catch (Exception e) {
            age = 60; // fallback
        }
    }

    // Create cookie
    Cookie cookie = new Cookie(name, domain);
    cookie.setMaxAge(age);

    response.addCookie(cookie);
%>

<html>
<body>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Value:</b> <%= domain %></p>
<p><b>Expiry:</b> <%= age %> seconds</p>

<br><br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>