package ru.kuzmin.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kuzmin.demo.dto.AgencyDto;
import ru.kuzmin.demo.repositories.AgencyRepository;

import java.util.List;

@Service
public class AgencyService {
    private final AgencyRepository agencyRepository;

    @Autowired
    public AgencyService(AgencyRepository agencyRepository) {
        this.agencyRepository = agencyRepository;
    }

    public List<AgencyDto> getAgenciesWithFlatsCount() {
        return agencyRepository.getAgenciesWithFlatsCount();
    }
}
