package com.github.fttroy.workstep.controller;

import com.github.fttroy.workstep.model.resource.DocumentationResource;
import com.github.fttroy.workstep.model.entity.Documentation;
import com.github.fttroy.workstep.service.DocumentationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("documentation-controller")
public class DocumentationController {

    @Autowired
    DocumentationService service;

    @PostMapping(value = "save", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Documentation save(@ModelAttribute DocumentationResource resource) throws IOException {
        return service.save(resource);
    }

    @GetMapping("find-by-id")
    public Documentation findById(@RequestParam Long id) {
        return service.findById(id);
    }
}
