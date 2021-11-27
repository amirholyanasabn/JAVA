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

@WebServlet("/student-edit.do")
public class StudentFetchToEditController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sid = req.getParameter("id");
        int id = Integer.parseInt(sid);
        try {
            StudentService service = new StudentService();
            Student student = service.findById(id);
            req.setAttribute("student",student);
            req.getRequestDispatcher("/WEB-INF/edit-student.jsp").forward(req,resp);
        }catch (SQLException e){
            resp.sendRedirect("/error.do");
        }

    }
}
