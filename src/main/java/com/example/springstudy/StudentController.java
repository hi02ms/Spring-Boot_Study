package com.example.springstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public Student[] getStudents() {
        return studentService.getStudents();
    }

    @GetMapping("/students/filter")
    public List<Student> filterStudents(@RequestParam int minScore) {
        return studentService.filterStudents(minScore);

    }

}
