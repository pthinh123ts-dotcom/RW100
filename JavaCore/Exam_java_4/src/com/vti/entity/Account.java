package com.vti.entity;

import java.time.LocalDate;

public class Account {
   private int accountID;
    private String username;
    private String fullname;
    private Department department;
    private Position position;
    private LocalDate localDate;

    public Account(int accountID, String username, String fullname, Department department, Position position, LocalDate localDate) {
        this.accountID = accountID;
        this.username = username;
        this.fullname = fullname;
        this.department = department;
        this.position = position;
        this.localDate = localDate;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}

