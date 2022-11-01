package ru.kuzmin.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kuzmin.demo.dto.AgencyDto;
import ru.kuzmin.demo.dto.FlatDto;
import ru.kuzmin.demo.services.AgencyService;
import ru.kuzmin.demo.services.FlatService;
import java.util.List;

@RestController
public class AgencyController {

    private final FlatService flatService;
    private final AgencyService agencyService;

    @Autowired
    public AgencyController(FlatService flatService, AgencyService agencyService) {
        this.flatService = flatService;
        this.agencyService = agencyService;
    }

    @GetMapping("/flatsByAgencyName")
    List<FlatDto> getFlatsByAgencyName(@RequestParam(name = "name") String name) {
        return flatService.getFlatsByAgencyName(name);
    }

    @GetMapping("/agenciesWithFlatsCount")
    List<AgencyDto> getAgenciesWithFlatsCount() {
        return agencyService.getAgenciesWithFlatsCount();
    }
}
