package com.github.fttroy.workstep.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.fttroy.workstep.model.embeddable.Person;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Employee extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long managerId;

    @ManyToOne
    @JoinColumn(name = "managerId", nullable = true, insertable = false, updatable = false)
    @JsonIgnore
    private Employee manager;
}

