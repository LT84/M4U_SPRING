package com.m4u.repository;

import com.m4u.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Integer> {

    @Modifying
    @Query("update Country c set c.name = :name where c.id = :id")
    void updateCountryById(@Param("id") int id,
                         @Param("name") String content);

    List<Country> findByMovieId(int id);

    Country findByName(String name);
}
