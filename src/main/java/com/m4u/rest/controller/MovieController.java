package com.m4u.rest.controller;

import com.m4u.rest.dto.MovieDto;
import com.m4u.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/movie")
    public List<MovieDto> getAllMovies() {

        return movieService
                .getAll()
                .stream()
                .map(MovieDto::toDto)
                .collect(Collectors.toList());
    }
}
