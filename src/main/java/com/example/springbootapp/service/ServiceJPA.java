package com.example.springbootapp.service;

import com.example.springbootapp.DAO.StudentRepository;
import com.example.springbootapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ServiceJPA implements StudentService {
    private StudentRepository studentRepository;
    @Autowired
    public ServiceJPA(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }



    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudents(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student saveStudents(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudents(int id) {
        Student student = null;
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()){
            student = optionalStudent.get();
        }else {
            System.out.println("not found");
        }
        return student;
    }

    @Override
    public List<Student> findStudentsByName(String name) {
        List<Student> studentByName = studentRepository.findStudentByName(name);
        return studentByName;
    }
}
