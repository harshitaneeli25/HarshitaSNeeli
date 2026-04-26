<html>
<head>
<title>Delete</title>

<style>
body { margin:0; font-family:Arial; background:linear-gradient(135deg,#667eea,#764ba2);}
.container { width:50%; margin:80px auto; background:white; padding:25px; border-radius:12px; text-align:center;}
input { width:100%; padding:10px; margin:10px 0;}
input[type="submit"] { background:#dc3545; color:white;}
</style>

</head>
<body>

<div class="container">
<h2>Delete Reservation</h2>

<form action="deleteReservation" method="post">
Enter ID:
<input type="text" name="id">

<input type="submit" value="Delete">
</form>

</div>

</body>
</html>