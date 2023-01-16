package com.example.project_server110_springboot.repository.financial;

import com.example.project_server110_springboot.entity.financial.FinancialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialRepository extends JpaRepository<FinancialEntity, Long> {
}
