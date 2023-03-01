/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pojo;

/**
 *
 * @author Joe
 */
public class User {
    private int id;
    private String lastname;
    private String firstname;
    private int age;
    private int phone;
    private int id_account;

    public User() {
    }

    public User(int id, String lastname, String firstname, int age, int phone, int id_account) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.phone = phone;
        this.id_account = id_account;
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
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the id_account
     */
    public int getId_account() {
        return id_account;
    }

    /**
     * @param id_account the id_account to set
     */
    public void setId_account(int id_account) {
        this.id_account = id_account;
    }
}
