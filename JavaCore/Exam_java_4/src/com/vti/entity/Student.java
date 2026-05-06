package com.vti.entity;

public class Student {
    private String name;
    private String hometown;
    private float score;

    public Student(String name, String hometown, float score) {
        this.name = name;
        this.hometown = hometown;
        this.score = (float) 0;
    }

    public void setScore(float score) {
        this.score = score;

    }
    public void plusScore(float score){
        this.score = this.score + score;
    }

    @Override
    public String toString() {
        String rank = null;
        if (this.score < 4.0) {
            rank = "Yếu";
        } else if (this.score < 6.0) {
            rank = "Trung bình";
        } else if (this.score < 8.0) {
            rank = "Khá";
        } else {
            rank = "Giỏi";
        }
        return "Student{" +
                "name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", score=" + score +
                ", rank='" + rank + '\'' +
                '}';
    }
}
