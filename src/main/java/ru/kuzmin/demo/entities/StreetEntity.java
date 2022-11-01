package ru.kuzmin.demo.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity(name="street")
public class StreetEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
