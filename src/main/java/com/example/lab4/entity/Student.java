package com.example.lab4.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "students_lessons",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "lesson_id")
    )
    private List<Lesson> lessons;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters & setters
}
