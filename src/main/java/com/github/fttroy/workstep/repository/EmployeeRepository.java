package com.github.fttroy.workstep.repository;

import com.github.fttroy.workstep.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
