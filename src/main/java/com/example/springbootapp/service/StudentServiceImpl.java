//package com.example.springbootapp.service;
//
//import com.example.springbootapp.DAO.StudentDAO;
//import com.example.springbootapp.entity.Student;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//@Service
//public class StudentServiceImpl  implements  StudentService{
//    private final StudentDAO studentDAO;
//    @Autowired
//    public StudentServiceImpl(StudentDAO studentDAO) {
//        this.studentDAO = studentDAO;
//    }
//
//    @Override
//    @Transactional
//    public List<Student> getAllStudent() {
//        return studentDAO.getAllStudents();
//    }
//
//    @Override
//    @Transactional
//    public void deleteStudents(int id) {
//        studentDAO.deleteStudents(id);
//    }
//
//    @Override
//    @Transactional
//    public Student saveStudents(Student student) {
//        return  studentDAO.saveStudents(student);
//    }
//
//    @Override
//    @Transactional
//    public Student getStudents(int id) {
//        return studentDAO.getStudent(id);
//    }
//}
