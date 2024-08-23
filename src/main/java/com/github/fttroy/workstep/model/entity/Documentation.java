package com.github.fttroy.workstep.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

/**
 * Entity Mapping for the correspondent table DOCUMENTATION
 * @author f.troiano
 * @since 23/08/2024
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Documentation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    @Column(name = "file", columnDefinition = "LONGBLOB")
    private byte[] file;
    private String name;
    private String content;
    private String notes;
    @CreationTimestamp
    private Timestamp createdAt;
}
