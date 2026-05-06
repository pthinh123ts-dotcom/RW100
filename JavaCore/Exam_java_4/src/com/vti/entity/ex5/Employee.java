package com.vti.entity.ex5;

import com.vti.Enum.Gender;

public class Employee extends Staff{
    private String task;

    public Employee(String name, int age, Gender gender, String address) {
        super(name, age, gender, address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "task='" + task + '\'' +
                '}';
    }
}
