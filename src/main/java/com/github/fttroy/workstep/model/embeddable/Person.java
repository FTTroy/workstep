package com.github.fttroy.workstep.model.embeddable;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

import java.time.LocalDate;

@Data
@MappedSuperclass
public class Person {
    private String name;
    private String surname;
    private String email;
    private String taxIdCode;
    private String phoneNumber;
    private String birthPlace;
    private LocalDate birthDate;
    private String nationality;
    @Embedded
    private Address address;
    private String iban;
    private String companyRole;
    private LocalDate assumptionDate;
    private int dayOff;
}
