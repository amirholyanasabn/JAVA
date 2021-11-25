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

@WebServlet("/register-student.do")
public class RegisterStudentController extends HttpServlet {
    StudentService studentService;
    public RegisterStudentController(){
        studentService = new StudentService();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String family = req.getParameter("family");
        String major = req.getParameter("major");

        Student student = new Student(name,family,major);

        try {
            studentService.save(student);
        } catch (SQLException e) {
            resp.sendRedirect("/error.do");
        }

        req.getRequestDispatcher("/WEB-INF/register-student.jsp").forward(req,resp);
    }
}
