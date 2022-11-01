package ru.kuzmin.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.kuzmin.demo.dto.FlatDto;
import ru.kuzmin.demo.entities.FlatEntity;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface FlatRepository extends JpaRepository<FlatEntity, Long> {

    // a) вывести список квартир (с адресами размещения и кол-вом комнат),
    // продажей которых занимается заданное Агентство
    @Query(value = "SELECT new ru.kuzmin.demo.dto.FlatDto(s.name, h.number, f.number, ag.name) " +
            "FROM flat f " +
            "JOIN house h ON h.id = f.houseId " +
            "JOIN street s ON s.id = h.streetId " +
            "JOIN agency ag ON ag.id = f.agencyId " +
            "WHERE ag.name = :agencyName ")
    List<FlatDto> getFlatsByAgencyName(@Param("agencyName") String agencyName);

    // c) сформировать список двухкомнатных квартир (со стоимостью квартиры и
    // адресом размещения)
    @Query(value = "SELECT new ru.kuzmin.demo.dto.FlatDto(s.name, h.number, f.number, f.price) " +
            "FROM flat f " +
            "JOIN house h ON h.id = f.houseId " +
            "JOIN street s ON s.id = h.streetId " +
            "WHERE f.roomsCount = 2")
    List<FlatDto> getTwoRoomedFlats();

    // f) сформировать список квартир, расположенных на заданной улице, цена которых
    // не превышает заданную
    @Query(value = "SELECT new  ru.kuzmin.demo.dto.FlatDto(h.number, f.number) " +
            "FROM flat f " +
            "JOIN house  h ON  h.id = f.houseId " +
            "JOIN street s ON s.id = h.streetId " +
            "WHERE s.name = :street AND f.price <= :price ")
    List<FlatDto> getFlatsByStreetAndPrice(@Param("street") String street, @Param("price") BigDecimal price);
}
