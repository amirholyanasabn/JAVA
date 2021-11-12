package services;

import data.StudentDAO;
import entities.Student;

import java.sql.SQLException;

public class StudentService {
    private StudentDAO studentDAO;
    public StudentService(){
        studentDAO = new StudentDAO();
    }
    public  void save(Student student) throws SQLException {
        studentDAO.save(student);
    }
}
