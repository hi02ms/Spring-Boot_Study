package com.example.springstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
