package com.example.lab4.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Lesson> lessons;

    @OneToOne(mappedBy = "teacher", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Passport passport;

    public Teacher() {}

    public Teacher(String name) {
        this.name = name;
    }

    // getters & setters
}
