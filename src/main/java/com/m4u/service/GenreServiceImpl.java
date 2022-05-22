package com.m4u.service;

import com.m4u.domain.Genre;
import com.m4u.repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {

    private final GenreRepository genreRepository;

    @Override
    public Genre insert(Genre genre) {
        return genreRepository.save(genre);
    }

    @Override
    public List<Genre> getAll() {
        return genreRepository.findAll();
    }

    @Override
    public List<Genre> getByMovieId(int id) {
        return genreRepository.findByMovieId(id);
    }

    @Override
    public Genre update(int id, String name) {
        Genre genre = Genre.builder()
                .id(id)
                .name(name)
                .build();
        return genreRepository.save(genre);
    }

    @Override
    public void deleteById(int id) {
        genreRepository.deleteById(id);
    }
}
