package com.example.springstudy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentServiceTest {

    @Test
    void testGetStudents() {

        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);

        Student[] students = studentService.getStudents();

        assertEquals(3, students.length);

    }

    @Test
    void testFilterStudentsWith90() {

        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);

        List<Student> students = studentService.filterStudents(90);

        assertEquals(2, students.size());

    }

    @Test
    void testFilterStudentsWith100() {

        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);

        List<Student> students = studentService.filterStudents(100);

        assertEquals(0, students.size());
    }
}
