package com.m4u.rest.dto;

import com.m4u.domain.Genre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GenreDto {

    private int id;

    private String name;

    public static Genre toDomainObject(GenreDto genreDto) {
        return new Genre(genreDto.getId(), genreDto.getName());
    }

    public static GenreDto toDto(Genre genre) {
        return new GenreDto(genre.getId(), genre.getName());
    }
}
