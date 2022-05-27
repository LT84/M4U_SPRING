package com.m4u.rest.dto;

import com.m4u.domain.Actor;
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

    public static Actor toDomainObject(ActorDto actorDto) {
        return new Actor(actorDto.getId(), actorDto.getName());
    }

    public static ActorDto toDto(Actor actor) {
        return new ActorDto(actor.getId(), actor.getName());
    }
}
