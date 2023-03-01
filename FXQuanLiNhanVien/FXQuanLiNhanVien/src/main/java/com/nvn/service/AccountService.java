/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvn.service;
import com.nvn.conf.JdbcUtils;
import com.pojo.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Joe
 */
public class AccountService {
   public List<Account> getAccounts() throws SQLException{
        List<Account> results = new ArrayList<>();
       try(Connection conn = JdbcUtils.getConn()){
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM account");
            
             while(rs.next()){
                 Account ac = new Account(rs.getInt("id"), rs.getString("accName"), rs.getString("password"));
                 results.add(ac);
              }
       }
      return results;
     
   }
   
   public void addAccount(Account a) throws SQLException{
       try(Connection conn = JdbcUtils.getConn()){
           PreparedStatement stm1 = conn.prepareStatement("INSERT INTO account(accName,password) VALUES(?,?)");
           stm1.setString(1, a.getAccName());
           stm1.setString(2, a.getPassword());
           stm1.executeUpdate();
       }
   }
   
   public void delAccount(int id) throws SQLException{
        try(Connection conn = JdbcUtils.getConn()){
          Statement stm1 = conn.createStatement();       
          String sql = "DELETE FROM account WHERE id =" + id;
          stm1.executeUpdate(sql);
       }
   }
   
   
}
