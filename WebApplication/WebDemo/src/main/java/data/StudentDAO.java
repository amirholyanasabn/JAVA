package data;

import entities.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","1124");
        } catch (SQLException e) {
            System.err.println("Error in connection");
        } catch (ClassNotFoundException e){
            System.err.println("Class not found");
        }
    }
    public int save(Student student) throws SQLException {
        if (connection != null){
            PreparedStatement ps = connection.prepareStatement("INSERT INTO student (ssn,name ,family,major) VALUES (?,?,?,?)");
            ps.setString(1,student.getSsn());
            ps.setString(2,student.getName());
            ps.setString(3,student.getFamily());
            ps.setString(4,student.getMajor());
            int res = ps.executeUpdate();
            return res;
        }
        return -1;
    }

    public List<Student> getAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        if (connection != null){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from student");

            while (rs.next()){
                Student student = new Student(rs.getInt(1),rs.getString(2),rs.getString(2),rs.getString(3),rs.getString(4) );
                students.add(student);
            }
            return students;
        }
    }
}
