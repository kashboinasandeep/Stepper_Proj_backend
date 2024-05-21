package com.excelr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.PersonalDetails;
import com.excelr.model.ProfessionalDetails;
import com.excelr.repo.ProfessionalDetailsRepo;

@Service
public class ProfessionalDetailsServiceImpl {
	@Autowired
	private ProfessionalDetailsRepo professionalDetailsRepo;
	
	
	public ProfessionalDetails saveProfessionalDetails(ProfessionalDetails professionalDetails) {
		return professionalDetailsRepo.save(professionalDetails);
	}

	public List<ProfessionalDetails> getProfessionalDetails(){
		return professionalDetailsRepo.findAll();
		
	}

	public Optional<ProfessionalDetails> getProfessionalDetailsById(long id) {
		return professionalDetailsRepo.findById(id);
		
	}

	public String deleteById(long id) {
		professionalDetailsRepo.deleteById(id);
		return "deleted successfully";
	}
	
	public ProfessionalDetails editProfessionalDetails(Long id, ProfessionalDetails professionalDetails) throws Exception {
	    Optional<ProfessionalDetails> optionalEmployee = professionalDetailsRepo.findById(id);
	    
	    if (optionalEmployee.isPresent()) {
	        ProfessionalDetails existingEmployee = optionalEmployee.get();
	        existingEmployee.setDepartment(professionalDetails.getDepartment());
	        return 	professionalDetailsRepo.save(existingEmployee);
	    } else {
	        throw new Exception("Employee not found with id " + id);
	    }
	}
	
	

}
