package com.codeclan.example.Business.repositories;

import com.codeclan.example.Business.models.Department;
import com.codeclan.example.Business.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
