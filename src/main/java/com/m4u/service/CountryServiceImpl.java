package com.m4u.service;

import com.m4u.domain.Country;
import com.m4u.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements CountryService {

    private final CountryRepository countryRepository;

    @Override
    public Country insert(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    @Override
    public Country update(int id, String nameCountry) {
        Country country = Country.builder()
                .id(id)
                .name(nameCountry)
                .build();
        return countryRepository.save(country);
    }

    @Override
    public void deleteById(int id) {
        countryRepository.deleteById(id);
    }
}
