package ru.kuzmin.demo.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class HouseDto {
    private Integer number;
    private String street;
    private Integer floorsCount;
    private BigDecimal sqMeterPrice;
    private Integer flatsCount;

    public HouseDto(Integer number,
                    String street,
                    Integer floorsCount,
                    BigDecimal sqMeterPrice) {
        this.number = number;
        this.street = street;
        this.floorsCount = floorsCount;
        this.sqMeterPrice = sqMeterPrice;
    }

    public HouseDto(Integer number,
                    String street,
                    Integer flatsCount) {
        this.number = number;
        this.street = street;
        this.flatsCount = flatsCount;
    }
}
