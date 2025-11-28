package com.example.lab4.service;

import com.example.lab4.entity.Student;
import com.example.lab4.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public Student save(Student s) { return repo.save(s); }

    public Student get(Long id) { return repo.findById(id).orElse(null); }

    public List<Student> getAll() { return repo.findAll(); }

    public void delete(Long id) { repo.deleteById(id); }
}
