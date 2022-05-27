package com.m4u.service;

import com.m4u.domain.Actor;
import com.m4u.domain.Country;
import com.m4u.domain.Genre;
import com.m4u.domain.Movie;
import com.m4u.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
    private final MovieRepository movieRepository;

    @Override
    public Movie insert(String nameMovie, String year, String picUrl,
                        String description, Country country,
                        Genre genre, Actor actor) {

        Movie movie = Movie.builder()
                .name(nameMovie)
                .year(year)
                .picUrl(picUrl)
                .description(description)
                .country(country)
                .genre(genre)
                .actor(actor)
                .build();

        return movieRepository.save(movie);
    }

    @Override
    public Movie update(int id, String nameMovie, String year, String picUrl,
                        String description, Country country,
                        Genre genre, Actor actor) {

        Movie movie = Movie.builder()
                .id(id)
                .name(nameMovie)
                .year(year)
                .picUrl(picUrl)
                .description(description)
                .country(country)
                .genre(genre)
                .actor(actor)
                .build();

        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getById(int id) {
        return movieRepository.getById(id);
    }

    @Override
    public List<Movie> getByName(String nameMovie) {
        return movieRepository.findByName(nameMovie);
    }

    @Override
    public void deleteById(int id) {
        movieRepository.deleteById(id);
    }
}
