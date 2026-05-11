package backend;

import entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QLDepartment {

    public static void qldepartment() {
        String url = "jdbc:mysql://localhost:3306/rw100_testing_system";
        String username = "root";
        String password = "root";// mk mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            ;

            if (connection != null)
                System.out.println("kết nối  thành công");

            String sql = "SELECT * FROM rw100_testing_system.department;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            List<Department> departments = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("department_id");
                String name = resultSet.getString("department_name");
                Department department = new Department(id, name);
                departments.add(department);

            }
            for (Department d : departments)
                System.out.println(d);


        } catch (Exception e) {
            System.out.println("kết nối  không thành công");
        }
        // tìm các phòng ban có chữ n


    }

    public static void findByName( String searchName, int seachrid ) {
        String url = "jdbc:mysql://localhost:3306/rw100_testing_system";
        String username = "root";
        String password = "root";// mk mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);


            if (connection != null)
                System.out.println("kết nối  thành công");
            // tìm phòng ban có tiên là "SELECT * FROM rw100_testing_system.department where department_id like ......;"
            String sql = "SELECT * from rw100_testing_system.department where department_name like ? and department_id = ? ";
            ;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, searchName);
            statement.setInt(2, seachrid);
            ResultSet resultSet = statement.executeQuery();
            List<Department> departments = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("department_id");
                String name = resultSet.getString("department_name");
                Department department = new Department(id, name);
                departments.add(department);

            }
            for (Department d : departments) {

                System.out.println("Nhân viên bạn tìm kiếm là : ");
                System.out.println(d);
            }




        } catch (Exception e){

        }

    }
    public static void findDepartment( ) {
        String url = "jdbc:mysql://localhost:3306/rw100_testing_system";
        String username = "root";
        String password = "root";// mk mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);


            if (connection != null)
                System.out.println("kết nối  thành công");
            // tìm phòng ban có tiên là "SELECT * FROM rw100_testing_system.department where department_id like ......;"
            String sql = "SELECT     d.department_name,     COUNT(d.department_id) AS total_employees\n" +
                    "FROM `department` d\n" +
                    "JOIN `account` a ON d.department_id = a.department_id\n" +
                    "GROUP BY d.department_id, d.department_name\n" +
                    "HAVING  COUNT(d.department_id) >= 2;";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();
            List<Department> departments = new ArrayList<>();
            while (resultSet.next()) {
                int totalEmployees = resultSet.getInt("total_employees");
                String name = resultSet.getString("department_name");
                Department department = new Department(totalEmployees , name);
                departments.add(department);

            }
            for (Department d : departments) {
                System.out.println("Nhân viên bạn tìm kiếm là : ");
                System.out.println(d);
            }



        } catch (Exception e){

        }
}
}







