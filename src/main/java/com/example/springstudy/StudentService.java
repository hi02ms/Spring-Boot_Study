package com.example.springstudy;

import org.springframework.stereotype.Service;

import  java.util.ArrayList;
import  java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student[] getStudents() {
        return studentRepository.findAll();
    }

    public List<Student> filterStudents(int minScore) {

        List<Student> filteredStudents = new ArrayList<>();

        for (Student student : studentRepository.findAll()) {

            if (student.getScore() >= minScore) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents;
    }
}
