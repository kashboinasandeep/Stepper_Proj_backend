package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.HrDetails;
@Repository
public interface HrDetaillsRepo extends JpaRepository<HrDetails, Long> {

}
