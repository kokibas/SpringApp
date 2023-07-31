package com.example.springbootapp.DAO;

import com.example.springbootapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
    public List<Student> findStudentByName(String name);
}
