package com.m4u.repository;

import com.m4u.domain.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Integer> {

    @Modifying
    @Query("update Genre c set c.name = :name where c.id = :id")
    void updateGenreById(@Param("id") int id,
                           @Param("name") String content);

    List<Genre> findByMovieId(int id);

    Genre findByName(String name);
}
