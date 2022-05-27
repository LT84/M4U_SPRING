package com.m4u.service;

import com.m4u.domain.Actor;

import java.util.List;

public interface ActorService {

    Actor insert(Actor actor);

    List<Actor> getAll();

    Actor update(int id, String nameActor);

    void deleteById(int id);
}
