package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.ProfessionalDetails;
@Repository
public interface ProfessionalDetailsRepo extends JpaRepository<ProfessionalDetails, Long> {

}
