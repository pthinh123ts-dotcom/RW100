package com.vti.entity.ex5;

import com.vti.Enum.Gender;

public class Worker extends Staff {
    private int rank;


    public Worker(String name, int age, Gender gender, String address) {
        super(name, age, gender, address);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "rank=" + rank +
                '}';
    }
}
