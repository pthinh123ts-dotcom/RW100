package com.vti.backend;

import com.vti.entity.Student;

public class Ex4 {
    public static void ex4() {
        Student student = new Student("thinh", "h1",1f);
        student.plusScore(1f);
        Student student1 = new Student("thinh1", "h2",7f);
        student1.plusScore(7f);
        Student student2 = new Student("thinh2", "h3",9f);
        student2.plusScore(9);
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);



    }
}
