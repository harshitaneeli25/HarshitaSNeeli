<%@ page language="java" %>
<html>
<head>
    <title>Active Cookies</title>
</head>
<body>

<h2>Active Cookie List</h2>

<%
    Cookie[] cookies = request.getCookies();

    if (cookies != null && cookies.length > 0) {
        for (Cookie c : cookies) {
%>
            <p>
                <b>Name:</b> <%= c.getName() %> |
                <b>Value:</b> <%= c.getValue() %>
            </p>
<%
        }
    } else {
%>
        <p>No cookies found</p>
<%
    }
%>

<br><br>
<a href="addCookie.jsp">Back</a>

</body>
</html>