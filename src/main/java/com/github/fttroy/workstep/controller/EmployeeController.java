package com.github.fttroy.workstep.controller;

import com.github.fttroy.workstep.model.entity.Employee;
import com.github.fttroy.workstep.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee-controller")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("save")
    public Employee save(@RequestBody Employee employee) {
        return service.save(employee);
    }

    @GetMapping("find-by-id")
    public Employee findById(@RequestParam Long id) {
        return service.findById(id);
    }

    @PatchMapping("update")
    public Employee update(@RequestBody Employee employee) {
        return service.update(employee);
    }

    @DeleteMapping("delete")
    public void delete(@RequestParam Long id) {
        service.delete(id);
    }
}
