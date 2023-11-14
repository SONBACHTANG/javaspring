package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dto.EmployeeDTO;
@Service
public interface EmployeetService {
	List<EmployeeDTO> findAll();
	EmployeeDTO save(EmployeeDTO dto);
	

}
