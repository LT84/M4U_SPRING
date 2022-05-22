package com.m4u.rest.controller;

import com.m4u.rest.dto.ActorDto;
import com.m4u.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ActorController {
    private final ActorService actorService;

    @GetMapping("/actor")
    public List<ActorDto> getAllActors() {
        return actorService
                .getAll()
                .stream()
                .map(ActorDto::toDto)
                .collect(Collectors.toList());
    }

    @PostMapping("/actor{id}/actor_name")
    public void updateActorById (
            @PathVariable int id,
            @RequestParam String name
    ) {
        actorService.update(id, name);
    }

    @DeleteMapping("/actor/{id}")
    public void deleteActorById(@PathVariable int id) {
        actorService.deleteById(id);
    }

    @GetMapping("/movie/{id}/actor")
    public List<ActorDto> getActorByMovieId(@PathVariable int id) {

        return actorService
                .getByMovieId(id)
                .stream()
                .map(ActorDto::toDto)
                .collect(Collectors.toList());
    }
}
