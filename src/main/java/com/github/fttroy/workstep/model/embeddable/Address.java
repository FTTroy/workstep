package com.github.fttroy.workstep.model.embeddable;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Max;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private String address;
    private String houseNumber;
    private String postalCode;
    private String city;
    @Max(value = 2)
    private String province;
    private String state;
}
