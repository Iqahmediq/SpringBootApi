package com.GestionEmploi.Services;

import java.util.List;

import com.GestionEmploi.entities.Department;

public interface DepartmentService {
void createDepartment(Department d);
List<Department> findDepartments();
Department findOneDepartment(long id);
void updateDepartment(Department d);
}