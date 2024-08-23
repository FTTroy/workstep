package com.github.fttroy.workstep.controller;

import com.github.fttroy.workstep.model.entity.Employee;
import com.github.fttroy.workstep.model.entity.Request;
import com.github.fttroy.workstep.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("request-controller")
public class RequestController {

    @Autowired
    RequestService service;

    @PostMapping("save")
    public Request save(@RequestBody Request request) {
        return service.save(request);
    }

    @GetMapping("find-by-id")
    public Request findById(@RequestParam Long id) {
        return service.findById(id);
    }

    @PatchMapping("update")
    public Request update(@RequestBody Request request) {
        return service.update(request);
    }

    @DeleteMapping("delete")
    public void delete(@RequestParam Long id) {
        service.delete(id);
    }
}
