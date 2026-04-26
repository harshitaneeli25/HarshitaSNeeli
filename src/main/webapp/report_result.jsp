<%@ page import="java.sql.*" %>

<html>
<head>
<title>Report Result</title>

<style>
body { margin:0; font-family:Arial; background:linear-gradient(135deg,#667eea,#764ba2);}
.container { width:80%; margin:50px auto; background:white; padding:20px; border-radius:12px;}
table { width:100%; border-collapse:collapse;}
th { background:#343a40; color:white; padding:10px;}
td { padding:10px; text-align:center;}
tr:nth-child(even){ background:#f2f2f2;}
</style>

</head>
<body>

<div class="container">
<h2>Report Result</h2>

<%
String start = request.getParameter("start");
String end = request.getParameter("end");

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/HotelDB", "root", "password");

PreparedStatement ps = con.prepareStatement(
"SELECT * FROM Reservations WHERE CheckIn BETWEEN ? AND ?");

ps.setString(1, start);
ps.setString(2, end);

ResultSet rs = ps.executeQuery();
%>

<table>
<tr>
<th>ID</th><th>Name</th><th>Room</th>
<th>CheckIn</th><th>CheckOut</th><th>Amount</th>
</tr>

<%
while(rs.next()){
%>

<tr>
<td><%= rs.getInt(1) %></td>
<td><%= rs.getString(2) %></td>
<td><%= rs.getString(3) %></td>
<td><%= rs.getDate(4) %></td>
<td><%= rs.getDate(5) %></td>
<td><%= rs.getDouble(6) %></td>
</tr>

<% } %>

</table>

</div>

</body>
</html>