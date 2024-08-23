package com.github.fttroy.workstep.service;

import com.github.fttroy.workstep.model.resource.DocumentationResource;
import com.github.fttroy.workstep.model.entity.Documentation;
import com.github.fttroy.workstep.repository.DocumentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DocumentationService {
    @Autowired
    DocumentationRepository repository;

    public Documentation save(DocumentationResource resource) throws IOException {
        Documentation documentation = Documentation.builder()
                .name(resource.getName())
                .content(resource.getContent())
                .notes(resource.getNotes())
                .file(resource.getFile().getBytes())
                .build();
        return repository.save(documentation);
    }

    public Documentation findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
