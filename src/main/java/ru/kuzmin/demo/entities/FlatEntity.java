package ru.kuzmin.demo.entities;

import lombok.Data;
import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity(name="flat")
public class FlatEntity {
    @Id
    @GeneratedValue
    private Long id;
    private Integer floor;
    private Integer number;
    private Integer roomsCount;
    private Integer sqMeterArea;
    private BigDecimal price;
    private Long houseId;
    private Long agencyId;
}
