package com.m4u.rest.controller;

import com.m4u.rest.dto.GenreDto;
import com.m4u.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class GenreController {
    private final GenreService genreService;

    @GetMapping("/genre")
    public List<GenreDto> getAllCountries() {
        return genreService
                .getAll()
                .stream()
                .map(GenreDto::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/genre{id}/genre_name")
    public void updateGenreById(
            @PathVariable int id,
            @RequestParam String name
    ) {
        genreService.update(id, name);
    }

    @DeleteMapping("/genre/{id}")
    public void deleteGenreById(@PathVariable int id) {
        genreService.deleteById(id);
    }

    @GetMapping("/movie/{id}/genre")
    public List<GenreDto> getGenreByMovieId(@PathVariable int id) {
        return genreService
                .getByMovieId(id)
                .stream()
                .map(GenreDto::toDto)
                .collect(Collectors.toList());
    }
}
