package com.convert;

import org.springframework.stereotype.Component;

import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;
@Component
public class EmployeeConVert {
		
	public EmployeeDTO toDTO(EmployeeEntity entity) {
		EmployeeDTO dto=new EmployeeDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setWage(entity.getWage());
		
		return dto;
		
	}

}
