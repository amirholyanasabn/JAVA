package data;

import entities.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private static Connection connection;
    public StudentDAO() throws SQLException{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/amir","root","1124");
        } catch (Exception e) {
            throw new SQLException("Database is not available.");
        }
    }
    public int save(Student student) throws SQLException {
        if (connection != null){
            PreparedStatement ps = connection.prepareStatement("insert into student (name ,family,major) values (?,?,?)");
            ps.setString(1,student.getName());
            ps.setString(2,student.getFamily());
            ps.setString(3,student.getMajor());
            int res = ps.executeUpdate();
            return res;
        }
        return -1;
    }
    public List<Student> getAll() throws SQLException {
        List<Student> students = new ArrayList<>();
        if (connection !=  null) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from student");
            while (rs.next()){
                Student student = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                students.add(student);
            }
        }
        return students;
    }
    public void delete(int id) throws SQLException {
        if (connection != null){
            PreparedStatement ps = connection.prepareStatement("delete from student where id=?");
            ps.setInt(1,id);
            int res = ps.executeUpdate();
        }else
            throw new SQLException("Connection is null.");
    }
    public Student findById(int id) throws SQLException {
        Student student = new Student();
        if (connection != null) {
            PreparedStatement ps = connection.prepareStatement("select * from student where id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setFamily((rs.getString(3)));
                student.setMajor((rs.getString(4)));
            }
        } else
            throw new SQLException("Connection is null");
        return student;
    }

    public int edit(Student student) throws SQLException {
        if (connection != null){
            PreparedStatement ps = connection.prepareStatement("update student set name = ? ,family = ?,major = ? where id = ?");
            ps.setString(1,student.getName());
            ps.setString(2,student.getFamily());
            ps.setString(3,student.getMajor());
            ps.setInt(4,student.getId());
            int rs = ps.executeUpdate();
            return rs;
        }else
            throw new SQLException("Connection in null.");
    }
}
