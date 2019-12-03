package com.codeclan.example.Business;

import com.codeclan.example.Business.models.Department;
import com.codeclan.example.Business.models.Employee;
import com.codeclan.example.Business.models.Project;
import com.codeclan.example.Business.repositories.DepartmentRepository;
import com.codeclan.example.Business.repositories.EmployeeRepository;
import com.codeclan.example.Business.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BusinessApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Department tech = new Department("Tech");
		departmentRepository.save(tech);

		Employee bob = new Employee("Bob", "Smith", 1234, tech);
		Project project1 = new Project("Big Project", 14);
		employeeRepository.save(bob);
		projectRepository.save(project1);

		project1.addEmployee(bob);
		projectRepository.save(project1);

		tech.addEmployee(bob);
		departmentRepository.save(tech);

		bob.addProject(project1);
		employeeRepository.save(bob);
	}



}
