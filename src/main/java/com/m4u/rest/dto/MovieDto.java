package com.m4u.rest.dto;

import com.m4u.domain.Actor;
import com.m4u.domain.Country;
import com.m4u.domain.Genre;
import com.m4u.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    private List<CountryDto> CountryDtoList;

    private List<GenreDto> GenreDtoList;

    private List<ActorDto> ActorDtoList;

    public static Movie toDomainObject(MovieDto movieDto, List<Country> countries,
                                       List<Genre> genres, List<Actor> actors) {

        return new Movie(
                movieDto.getId(),
                movieDto.getName(),
                movieDto.getYear(),
                movieDto.getPicUrl(),
                movieDto.getDescription(),
                countries,
                genres,
                actors
        );
    }

    public static MovieDto toDto(Movie movie) {

        List<CountryDto> countryDtoList;
        if (movie.getCountryList() != null) {
            countryDtoList = movie.getCountryList().stream().map(CountryDto::toDto).collect(Collectors.toList());
        } else {
            countryDtoList = new ArrayList<>();
        }

        List<GenreDto> genreDtoList;
        if (movie.getGenreList() != null) {
            genreDtoList = movie.getGenreList().stream().map(GenreDto::toDto).collect(Collectors.toList());
        } else {
            genreDtoList = new ArrayList<>();
        }

        List<ActorDto> actorDtoList;
        if (movie.getActorList() != null) {
            actorDtoList = movie.getActorList().stream().map(ActorDto::toDto).collect(Collectors.toList());
        } else {
            actorDtoList = new ArrayList<>();
        }

        return new MovieDto(
                movie.getId(),
                movie.getName(),
                movie.getYear(),
                movie.getPicUrl(),
                movie.getDescription(),
                countryDtoList,
                genreDtoList,
                actorDtoList
        );

    }
}

