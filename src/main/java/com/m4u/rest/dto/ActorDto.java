package com.m4u.rest.dto;

import com.m4u.domain.Actor;
import com.m4u.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActorDto {

    private int id;

    private String name;

    public static Actor toDomainObject(ActorDto actorDto, Movie movie) {
        return new Actor(actorDto.getId(), actorDto.getName(), movie);
    }

    public static ActorDto toDto(Actor actor) {
        return new ActorDto(actor.getId(), actor.getName());
    }
}
