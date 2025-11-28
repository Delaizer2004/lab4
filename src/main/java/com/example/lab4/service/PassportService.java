package com.example.lab4.service;

import com.example.lab4.entity.Passport;
import com.example.lab4.repository.PassportRepository;
import org.springframework.stereotype.Service;

@Service
public class PassportService {
    private final PassportRepository repo;

    public PassportService(PassportRepository repo) { this.repo = repo; }

    public Passport save(Passport p) { return repo.save(p); }
}

