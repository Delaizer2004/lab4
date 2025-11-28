package com.example.lab4.service;

import com.example.lab4.entity.Teacher;
import com.example.lab4.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    private final TeacherRepository repo;

    public TeacherService(TeacherRepository repo) { this.repo = repo; }

    public Teacher save(Teacher t) { return repo.save(t); }
}

