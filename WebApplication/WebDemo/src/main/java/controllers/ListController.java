package controllers;

import entities.Student;
import services.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/list.do")
public class ListController extends HttpServlet {
//    StudentService studentService;
//    public ListController(){
//        studentService = new StudentService();
//    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService studentService = new StudentService();
        studentService.getAll();
    }
}
