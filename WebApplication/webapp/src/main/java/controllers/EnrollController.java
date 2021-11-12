package controllers;

import data.StudentDAO;
import entities.Student;
import services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/enroll.do")
public class EnrollController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String family = req.getParameter("family");
        String major = req.getParameter("major");

        Student student = new Student();
        student.setName(name);
        student.setFamily(family);
        student.setMajor(major);

        Student students = new Student(student.getName(),student.getFamily(),student.getMajor());
        try {
            StudentDAO.save(students);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/enroll.jsp").forward(req,resp);
    }
}
