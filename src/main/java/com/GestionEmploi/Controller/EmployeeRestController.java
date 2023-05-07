package com.GestionEmploi.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GestionEmploi.Services.DepartmentService;
import com.GestionEmploi.Services.EmployeeService;
import com.GestionEmploi.entities.Employee;
import com.GestionEmploi.models.EmployeeModel;

@RestController
@RequestMapping(value="/api")
@CrossOrigin(value="*")
public class EmployeeRestController {
@Autowired
	EmployeeService employeeService;
@Autowired
DepartmentService departmentService;
@PostMapping("/employees")
void createEmployee(@RequestBody EmployeeModel e) {
	Employee employee=new Employee();
	employee.setEmployeeLasttName(e.getEmployeeLastName());
	employee.setEmployeeFirstName(e.getEmployeeFirstName());
	employee.setEmployeePhone(e.getEmployeePhoneNumber());
	employee.setDepartment(this.departmentService.findOneDepartment(e.getDepartmentId()));
	
	this.employeeService.createEmployee(employee);
	
	
}
@GetMapping("/employees")
List<Employee> findAllEmployees(){
return this.employeeService.getEmployees();	
}
@GetMapping("/employees/{id}")
Employee getOneEmployee(@PathVariable long id) {
	return this.employeeService.getOneEmployee(id);
}
@DeleteMapping("/employees/{id}")
void deleteEmployee(@PathVariable long id) {
    this.employeeService.deleteEmployee(id);
}
@PutMapping("/employees/{id}")
void updateEmployee(@PathVariable long id, @RequestBody EmployeeModel e) {
    Employee employee = this.employeeService.getOneEmployee(id);
    employee.setEmployeeLasttName(e.getEmployeeLastName());
    employee.setEmployeeFirstName(e.getEmployeeFirstName());
    employee.setEmployeePhone(e.getEmployeePhoneNumber());
    employee.setDepartment(this.departmentService.findOneDepartment(e.getDepartmentId()));

    this.employeeService.updateEmployee(id, employee);
}
}

