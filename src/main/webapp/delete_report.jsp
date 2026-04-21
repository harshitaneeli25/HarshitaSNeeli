<%@ page import="java.sql.*" %>

<html>
<body>
<pre>
Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
String ch = request.getParameter("ch");
int total = 0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee", "root", "password");

    // 🔴 DELETE records starting with given character
    PreparedStatement ps1 = con.prepareStatement(
        "DELETE FROM Emp WHERE Emp_Name LIKE ?");

    ps1.setString(1, ch + "%");
    ps1.executeUpdate();

    // 🟢 SELECT remaining records
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

    while (rs.next()) {
        int eno = rs.getInt("Emp_NO");
        String name = rs.getString("Emp_Name");
        int sal = rs.getInt("Basicsalary");

        total += sal;
%>
Emp_No     : <%= eno %>
Emp_Name   : <%= name %>
Basic      : <%= sal %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
    }

    con.close();
} catch (Exception e) {
    out.println(e);
}
%>

Grand Salary : <%= total %>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
</pre>

</body>
</html>