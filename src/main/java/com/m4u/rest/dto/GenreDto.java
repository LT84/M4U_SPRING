package com.m4u.rest.dto;

import com.m4u.domain.Genre;
import com.m4u.domain.Movie;
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

    public static Genre toDomainObject(ActorDto actorDto, Movie movie) {
        return new Genre(actorDto.getId(), actorDto.getName(), movie);
    }

    public static GenreDto toDto(Genre genre) {
        return new GenreDto(genre.getId(), genre.getName());
    }
}
