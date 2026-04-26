package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import dao.ReservationDAO;
import model.Reservation;
import java.sql.Date;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UpdateReservationServlet")
public class UpdateReservationServlet extends HttpServlet {

protected void doPost(HttpServletRequest req, HttpServletResponse res)
throws ServletException, IOException {

try {

Reservation r = new Reservation();

r.setReservationID(Integer.parseInt(req.getParameter("id")));
r.setCustomerName(req.getParameter("name"));
r.setRoomNumber(req.getParameter("room"));
r.setCheckIn(Date.valueOf(req.getParameter("checkin")));
r.setCheckOut(Date.valueOf(req.getParameter("checkout")));
r.setTotalAmount(Double.parseDouble(req.getParameter("amount")));

ReservationDAO dao = new ReservationDAO();

boolean updated = dao.updateReservation(r);

if (updated) {
    res.sendRedirect("updatesuccess.jsp");   // ✅ redirect
} else {
    res.sendRedirect("updateerror.jsp");
}

} catch (Exception e) {
e.printStackTrace();
res.sendRedirect("error.jsp");
}
}
}