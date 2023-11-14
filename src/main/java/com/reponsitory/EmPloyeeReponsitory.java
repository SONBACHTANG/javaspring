package com.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.EmployeeEntity;
@Repository
public interface EmPloyeeReponsitory extends JpaRepository<EmployeeEntity, Long>{

}
