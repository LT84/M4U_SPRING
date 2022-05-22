package com.m4u.rest.dto;

import com.m4u.domain.Country;
import com.m4u.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CountryDto {

    private int id;

    private String name;

    public static Country toDomainObject(CountryDto countryDto, Movie movie) {
        return new Country(countryDto.getId(), countryDto.getName(), movie);
    }

    public static CountryDto toDto(Country country) {
        return new CountryDto(country.getId(), country.getName());
    }
}
