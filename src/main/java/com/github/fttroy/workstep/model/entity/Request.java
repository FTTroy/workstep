package com.github.fttroy.workstep.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.fttroy.workstep.enumeration.Status;
import com.github.fttroy.workstep.enumeration.Type;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDate;

@Data
@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    private Timestamp createdAt;
    private String notes;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private Status status = Status.PENDING;
    private LocalDate startDate;
    private LocalDate endDate;

    private Long employeeId;
    private Long managerId;

    @ManyToOne
    @JoinColumn(name = "employeeId", insertable = false, updatable = false)
    @JsonIgnore
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "managerId", insertable = false, updatable = false)
    @JsonIgnore
    private Employee manager;
}
