package com.internship.tool.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "fine_records")
@Data
public class FineRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String violationType;

    @Column(nullable = false)
    private Double fineAmount;

    @Column(nullable = false)
    private String status; // OPEN, CLOSED, UNDER_REVIEW

    @Column(length = 1000)
    private String description;

    @Column(length = 1000)
    private String recommendations;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Automatically set when record is created
    @PrePersist
    public void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Automatically update when record changes
    @PreUpdate
    public void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}