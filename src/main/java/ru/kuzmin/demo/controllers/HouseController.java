package ru.kuzmin.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kuzmin.demo.dto.HouseDto;
import ru.kuzmin.demo.services.HouseService;
import java.util.List;

@RestController
public class HouseController {

    private final HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/housesByFloorsCount")
    List<HouseDto> getHousesByFloorsCount(@RequestParam(name = "count") Integer count) {
        return houseService.getHousesByFloorsCount(count);
    }

    @GetMapping("/housesWithFlatsCount")
    List<HouseDto> getHousesWithFlatsCount() {
        return houseService.getHousesWithFlatsCount();
    }
}
