package com.github.fttroy.workstep.model.resource;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class DocumentationResource {
    private String name;
    private String content;
    private String notes;
    private MultipartFile file;
}
