package com.example.springstudy;


import org.springframework.stereotype.Repository;

@Repository // “이 클래스는 데이터를 다루는 역할이야”라고 Spring에게 알려주는 표시
public class StudentRepository {

    private final Student[] students = {
            new Student("민수", 99),
            new Student("민호", 85),
            new Student("준호", 95)
    };

    public Student[] findAll() {
        return students;
    }

}
