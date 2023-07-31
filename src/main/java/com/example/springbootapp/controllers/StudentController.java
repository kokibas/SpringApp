package com.example.springbootapp.controllers;

import com.example.springbootapp.entity.Student;
import com.example.springbootapp.service.ServiceJPA;
import com.example.springbootapp.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @Autowired
    private ServiceJPA service;


    //    @GetMapping(value = "/student", produces = MediaType.APPLICATION_XML_VALUE)
    @GetMapping("/student")
    @Operation(summary = "showAllStudents")
    public List<Student> show() {
        return service.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        return service.getStudents(id);
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return service.saveStudents(student);

    }

    @PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        service.saveStudents(student);
        return student;
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.deleteStudents(id);
    }

    @GetMapping("/student/{name}")
    public List<Student> findAllByName(@PathVariable String name) {
        List<Student> studentsByName = service.findStudentsByName(name);
        return studentsByName;
    }


//    @GetMapping(value="/Show", consumes = "application/json")
//    public Map<Integer, ArrayList<Student>> getAllStudents(){
//            Map<Integer,ArrayList<Student>> arrayListMap = new HashMap<>();
//            ArrayList<Student> students = new ArrayList<>();
//            students.add(new Student(3.8,"Nurym",98989898));
//            arrayListMap.put(1,students);
//            return arrayListMap;
////        return List.of(new Student(3.8,"Nurym",4545454));
//    }

}
