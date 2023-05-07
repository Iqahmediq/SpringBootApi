package com.GestionEmploi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionEmploi.Repositories.EmployeeRepository;
import com.GestionEmploi.entities.Department;
import com.GestionEmploi.entities.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
 EmployeeRepository employeeRepository;
	@Override
	public void createEmployee(Employee e) {
	this.employeeRepository.save(e);
		
	}

	@Override
	public List<Employee> getEmployees() {
		return this.employeeRepository.findAll();
	}

	@Override
	public Employee getOneEmployee(long id) {
		return this.employeeRepository.findById(id).get();
	}
	@Override
	public void deleteEmployee(long id) {
	    this.employeeRepository.deleteById(id);
	}
	@Override
    public void updateEmployee(long id, Employee e) {
        Employee existingEmployee = this.employeeRepository.findById(id).get();
        existingEmployee.setEmployeeFirstName(e.getEmployeeFirstName());
        existingEmployee.setEmployeeLasttName(e.getEmployeeLasttName());
        existingEmployee.setEmployeePhone(e.getEmployeePhone());
        existingEmployee.setDepartment(e.getDepartment());

        this.employeeRepository.save(existingEmployee);
    }   
	
}