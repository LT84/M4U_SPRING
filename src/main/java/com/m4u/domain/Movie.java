package com.m4u.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "name")
    private String name;

    @Column(name = "year")
    private String year;

    @Column(name = "picUrl")
    private String picUrl;

    @Column(name = "description")
    private String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
    private List<Country> countryList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
    private List<Genre> genreList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "movie")
    private List<Actor> actorList;
}
