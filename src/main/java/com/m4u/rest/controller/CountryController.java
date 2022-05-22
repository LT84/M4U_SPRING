package com.m4u.rest.controller;

import com.m4u.rest.dto.CountryDto;
import com.m4u.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CountryController {
    private final CountryService countryService;

    @GetMapping("/country")
    public List<CountryDto> getAllCountries() {
        return countryService
                .getAll()
                .stream()
                .map(CountryDto::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/country{id}/country_name")
    public void updateActorById(
            @PathVariable int id,
            @RequestParam String name
    ) {
        countryService.update(id, name);
    }

    @DeleteMapping("/country/{id}")
    public void deleteActorById(@PathVariable int id) {
        countryService.deleteById(id);
    }

    @GetMapping("/movie/{id}/country")
    public List<CountryDto> getCountryByMovieId(@PathVariable int id) {
        return countryService
                .getByMovieId(id)
                .stream()
                .map(CountryDto::toDto)
                .collect(Collectors.toList());
    }
}
