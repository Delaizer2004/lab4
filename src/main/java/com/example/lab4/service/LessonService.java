package com.example.lab4.service;

import com.example.lab4.entity.Lesson;
import com.example.lab4.repository.LessonRepository;
import org.springframework.stereotype.Service;

@Service
public class LessonService {
    private final LessonRepository repo;

    public LessonService(LessonRepository repo) { this.repo = repo; }

    public Lesson save(Lesson l) { return repo.save(l); }
}
