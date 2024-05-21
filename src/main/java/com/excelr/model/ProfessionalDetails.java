package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProfessionalDetails {
	@Id
	private long id;
	private String companyname;
	private String officelocation;
	private String designation;
	private  String department;
	private String experience;
	private String joiningdate;
	

}
