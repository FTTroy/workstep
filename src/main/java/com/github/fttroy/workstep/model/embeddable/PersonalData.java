package com.github.fttroy.workstep.model.embeddable;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDate;

@Data
@Embeddable
public class PersonalData {
    private String name;
    private String surname;
    private String email;
    private String taxIdCode;
    private String phoneNumber;
    private String birthPlace;
    private LocalDate birthDate;
    private String nationality;
    private Address address;
}
