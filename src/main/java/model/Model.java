package model;

import entity.LeaveRecord;
import entity.User;

import java.sql.*;
import java.util.ArrayList;

public class Model {

    public static Connection connection;

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    public ArrayList<Phone> list() {
//        ArrayList<Phone> listPhones = new ArrayList<>();
//        try{
//            PreparedStatement preparedStatement = connection.prepareStatement("select * from phones");
//            ResultSet rs = preparedStatement.executeQuery();
//            Phone phone = null;
//            while (rs.next()) {
//                phone = new Phone();
//                phone.setId(rs.getInt(1));
//                phone.setName(rs.getString(2));
//                phone.setBrand(rs.getString(3));
//                phone.setPrice(rs.getInt(4));
//                phone.setDescription(rs.getString(5));
//                listPhones.add(phone);
//            }
//            return listPhones;
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return null;
//    }

    public boolean insertUser(User user) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users (username, password, name, position) values (?,?,?,?)");
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getName());
            preparedStatement.setInt(4, user.getPosition());
            preparedStatement.execute();
            return true;
        }catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public User getOneUser(String username, String password) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users where username=? and password=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            User user = null;
            while (rs.next()) {
                user = new User();
                user.setUsername(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setName(rs.getString(4));
                user.setPosition(rs.getInt(5));
            }
            return user;
        }catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean insertLeaveRecord(LeaveRecord leaveRecord) {
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into leaves (name, reason) values (?,?)");
            preparedStatement.setString(1, leaveRecord.getName());
            preparedStatement.setString(2, leaveRecord.getReason());
            preparedStatement.execute();
            return true;
        }catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }
}
