package com.m4u.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @OneToOne(targetEntity = Country.class, cascade=CascadeType.ALL)
    @JoinColumn(name = "country_in_movie")
    private Country country;

    @OneToOne(targetEntity = Genre.class, cascade=CascadeType.ALL)
    @JoinColumn(name = "genre_in_movie")
    private Genre genre;

    @OneToOne(targetEntity = Actor.class, cascade=CascadeType.ALL)
    @JoinColumn(name = "actor_in_movie")
    private Actor actor;
}
