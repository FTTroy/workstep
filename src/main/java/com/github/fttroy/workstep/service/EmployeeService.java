package com.github.fttroy.workstep.service;

import com.github.fttroy.workstep.model.entity.Employee;
import com.github.fttroy.workstep.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public Employee findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Employee update(Employee employee) {
        Employee employeeDb = repository.findById(employee.getId()).orElseThrow();
        BeanUtils.copyProperties(employee, employeeDb);
        return repository.save(employeeDb);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
