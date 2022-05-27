package com.m4u.service;

import com.m4u.domain.Actor;
import com.m4u.domain.Country;
import com.m4u.domain.Genre;
import com.m4u.domain.Movie;

import java.util.List;

public interface MovieService {

    Movie insert(
            String nameMovie,
            String year,
            String picUrl,
            String description,
            Country country,
            Genre genre,
            Actor actor
    );

    Movie update(
            int id,
            String nameMovie,
            String year,
            String picUrl,
            String description,
            Country country,
            Genre genre,
            Actor actor
    );

    List<Movie> getAll();

    Movie getById(int id);

    List<Movie> getByName(String nameMovie);

    void deleteById(int id);
}
