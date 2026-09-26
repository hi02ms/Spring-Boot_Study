package com.example.springstudy;

import org.springframework.stereotype.Service;

import  java.util.ArrayList;
import  java.util.List;

@Service
public class StudentService {

    private final Student[] students = {
            new Student("민수", 99),
            new Student("지수", 85),
            new Student("준호", 95)
    };

    public Student[] getStudents() {
        return students;
    }

    public List<Student> filterStudents(int minScore) {

        List<Student> filteredStudents = new ArrayList<>();

        for (Student student : students) {

            if (student.getScore() >= minScore) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents;
    }
}
