<html>
<head>
<title>Home</title>

<style>
body { margin:0; font-family:Arial; background:linear-gradient(135deg,#667eea,#764ba2);}
.container { width:400px; margin:80px auto; background:white; padding:30px; border-radius:12px; box-shadow:0 8px 20px rgba(0,0,0,0.2); text-align:center;}
h1 { color:#333; }
a { display:block; margin:10px 0; padding:12px; color:white; text-decoration:none; border-radius:6px; font-weight:bold;}
.add { background:#28a745; }
.update { background:#007bff; }
.delete { background:#dc3545; }
.view { background:#6f42c1; }
.report { background:#17a2b8; }
a:hover { opacity:0.9; transform:scale(1.05);}
</style>

</head>
<body>

<div class="container">
<h1>Hotel Management System</h1>

<a href="reservationadd.jsp" class="add">➕ Add Reservation</a>
<a href="reservationupdate.jsp" class="update">✏️ Update Reservation</a>
<a href="reservationdelete.jsp" class="delete">❌ Delete Reservation</a>
<a href="reservationdisplay.jsp" class="view">📋 View Reservations</a>
<a href="report_form.jsp" class="report">📊 Reports</a>

</div>

</body>
</html>