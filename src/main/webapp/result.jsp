<%@ page language="java" %>
<html>
<body>

<h2>User Details</h2>

<p>Name: <%= request.getAttribute("name") %></p>
<p>Email: <%= request.getAttribute("email") %></p>
<p>Designation: <%= request.getAttribute("des") %></p>

<a href="index.jsp">Go Back</a>

</body>
</html>