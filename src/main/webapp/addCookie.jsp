<%@ page language="java" %>
<html>
<head>
    <title>Add Cookie</title>
</head>
<body>

<h2>Add Cookie</h2>

<form action="setCookie.jsp" method="post">
    Name: <input type="text" name="cname" required><br><br>

    Domain(Value): <input type="text" name="domain" required><br><br>

    Max Age (seconds): <input type="number" name="age" required><br><br>

    <input type="submit" value="Add Cookie">
</form>

<br><br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>