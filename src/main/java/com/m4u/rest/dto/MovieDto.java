package com.m4u.rest.dto;

import com.m4u.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private int id;

    private String name;

    private String year;

    private String picUrl;

    private String description;

    private CountryDto countryDto;

    private GenreDto genreDto;

    private ActorDto actorDto;

    public static Movie toDomainObject(MovieDto movieDto) {

        return new Movie(
                movieDto.getId(),
                movieDto.getName(),
                movieDto.getYear(),
                movieDto.getPicUrl(),
                movieDto.getDescription(),
                CountryDto.toDomainObject(movieDto.getCountryDto()),
                GenreDto.toDomainObject(movieDto.getGenreDto()),
                ActorDto.toDomainObject(movieDto.getActorDto())
        );
    }

    public static MovieDto toDto(Movie movie) {

        return new MovieDto(
                movie.getId(),
                movie.getName(),
                movie.getYear(),
                movie.getPicUrl(),
                movie.getDescription(),
                CountryDto.toDto(movie.getCountry()),
                GenreDto.toDto(movie.getGenre()),
                ActorDto.toDto(movie.getActor())
        );
    }
}

