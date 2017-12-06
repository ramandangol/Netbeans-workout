/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Student;
import java.sql.*;
import utill.DbConnection;

/**
 *
 * @author Bladestorm
 */
public class StudentDao {

    DbConnection db = new DbConnection();

    public ArrayList<Student> getAllData() {
        ArrayList<Student> userData = new ArrayList<>();
        try {
            PreparedStatement pstmt = db.cn.prepareStatement("Select * from tblexample");
            ResultSet rs = pstmt.executeQuery();
            Student st;
            while (rs.next()) {
                st = new Student(rs.getInt("id"), rs.getInt("phone"), rs.getString("firstname"), rs.getString("lastname"));
                userData.add(st);
            }
        } catch (Exception e) {
        }
        return userData;
    }

    public boolean insert(Student stdInsert) {
        boolean check = false;
        try {
            PreparedStatement pstmt = db.cn.prepareStatement("insert into tblexample(firstname,lastname,phone) values(?,?,?)");
            pstmt.setString(1, stdInsert.getFirstname());
            pstmt.setString(2, stdInsert.getLastname());
            pstmt.setInt(3, stdInsert.getPhone());
            int result = pstmt.executeUpdate();
            if (result > 0) {
                check = true;
            }

        } catch (Exception e) {
        }
        return check;
    }

}
