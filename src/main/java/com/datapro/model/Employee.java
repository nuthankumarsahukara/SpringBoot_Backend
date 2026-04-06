package com.datapro.model;



import java.time.LocalDate;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="employee_project")
public class Employee {
	
	@Id
	@SequenceGenerator(allocationSize = 1,initialValue = 1001,name = "emp_seq",sequenceName = "emp_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emp_seq")
	@Column(name="emp_id")
	private long empId;
	
	@Column(name="emp_first_name", length=20)
	private String firstName;
	
	@Column(name="emp_last_name",length=20)
	private String lastName;
	
	@Column(name="emp_gender",length = 8)
	private String gender;
	
	@Column(name="emp_dob")
	private LocalDate dob;
	
	@Column(name="emp_phone",columnDefinition = "number(10)")
	private long phoneNumber;
	
	@Column(name="emp_email",length = 35,unique = true)
	private String emailId;
	
	@Column(name="emp_address",length=75)
	private String address;
	
	@Column(name="emp_department",length = 20)
	private String department;
	
	@Column(name="emp_designation",length = 20)
	private String designation;
	
	@Column(name="emp_salary",columnDefinition = "number(8,2)")
	private double salary;
	
	@Column(name="emp_photo")
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private byte[] photo;

}
