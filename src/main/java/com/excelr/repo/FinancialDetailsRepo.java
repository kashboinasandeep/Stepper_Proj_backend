package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.FinancialDetails;
@Repository
public interface FinancialDetailsRepo extends JpaRepository<FinancialDetails,Long> {

}
