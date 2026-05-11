package backend;


import entity.Department;
import entity.Position;
import entity.PositionName;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QLPosition {

    public static void showAllPosition() {
        String url = "jdbc:mysql://localhost:3306/rw100_testing_system";
        String username = "root";
        String password = "root";// mk mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null)
                System.out.println("Kết nối không thành công");
            String sql = "SElECT * FROM rw100_testing_system.position;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            List<Position> positions = new ArrayList<>();
            while (resultSet.next()) {
                String name = resultSet.getString("position_name");
                int id = resultSet.getInt("position_id");
                Position position = new Position(id, name);
                positions.add(position);
            }
            for (Position p : positions)
                System.out.println(p);


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void findPositionByname(String searchName) {
        String url = "jdbc:mysql://localhost:3306/rw100_testing_system";
        String username = "root";
        String password = "root";// mk mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);


            if (connection != null)
                System.out.println("kết nối  thành công");
            // tìm phòng ban có tiên là "SELECT * FROM rw100_testing_system.department where department_id like ......;"
            String sql = "SELECT * from rw100_testing_system.department where position_name like ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, searchName);

            ResultSet resultSet = statement.executeQuery();
            List<Position> positions = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("position_id");
                String name = resultSet.getString("position_name");

                PositionName nameEnum = PositionName.valueOf("DEV , SCRUM_MASTER , PM , TEST");
                Position position = new Position(id, name);
                positions.add(position);
            }
            for (Position p : positions)
                System.out.println(p);


        } catch (Exception e) {

        }
    }
}
