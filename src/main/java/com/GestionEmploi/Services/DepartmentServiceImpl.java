package com.GestionEmploi.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.GestionEmploi.Repositories.DepartmentRepository;
import com.GestionEmploi.entities.Department;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentRepository departmentRepository;
	@Override
	public void createDepartment(Department d) {
		this.departmentRepository.save(d);
		
	}

	@Override
	public List<Department> findDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department findOneDepartment(long id) {
		return this.departmentRepository.findById(id).get();
	}
    @Override
    public void updateDepartment(Department d) {
        this.departmentRepository.save(d);
    }

}