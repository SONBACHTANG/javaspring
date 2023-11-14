package com.service.impl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import com.convert.EmployeeConVert;
import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;
import com.reponsitory.EmPloyeeReponsitory;
import com.service.EmployeetService;
@Service
public class EmployeeServiceImpl implements EmployeetService {
    
	@Autowired(required = true)
	private EmPloyeeReponsitory sReponsitory;
	
	   
	@Autowired
	private EmployeeConVert Converter;

	@Override
	public List<EmployeeDTO> findAll() {
		List<EmployeeDTO> employee = new ArrayList<>();
		
		List<EmployeeEntity> entites=sReponsitory.findAll();
		for (EmployeeEntity item: entites) {
			EmployeeDTO DTO= Converter.toDTO(item);
		
			employee.add( DTO);
		}
		return employee;
	}

	@Override
	public EmployeeEntity save(EmployeeEntity stentity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeEntity update(EmployeeEntity stentity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long[] ids) {
		// TODO Auto-generated method stub
		
	}
	
		
	

}
