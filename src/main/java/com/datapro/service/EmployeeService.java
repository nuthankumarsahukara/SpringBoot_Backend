package com.datapro.service;

import java.util.List;

import com.datapro.dto.EmployeeDTO;

public interface EmployeeService {
	EmployeeDTO addEmployee(EmployeeDTO dto,byte[] photo);
	EmployeeDTO updateEmployee(long empId,EmployeeDTO dto,byte[] photo);
	EmployeeDTO getEmployee(long empId);
	EmployeeDTO findByEmailId(String emailId);
	List<EmployeeDTO> getAllEmployees();
	byte[] getEmployeePhoto(long empId);
	void deleteEmployee(long empId);
}
