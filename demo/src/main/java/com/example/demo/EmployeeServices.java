package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;
public interface EmployeeServices extends JpaRepository<Employee, Long>{
	
}
