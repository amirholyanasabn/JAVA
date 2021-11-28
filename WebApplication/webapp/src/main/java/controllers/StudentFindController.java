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

@WebServlet("/student-find.do")
public class StudentFindController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("id");
        int id = Integer.parseInt(sid);
        try {
            StudentService service = new StudentService();
            Student student = service.findById(id);
            req.setAttribute("list",student);
        }catch (SQLException e){
            resp.sendRedirect("/error.do");
        }
        req.getRequestDispatcher("/WEB-INF/student-find.jsp").forward(req,resp);

    }
}
