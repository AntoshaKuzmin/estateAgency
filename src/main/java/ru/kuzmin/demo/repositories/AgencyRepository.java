package ru.kuzmin.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kuzmin.demo.dto.AgencyDto;
import ru.kuzmin.demo.entities.AgencyEntity;

import java.util.List;

@Repository
public interface AgencyRepository extends JpaRepository<AgencyEntity, Long> {

    // d) сформировать распределение количества квартир по Агентствам
    @Query(value = "SELECT new ru.kuzmin.demo.dto.AgencyDto(a.name, flatsCount), " +
            "COUNT(f) AS flatsCount " +
            "FROM flat f " +
            "JOIN agency a ON a.id = f.agencyId " +
            "GROUP BY a.name")
    List<AgencyDto> getAgenciesWithFlatsCount();
}
