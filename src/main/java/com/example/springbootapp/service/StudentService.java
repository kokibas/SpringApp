package com.example.springbootapp.service;

import com.example.springbootapp.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();
    public void deleteStudents(int id);
    public Student saveStudents(Student student);
    public Student getStudents(int id);
    public List<Student> findStudentsByName(String name);
}
