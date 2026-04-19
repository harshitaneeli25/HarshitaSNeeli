<html>
<head>
<script>
function validate() {
    let name = document.f.username.value;
    let email = document.f.email.value;
    let des = document.f.designation.value;

    if (name=="" || email=="" || des=="") {
        alert("All fields required");
        return false;
    }

    if (!email.includes("@")) {
        alert("Invalid Email");
        return false;
    }

    return true;
}
</script>
</head>

<body>

<form name="f" action="UserDataServlet" method="post" onsubmit="return validate()">
    Username: <input type="text" name="username"><br><br>
    Email: <input type="text" name="email"><br><br>
    Designation: <input type="text" name="designation"><br><br>

    <input type="submit" value="Submit">
</form>

</body>
</html>