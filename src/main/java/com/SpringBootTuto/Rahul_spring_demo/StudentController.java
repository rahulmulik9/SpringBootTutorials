package com.SpringBootTuto.Rahul_spring_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping( "api")
public class StudentController {
    //simple crud operation
    //include simple class student with Id as primary class and student name and student subject
    //include get all(Get Mapping)
    //save student (Post Mapping)
    //delete student (Delete Mapping)
    //update student (Put Mapping)
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

      //getting all the student
    @GetMapping("/all")
    public List<StudentEntity> getAllStudent(){
     List<StudentEntity> studentList = studentService.getAllStudent();
     return studentList ;
    }


    //saving student
    @PostMapping("/save")
    public StudentEntity createStudent(@RequestBody StudentEntity studentEntity){
        StudentEntity student= studentService.createStudent(studentEntity);
        return student;
    }


    //Delet student
    @DeleteMapping("/delet/{id}")
    public String deletStudent(@PathVariable Long id){
        String resp =studentService.deletStudent(id);
        return resp;

    }


    //update student
    @PutMapping("/update/{id}")
    public StudentEntity updateStudent(@PathVariable long id ,@RequestBody StudentEntity student){
        StudentEntity studentnew= studentService.updateStudent(id,student);
        return studentnew;
    }
}
