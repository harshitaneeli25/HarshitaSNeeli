<%@ page language="java" %>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>

<%
    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);

        // Set session expiry to 1 minute (60 seconds)
        session.setMaxInactiveInterval(60);
    }

    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session will expire in 1 minute.</p>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <a href="index.jsp">Login again</a>
<%
    }
%>

</body>
</html>