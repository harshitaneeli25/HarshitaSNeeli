<%@ page language="java" %>
<html>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>! Session still active.</h2>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <a href="index.jsp">Login Again</a>
<%
    }
%>

</body>
</html>