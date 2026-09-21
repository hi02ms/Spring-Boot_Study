package com.example.springstudy;

public class Student {
    private String name;
    private int score; // 두 필드를 private로 두는 이유: 캡슐화.

    public Student(String name, int score ) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

}
