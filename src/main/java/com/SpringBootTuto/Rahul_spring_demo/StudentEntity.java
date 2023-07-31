package com.SpringBootTuto.Rahul_spring_demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student")

public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long studentId;
    private String studentName;
    private String studentSubject;


}
