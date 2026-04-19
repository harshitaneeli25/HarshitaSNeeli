<%@ page language="java" %>
<html>
<body>

<%
    String name = request.getParameter("username");
    String timeStr = request.getParameter("time");

    if (name != null && timeStr != null) {
        int time = Integer.parseInt(timeStr);

        session.setAttribute("user", name);
        session.setMaxInactiveInterval(time);
    }

    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session active. Click below to check:</p>
        <a href="check.jsp">Check Session</a>
<%
    } else {
%>
        <h2>Session Expired!</h2>
        <a href="index.jsp">Start Again</a>
<%
    }
%>

</body>
</html>