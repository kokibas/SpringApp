//package com.example.springbootapp.DAO;
//
//import com.example.springbootapp.entity.Student;
//import jakarta.persistence.EntityManager;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.query.Query;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class StudentDAOImpl implements  StudentDAO{
//    private final EntityManager entityManager;
//    @Autowired
//    public StudentDAOImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//
//
//
//
//    @Override
//    public List<Student> getAllStudents() {
//        Session session = entityManager.unwrap(Session.class);
//        Query<Student> studentQuery =  session.createQuery("from Student",Student.class);
//        List<Student> students = studentQuery.getResultList();
//        return students;
//    }
//
//    @Override
//    public void deleteStudents(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Query studentQuery = session.createQuery("delete from Student where id =:studentId");
//        studentQuery.setParameter("studentId",id);
//        studentQuery.executeUpdate();
//    }
//
//    @Override
//    public Student saveStudents(Student student) {
//        Session session = entityManager.unwrap(Session.class);
//        session.saveOrUpdate(student);
//        return student;
//    }
//
//    @Override
//    public Student getStudent(int id) {
//        Session session = entityManager.unwrap(Session.class);
//        Student student = session.get(Student.class,id);
//        return student;
//    }
//}
