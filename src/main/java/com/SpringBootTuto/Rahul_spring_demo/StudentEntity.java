package com.SpringBootTuto.Rahul_spring_demo;

import javax.persistence.*;

@Entity
@Table(name = "student")

public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int studentId;
    private String studentName;
    private String studentSubject;
}
