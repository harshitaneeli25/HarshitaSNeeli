<html>
<head>
<title>Add</title>

<style>
body { margin:0; font-family:Arial; background:linear-gradient(135deg,#667eea,#764ba2);}
.container { width:60%; margin:60px auto; background:white; padding:25px; border-radius:12px; box-shadow:0 8px 20px rgba(0,0,0,0.2);}
h2 { text-align:center; }
input { width:100%; padding:10px; margin:8px 0; border-radius:6px; border:1px solid #ccc;}
input[type="submit"] { background:#28a745; color:white; font-weight:bold;}
</style>

</head>
<body>

<div class="container">
<h2>Add Reservation</h2>

<form action="addReservation" method="post">
ID: <input type="text" name="id">
Name: <input type="text" name="name">
Room: <input type="text" name="room">
Check-In: <input type="date" name="checkin">
Check-Out: <input type="date" name="checkout">
Amount: <input type="text" name="amount">

<input type="submit" value="Add">
</form>

</div>

</body>
</html>