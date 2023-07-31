package com.SpringBootTuto.Rahul_spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<StudentEntity>getAllStudent() {
       List<StudentEntity> studentEntities=  studentRepository.findAll();
       return studentEntities;
    }


    public StudentEntity createStudent(StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
        return studentEntity;
    }

    public String deletStudent(Long id) {
        StudentEntity studentdelet = new StudentEntity();
        studentdelet = studentRepository.findById(id).get();
        studentRepository.delete(studentdelet);
        String res="True";
        return res  ;
    }

    public StudentEntity updateStudent(long id, StudentEntity student) {
        StudentEntity studentNew = studentRepository.findById(id).get();
        studentNew.setStudentName(student.getStudentName());
        studentNew.setStudentSubject(student.getStudentSubject());
        studentRepository.save(studentNew);
        return  studentNew;

    }
}
