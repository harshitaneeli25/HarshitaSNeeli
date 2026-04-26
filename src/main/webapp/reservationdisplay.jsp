<%@ page import="java.util.*,dao.ReservationDAO,model.Reservation" %>

<html>
<head>
<title>Display</title>

<style>
body { margin:0; font-family:Arial; background:linear-gradient(135deg,#667eea,#764ba2);}
.container { width:80%; margin:50px auto; background:white; padding:20px; border-radius:12px;}
h2 { text-align:center; }
table { width:100%; border-collapse:collapse;}
th { background:#343a40; color:white; padding:10px;}
td { padding:10px; text-align:center;}
tr:nth-child(even){ background:#f2f2f2;}
</style>

</head>
<body>

<div class="container">
<h2>All Reservations</h2>

<table>
<tr>
<th>ID</th><th>Name</th><th>Room</th>
<th>CheckIn</th><th>CheckOut</th><th>Amount</th>
</tr>

<%
ReservationDAO dao = new ReservationDAO();
List<Reservation> list = dao.getAllReservations();

for(Reservation r : list){
%>

<tr>
<td><%= r.getReservationID() %></td>
<td><%= r.getCustomerName() %></td>
<td><%= r.getRoomNumber() %></td>
<td><%= r.getCheckIn() %></td>
<td><%= r.getCheckOut() %></td>
<td><%= r.getTotalAmount() %></td>
</tr>

<% } %>

</table>

</div>

</body>
</html>