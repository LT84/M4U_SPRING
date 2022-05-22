package com.m4u.repository;

import com.m4u.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

    @Modifying
    @Query("update Actor c set c.name = :name where c.id = :id")
    void updateActorById(@Param("id") int id,
                           @Param("name") String content);

    List<Actor> findByMovieId(int id);

    Actor findByName(String name);
}
