<%@ page import="java.sql.*" %>

<%
String eno = request.getParameter("empno");
String name = request.getParameter("empname");
String sal = request.getParameter("salary");

try {
    Class.forName("com.mysql.cj.jdbc.Driver");

    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/Employee", "root", "password");

    PreparedStatement ps = con.prepareStatement(
        "INSERT INTO Emp VALUES (?, ?, ?)");

    ps.setInt(1, Integer.parseInt(eno));
    ps.setString(2, name);
    ps.setInt(3, Integer.parseInt(sal));

    ps.executeUpdate();

    out.println("<h3>Record Inserted Successfully!</h3>");

    con.close();
} catch (Exception e) {
    out.println(e);
}
%>

<a href="index.jsp">Go Back</a>