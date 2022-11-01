package ru.kuzmin.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AgencyDto {
    private String name;
    private Integer flatsCount;
}
