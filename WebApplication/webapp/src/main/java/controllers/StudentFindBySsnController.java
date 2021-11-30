package controllers;

import entities.Student;
import servieces.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/student-find-by-ssn.do")
public class StudentFindBySsnController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ssn = req.getParameter("ssn");
        try {
            StudentService service = new StudentService();
            Student student = service.findBySsn(ssn);
            req.setAttribute("list",student);
            req.getRequestDispatcher("/WEB-INF/student-find-by-ssn.jsp").forward(req,resp);
        } catch (SQLException e) {
            resp.sendRedirect("/error.do");
        }

    }
}
