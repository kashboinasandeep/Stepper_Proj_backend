package com.excelr.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.PersonalDetails;
@Repository
public interface PersonalDetailsRepo extends JpaRepository<PersonalDetails, Long> {
	public PersonalDetails getByEmail (String email);

}
