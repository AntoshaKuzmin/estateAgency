package ru.kuzmin.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuzmin.demo.dto.FlatDto;
import ru.kuzmin.demo.repositories.FlatRepository;

import java.math.BigDecimal;
import java.util.List;

@Service
public class FlatService {
    private final FlatRepository flatRepository;

    @Autowired
    public FlatService(FlatRepository flatRepository) {
        this.flatRepository = flatRepository;
    }

    public List<FlatDto> getFlatsByAgencyName(String agencyName) {
        return flatRepository.getFlatsByAgencyName(agencyName);
    }

    public List<FlatDto> getTwoRoomedFlats() {
        return flatRepository.getTwoRoomedFlats();
    }

    public List<FlatDto> getFlatsByStreetAndPrice(String street, BigDecimal price) {
        return flatRepository.getFlatsByStreetAndPrice(street, price);
    }
}
