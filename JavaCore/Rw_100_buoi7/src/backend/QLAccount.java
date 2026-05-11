package backend;

import entity.Account;
import entity.Department;
import entity.Position;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class QLAccount {
    public static void showAllAccount() {
        String url = "jdbc:mysql://localhost:3306/rw100_testing_system";
        String username = "root";
        String password = "root";// mk mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);


            if (connection != null)
                System.out.println("kết nối  thành công");
            String sql = "SELECT * FROM rw100_testing_system.account;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            List<Account> accounts = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt("account_id");
                String email = resultSet.getString("email");
                String userName = resultSet.getString("username");
                String fullname = resultSet.getString("fullname");
                int departmentid = resultSet.getInt("departmentid");
                int positionid = resultSet.getInt("positionid");
                LocalDate localDate1 = resultSet.getObject("created_date", LocalDate.class);

                Account account = new Account(id, email, userName, fullname, departmentid, positionid );
                accounts.add(account);
            }
            for (Account a : accounts)
                System.out.println(a);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static void findByUsername(String findUserName) {
        String url = "jdbc:mysql://localhost:3306/rw100_testing_system";
        String username = "root";
        String password = "root";// mk mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Kết nối thành công");
                
                String sql = "SELECT * FROM rw100_testing_system.account WHERE username LIKE ?";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, findUserName);
                ResultSet resultSet = statement.executeQuery();
                List<Account> accounts = new ArrayList<Account>();
                while (resultSet.next()) {
                    int id = resultSet.getInt("account_id");
                    String email = resultSet.getString("email");
                    String username1 = resultSet.getString("username");
                    String fullname = resultSet.getString("fullname");
                    int departmentid = resultSet.getInt("departmentid");
                    int positionid = resultSet.getInt("positionid");

                    Account account = new Account(id, email, username1, fullname, departmentid, positionid);
                    accounts.add(account);
                }
            }
        } catch (Exception e) {

        }


    }public static void findByUsername_and_fullname(String findUserName , String findFullName) {
        String url = "jdbc:mysql://localhost:3306/rw100_testing_system";
        String username = "root";
        String password = "root";// mk mysql
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                String sql = "SELECT * FROM rw100_testing_system.account WHERE username LIKE ? and fullname LIKE ? ";
                PreparedStatement statement = connection.prepareStatement(sql);
                statement.setString(1, findUserName);
                statement.setString(2,findFullName);
                ResultSet resultSet = statement.executeQuery();
                List<Account> accounts = new ArrayList<Account>();
                while (resultSet.next()) {
                    int id = resultSet.getInt("account_id");
                    String email = resultSet.getString("email");
                    String username1 = resultSet.getString("username");
                    String fullname = resultSet.getString("fullname");
                    int departmentid = resultSet.getInt("departmentid");
                    int positionid = resultSet.getInt("positionid");


                    Account account = new Account(id, email, username1, fullname, departmentid, positionid);
                    accounts.add(account);
                }
            }
        } catch (Exception e) {

        }


    }


}
