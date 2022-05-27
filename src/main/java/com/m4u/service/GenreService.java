package com.m4u.service;

import com.m4u.domain.Genre;

import java.util.List;

public interface GenreService {

    Genre insert(Genre genre);

    List<Genre> getAll();

    Genre update(int id, String nameActor);

    void deleteById(int id);
}
