package controllers;

import entities.Student;
import services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/register-save.do")
public class RegisterSaveController extends HttpServlet {
    StudentService studentService;
    public RegisterSaveController(){
        studentService = new StudentService();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ssn = req.getParameter("ssn");
        String name = req.getParameter("name");
        String family = req.getParameter("family");
        String major = req.getParameter("major");
        Student student = new Student(ssn,name,family,major);
        try {
            studentService.save(student);
            resp.sendRedirect("/home.do");
        } catch (SQLException e) {
            resp.sendRedirect("/error.do");
        }


    }
}
