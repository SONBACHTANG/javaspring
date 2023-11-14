package com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.dto.EmployeeDTO;
import com.entity.EmployeeEntity;
@Service
public interface EmployeetService {
	List<EmployeeDTO> findAll();
	EmployeeEntity save(EmployeeEntity stentity);
	EmployeeEntity update(EmployeeEntity stentity);
	void delete(long[] ids);

}
