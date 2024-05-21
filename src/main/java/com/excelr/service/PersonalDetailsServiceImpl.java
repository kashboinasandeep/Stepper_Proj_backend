package com.excelr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.PersonalDetails;
import com.excelr.repo.PersonalDetailsRepo;

@Service
public class PersonalDetailsServiceImpl {
@Autowired
 private PersonalDetailsRepo personalDetailsRepo;

public PersonalDetails savePersonalDetails(PersonalDetails personalDetails) {
	return personalDetailsRepo.save(personalDetails);
}

public List<PersonalDetails> getPersonalDetails(){
	return personalDetailsRepo.findAll();
	
}

public Optional<PersonalDetails> getPersonalDetailsById(long id) {
	return personalDetailsRepo.findById(id);
	
}

public String deleteById(long id) {
	personalDetailsRepo.deleteById(id);
	return "deleted successfully";
}
public PersonalDetails editPersonalDetails(Long id, PersonalDetails personalDetails) throws Exception {
    Optional<PersonalDetails> optionalEmployee = personalDetailsRepo.findById(id);
    
    if (optionalEmployee.isPresent()) {
        PersonalDetails existingEmployee = optionalEmployee.get();
        existingEmployee.setEmail(personalDetails.getEmail());
        existingEmployee.setMobilenumber(personalDetails.getMobilenumber());
        return personalDetailsRepo.save(existingEmployee);
    } else {
        throw new Exception("Employee not found with id " + id);
    }
}
}
