<html>
<head>
<script>
function validate() {
    let fields = document.f.elements;

    for (let i=0; i<fields.length; i++) {
        if (fields[i].value == "") {
            alert("All fields required");
            return false;
        }
    }
    return true;
}
</script>
</head>

<body>

<form name="f" action="ResultServlet" method="post" onsubmit="return validate()">

Roll No: <input type="text" name="roll"><br><br>
Name: <input type="text" name="name"><br><br>

Sub1: <input type="number" name="s1"><br><br>
Sub2: <input type="number" name="s2"><br><br>
Sub3: <input type="number" name="s3"><br><br>
Sub4: <input type="number" name="s4"><br><br>
Sub5: <input type="number" name="s5"><br><br>

<input type="submit" value="Calculate">

</form>

</body>
</html>