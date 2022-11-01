package ru.kuzmin.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuzmin.demo.dto.HouseDto;
import ru.kuzmin.demo.repositories.HouseRepository;

import java.util.List;

@Service
public class HouseService {
    private final HouseRepository houseRepository;

    @Autowired
    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public List<HouseDto> getHousesByFloorsCount(Integer floorsCount) {
        return houseRepository.getHousesByFloorsCount(floorsCount);
    }

    public List<HouseDto> getHousesWithFlatsCount() {
        return houseRepository.getHousesWithFlatsCount();
    }
}
