package ru.kuzmin.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kuzmin.demo.entities.StreetEntity;

@Repository
public interface StreetRepository extends JpaRepository<StreetEntity, Long> {
}
