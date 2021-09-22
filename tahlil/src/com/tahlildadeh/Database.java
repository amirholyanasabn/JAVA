package com.tahlildadeh;

import java.sql.*;

public class Database {

    private Connection connection;
    private PreparedStatement statement;



    public void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

                connection.setAutoCommit(false);
            } catch (SQLException | ClassNotFoundException throwables) {
                System.out.println("khata dar commit");
            }
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cilinic","root","1124");
            } catch (SQLException throwables) {
                System.out.println("DB nabod");
            }

    }

    public void insert(){
        try {
            statement = connection.prepareStatement("insert into users(name ,lastname,username,password) values ('Amir','Olyanasab','amir','1365')");
            statement.executeUpdate();

            statement = connection.prepareStatement("insert into users(name,lastname,username,password) values ('Sepideh','Olyanasab','sepideh_22','1366')");
            statement.executeUpdate();

            connection.commit();
        }catch (SQLException e){
            System.out.println("khata dar insert "+e.getMessage());
        }
    }
}
