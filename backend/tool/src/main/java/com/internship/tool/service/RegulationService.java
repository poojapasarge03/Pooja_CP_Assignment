package com.internship.tool.service;

import org.springframework.stereotype.Service;

import com.internship.tool.entity.Regulation;
import com.internship.tool.repository.RegulationRepository;
import com.internship.tool.exception.ResourceNotFoundException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RegulationService {

    private final RegulationRepository repository;

    public RegulationService(RegulationRepository repository) {
        this.repository = repository;
    }

    public Regulation create(Regulation reg) {
        reg.setCreatedAt(LocalDateTime.now());
        return repository.save(reg);
    }

    public List<Regulation> getAll() {
        return repository.findAll();
    }

    public Regulation getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Regulation not found with id: " + id));
    }
}