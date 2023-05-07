package com.GestionEmploi.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.GestionEmploi.Services.DepartmentService;
import com.GestionEmploi.entities.Department;
import com.GestionEmploi.models.DepartmentModel;
@RestController
@RequestMapping(value="/api")
@CrossOrigin(value="*") 
public class DepartmentRestController {
@Autowired
DepartmentService departmentService;
@PostMapping("/departments")
void createDepartment(@RequestBody DepartmentModel model) {
Department department= new Department();	
System.out.println(model.getDepartmentName());
department.setDepartmentName(model.getDepartmentName());
this.departmentService.createDepartment(department);
}
@GetMapping("/dali")
List <Department> Departments(){
	return this.departmentService.findDepartments();
}
@GetMapping("/departments/{id}")
Department getOneDepartment(@PathVariable long id) {
return this.departmentService.findOneDepartment(id)	;
}
@PutMapping("/departments/{id}")
void updateDepartment(@PathVariable long id, @RequestBody DepartmentModel model) {
    Department department = this.departmentService.findOneDepartment(id);
    department.setDepartmentName(model.getDepartmentName());
    this.departmentService.updateDepartment(department);
}
}
