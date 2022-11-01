package ru.kuzmin.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.kuzmin.demo.dto.HouseDto;
import ru.kuzmin.demo.entities.HouseEntity;

import java.util.List;

@Repository
public interface HouseRepository extends JpaRepository<HouseEntity, Long> {

    // b) сформировать список домов (с ценой за кв. метр), количество этажей в
    // которых превышает заданное
    @Query(value="SELECT new ru.kuzmin.demo.dto.HouseDto(h.number, " +
            "s.name, h.floorsCount, h.sqMeterPrice)" +
            "FROM house h " +
            "JOIN street s ON s.id = h.streetId " +
            "WHERE h.floorsCount > :count ")
    List<HouseDto> getHousesByFloorsCount(@Param("count") Integer count);

    // e) рассчитать количество продаваемых квартир в каждом из домов
    @Query(value = "SELECT new ru.kuzmin.demo.dto.HouseDto(h.number, s.name, flatsCount), " +
            "COUNT(f) AS flatsCount " +
            "FROM flat f " +
            "JOIN house h ON h.id = f.houseId " +
            "JOIN street s ON s.id = h.streetId " +
            "GROUP BY h.number, s.name ")
    List<HouseDto> getHousesWithFlatsCount();
}
