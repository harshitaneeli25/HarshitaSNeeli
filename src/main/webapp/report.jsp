<%@ page import="java.sql.*" %>

<html>
<body>
<pre>
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Salary Report
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
<%
String ch = request.getParameter("ch");
int total = 0;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee", "root", "password");

    PreparedStatement ps = con.prepareStatement(
        "SELECT * FROM Emp WHERE Emp_Name LIKE ?");

    ps.setString(1, ch + "%");

    ResultSet rs = ps.executeQuery();

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