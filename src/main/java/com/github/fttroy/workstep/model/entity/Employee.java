package com.github.fttroy.workstep.model.entity;

import com.github.fttroy.workstep.model.embeddable.PersonalData;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long managerId;
    @Embedded
    private PersonalData personalData;
    private String iban;
    private String companyRole;
    private LocalDate assumptionDate;
    private int dayOff;
    @ManyToOne
    @JoinColumn(name="managerId", nullable=true, insertable = false, updatable = false)
    private Employee manager;
}
