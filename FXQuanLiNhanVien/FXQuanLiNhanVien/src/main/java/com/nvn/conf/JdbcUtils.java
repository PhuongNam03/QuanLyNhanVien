/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvn.conf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Joe
 */
public class JdbcUtils {
    private static Connection conn;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    /**
     * @return the conn
     */
    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost/qlnvdb","root","123456789");
    }
}
