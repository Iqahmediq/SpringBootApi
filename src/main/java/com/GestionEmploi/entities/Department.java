package com.GestionEmploi.entities;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name = "department")
public class Department implements Serializable{
@Id
@GeneratedValue( strategy = GenerationType.IDENTITY)
private Long id;
private String departmentName;
public Long getId() {
return id;
}
public void setId(Long id) {
this.id = id;
}
@JsonBackReference
@OneToMany(mappedBy="department")
Collection<Employee> employees=new ArrayList<>();
public String getDepartmentName() {
return departmentName;
}
public void setDepartmentName(String departmentName) {
this.departmentName = departmentName;
}
public Collection<Employee> getEmployees() {
return employees;
}
public void setEmployees(Collection<Employee> employees) {
this.employees = employees;
}
}