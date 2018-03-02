package com.model.andreymurzin.modelapp.data.entity;

public class User {
    private int id;
    private boolean isAdminAccount;
    private String firstName;
    private String lastName;
    private String userName;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public void setAdminAccount(boolean adminAccount) {
        isAdminAccount = adminAccount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public boolean isAdminAccount() {
        return isAdminAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }
}
