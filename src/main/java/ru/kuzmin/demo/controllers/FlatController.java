package ru.kuzmin.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kuzmin.demo.dto.FlatDto;
import ru.kuzmin.demo.services.FlatService;
import java.math.BigDecimal;
import java.util.List;

@RestController
public class FlatController {

    private final FlatService flatService;

    @Autowired
    public FlatController(FlatService flatService) {
        this.flatService = flatService;
    }

    @GetMapping("/twoRoomedFlats")
    List<FlatDto> getTwoRoomedFlats() {
        return flatService.getTwoRoomedFlats();
    }

    @GetMapping("/flatsByStreetAndPrice")
    List<FlatDto> getFlatsByStreetAndPrice(@RequestParam(name = "street") String street,
                                           @RequestParam(name = "price") BigDecimal price) {
        return flatService.getFlatsByStreetAndPrice(street, price);
    }
}
