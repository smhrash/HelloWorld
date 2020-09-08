package demo;

import java.sql.*;

public class ConnectToSQL {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/Sarker";
        String userName = "root";
        String password = "mysql123";
        String query = "select * from customers where first_name = 'Anika'";


        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        String userData = "";

        while (resultSet.next()) {
            userData = resultSet.getInt(1) + " : " + resultSet.getString(2) + " : " + resultSet.getString(3) + " : " + resultSet.getString(4) + " : " + resultSet.getString(5) + " : " + resultSet.getString(6) + " : " + resultSet.getString(7) + " : " + resultSet.getString(8) + " : " + resultSet.getInt(9);

            System.out.println(userData);
        }
        statement.close();
        connection.close();


    }
}
