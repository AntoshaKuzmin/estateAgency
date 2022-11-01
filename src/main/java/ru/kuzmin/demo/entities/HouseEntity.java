package ru.kuzmin.demo.entities;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity(name="house")
public class HouseEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Integer number;
    private Integer floorsCount;
    private BigDecimal sqMeterPrice;
    private Long streetId;
}
