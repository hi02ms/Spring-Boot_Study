package com.example.springstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public Student[] getStudents() {
        Student[] students = {
                new Student("민수", 99),
                new Student("지수", 85),
                new Student("준호", 95)
        };

        return students;
    }

    @GetMapping("/students/filter")
    public List<Student> filterStudents(@RequestParam int minScore) {

        Student[] students = {
                new Student("민수", 99),
                new Student("지수", 85),
                new Student("준호", 95)
        };

        List<Student> filteredStudents = new ArrayList<>();

        for (Student student : students) {
            if (student.getScore() >= minScore) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents;

    }

}
