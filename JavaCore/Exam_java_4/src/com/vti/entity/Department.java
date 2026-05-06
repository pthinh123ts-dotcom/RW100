package com.vti.entity;

public class Department {
    int departmentID;
    String departmentName;

    public Department(String departmentName, int departmentID) {
        this.departmentName = departmentName;
        this.departmentID = departmentID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
