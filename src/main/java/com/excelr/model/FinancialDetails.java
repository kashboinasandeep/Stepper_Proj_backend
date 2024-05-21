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
public class FinancialDetails {
	@Id
	private long id;
	private String aadharnumber;
	private String pancardnumber;
	private String bankaccountnumber;
	private String payslips;

}
