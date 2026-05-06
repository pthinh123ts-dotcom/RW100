package com.vti.entity.ex5;

import com.vti.Enum.Gender;

public class Engineer extends Staff {
    private String specialized;

    public Engineer(String name, int age, Gender gender, String address) {
        super(name, age, gender, address);
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "specialized='" + specialized + '\'' +
                '}';
    }
}
