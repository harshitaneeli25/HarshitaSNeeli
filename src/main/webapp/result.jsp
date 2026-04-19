<%@ page language="java" %>
<html>
<body>

<h2>Student Result</h2>

<p>Roll No: <%= request.getAttribute("roll") %></p>
<p>Name: <%= request.getAttribute("name") %></p>
<p>Average: <%= request.getAttribute("avg") %></p>
<p>Result: <%= request.getAttribute("result") %></p>

<a href="index.jsp">Go Back</a>

</body>
</html>