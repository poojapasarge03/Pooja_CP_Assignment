package com.internship.tool.repository;

import com.internship.tool.entity.FineRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FineRecordRepository extends JpaRepository<FineRecord, Long> {

    // Find records by status
    List<FineRecord> findByStatus(String status);

    // Search by company name (case insensitive)
    List<FineRecord> findByCompanyNameContainingIgnoreCase(String companyName);

}