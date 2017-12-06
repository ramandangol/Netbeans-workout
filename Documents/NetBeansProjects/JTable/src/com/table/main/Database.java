/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.table.main;

import model.Data;
import java.util.List;

import java.sql.*;
import java.util.ArrayList;
import model.Data;

/**
 *
 * @author Bladestorm
 */
public class Database {
    public static final String TBL_INCOME = "tblincome";
    public static final String TBL_EXPENSES =  "tblexpenses";
   
    private Connection getConnection() throws  SQLException{
        return DriverManager.getConnection("jdbc:mysql://192.168.40.5/test", "root", "");
    }
    
    public List<Data> getData(String tbl_name) throws  SQLException{
       try(Connection connection = getConnection()){
           String query = "select * from" + tbl_name ;
           
           try(ResultSet rs = connection.createStatement().executeQuery(query)){
               List<Data> list = new ArrayList<>();
               while(rs.next()){
                   Data data = new Data();
                   data.setDate(rs.getString("date"));
                   data.setName(rs.getString("particular"));
                   data.setAmount(rs.getString("amount"));
                   list.add(data);
                  
                  
               }
               return list;
           }
       }
       
    }
    
    
}
