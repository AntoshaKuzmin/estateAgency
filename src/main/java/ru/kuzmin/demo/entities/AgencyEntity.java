package ru.kuzmin.demo.entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity(name="agency")
public class AgencyEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
