<html>
<head>
<title>Report</title>

<style>
body { margin:0; font-family:Arial; background:linear-gradient(135deg,#667eea,#764ba2);}
.container { width:50%; margin:60px auto; background:white; padding:25px; border-radius:12px;}
input { width:100%; padding:10px; margin:10px 0;}
input[type="submit"] { background:#17a2b8; color:white;}
</style>

</head>
<body>

<div class="container">
<h2>Generate Report</h2>

<form action="reportCriteria" method="post">
Start Date: <input type="date" name="start">
End Date: <input type="date" name="end">

<input type="submit" value="Generate">
</form>

</div>

</body>
</html>