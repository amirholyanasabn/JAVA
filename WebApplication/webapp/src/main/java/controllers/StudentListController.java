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
import java.util.List;

@WebServlet("/student-list.do")
public class StudentListController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService studentService = new StudentService();
        try {
            List<Student> students = studentService.getAll();
            req.setAttribute("list",students);
            req.getRequestDispatcher("/WEB-INF/student-list.jsp").forward(req,resp);
        } catch (SQLException e) {
            resp.sendRedirect("/WEB_-INF/error.jsp");
        }
    }
}
