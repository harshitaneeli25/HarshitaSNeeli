<%@ page import="java.sql.*" %>

<html>
<body>

<%
String eno = request.getParameter("empno");
String name = request.getParameter("empname");
String sal = request.getParameter("salary");

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee", "root", "password");

    PreparedStatement ps = con.prepareStatement(
        "UPDATE Emp SET Emp_Name=?, Basicsalary=? WHERE Emp_NO=?");

    ps.setString(1, name);
    ps.setInt(2, Integer.parseInt(sal));
    ps.setInt(3, Integer.parseInt(eno));

    int rows = ps.executeUpdate();

    if (rows > 0) {
        out.println("<h3>Record Updated Successfully!</h3>");
    } else {
        out.println("<h3>No Record Found!</h3>");
    }

    con.close();
} catch (Exception e) {
    out.println(e);
}
%>

<br><a href="update.jsp">Back</a>

</body>
</html>