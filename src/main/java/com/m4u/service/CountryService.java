package com.m4u.service;

import com.m4u.domain.Country;

import java.util.List;

public interface CountryService {

    Country insert(Country country);

    List<Country> getAll();

    Country update(int id, String nameCountry);

    void deleteById(int id);

}
