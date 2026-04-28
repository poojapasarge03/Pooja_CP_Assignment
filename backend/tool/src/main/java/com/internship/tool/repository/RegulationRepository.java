package com.internship.tool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.internship.tool.entity.Regulation;

public interface RegulationRepository extends JpaRepository<Regulation, Long> {
}