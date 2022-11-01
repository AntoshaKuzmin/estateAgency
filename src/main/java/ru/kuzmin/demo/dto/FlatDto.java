package ru.kuzmin.demo.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class FlatDto {
    private String street;
    private Integer houseNumber;
    private Integer flatNumber;
    private String agency;
    private BigDecimal totalPrice;

    public FlatDto(String street,
                   Integer houseNumber,
                   Integer flatNumber,
                   String agency) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.agency = agency;
    }

    public FlatDto(String street,
                   Integer houseNumber,
                   Integer flatNumber,
                   BigDecimal totalPrice) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.totalPrice = totalPrice;
    }

    public FlatDto(Integer houseNumber, Integer flatNumber) {
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
    }
}
