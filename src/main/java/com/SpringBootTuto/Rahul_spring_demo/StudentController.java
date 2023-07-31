package com.SpringBootTuto.Rahul_spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "api")
public class StudentController {

    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/all")
    public List<StudentEntity> getAllStudent(){
     List<StudentEntity> studentList = studentService.getAllStudent();
     return studentList ;
    }

    @PostMapping("/save")
    public StudentEntity createStudent(@RequestBody StudentEntity studentEntity){
        StudentEntity student= studentService.createStudent(studentEntity);
        return student;
    }
//
//    @DeleteMapping("/delet/{id}")
//    public String deletStudent(@PathVariable Long id){
//        String resp =studentService.deletStudent(id);
//        return resp;
//
//    }
//
//    @PutMapping("/update/{id}")
//    public StudentEntity updateStudent(@PathVariable long id ,@RequestBody StudentEntity student){
//        StudentEntity studentnew= studentService.updateStudent(id,student);
//        return studentnew;
//    }
}
