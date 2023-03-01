/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pojo;

/**
 *
 * @author Joe
 */
public class Account {
    private int id;
    private String accName;
    private String password;

    public Account() {
    }

    public Account( String accName, String password) {
        this.accName = accName;
        this.password = password;
    }
    public Account(int id, String accName, String password) {
        this.id = id;
        this.accName = accName;
        this.password = password;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the accName
     */
    public String getAccName() {
        return accName;
    }

    /**
     * @param accName the accName to set
     */
    public void setAccName(String accName) {
        this.accName = accName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
