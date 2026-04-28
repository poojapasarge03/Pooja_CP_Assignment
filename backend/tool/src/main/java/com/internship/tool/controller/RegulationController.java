package com.internship.tool.controller;

import org.springframework.web.bind.annotation.*;

import com.internship.tool.entity.Regulation;
import com.internship.tool.service.RegulationService;

import java.util.List;

@RestController
@RequestMapping("/api/regulations")
public class RegulationController {

    private final RegulationService service;

    // ✅ MANUAL CONSTRUCTOR (fixes your error)
    public RegulationController(RegulationService service) {
        this.service = service;
    }

    @GetMapping
    public List<Regulation> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Regulation create(@RequestBody Regulation reg) {
        return service.create(reg);
    }

    @GetMapping("/{id}")
    public Regulation getById(@PathVariable Long id) {
        return service.getById(id);
    }
}