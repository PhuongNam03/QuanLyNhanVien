/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvn.account;
import com.nvn.conf.JdbcUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 *
 * @author Joe
 */
public class AccountTester {
    private static Connection conn;
    @BeforeAll
    public static void beforeAll() throws SQLException{
        conn = JdbcUtils.getConn();
        
    }
    
    @AfterAll
    public static void afterAll() throws SQLException{
        if(conn != null)
            conn.close();
    }
    
    /*@Test
    public void testUnique() throws SQLException{
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM account");
        
         while(rs.next()){
             String accoutName = rs.getString("accName");
             System.out.println(accoutName);
         }
       
    }*/
}
