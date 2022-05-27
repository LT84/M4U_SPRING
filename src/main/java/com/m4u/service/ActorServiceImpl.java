package com.m4u.service;

import com.m4u.domain.Actor;
import com.m4u.repository.ActorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl implements ActorService {

    private final ActorRepository actorRepository;

    @Override
    public Actor insert(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public List<Actor> getAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor update(int id, String name) {
        Actor actor = Actor.builder()
                .id(id)
                .name(name)
                .build();
        return actorRepository.save(actor);
    }

    @Override
    public void deleteById(int id) {
        actorRepository.deleteById(id);
    }
}
