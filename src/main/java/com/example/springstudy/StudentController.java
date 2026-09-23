package com.example.springstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/students/filter")
    public Student[] filterStudents(@RequestParam int minScore) {

        Student[] students = {
                new Student("민수", 99),
                new Student("지수", 85),
                new Student("준호", 95)
        };

        int count = 0;

        for (Student student : students) {
            if (student.getScore() >= minScore) {
                count++;
            }
        }

        Student[] filteredStudents = new Student[count];

        int index = 0;

        for (Student student : students) {
            if (student.getScore() >= minScore) {
                filteredStudents[index] = student;
                index ++;
            }
        }

        return filteredStudents;

    }

}
