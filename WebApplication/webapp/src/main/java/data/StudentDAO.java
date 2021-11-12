package data;

import controllers.EnrollController;
import entities.Student;

import java.sql.*;

public class StudentDAO {
    static final String DB_URL ="jdbc:mysql://localhost:3306/amir/student";
    static final String USER = "amir";
    static final String PASS = "1124";

    public static void save(Student student) throws SQLException {

        Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        PreparedStatement preparedStatement = connection.prepareStatement("insert inout student (name,family,major) values (?,?,?)");
        preparedStatement.setString(1,student.getName());
        preparedStatement.setString(2, student.getFamily());
        preparedStatement.setString(3,student.getMajor());

        preparedStatement.executeUpdate();
        connection.close();
    }
}
