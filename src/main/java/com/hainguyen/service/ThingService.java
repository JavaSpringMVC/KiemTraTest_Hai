package com.hainguyen.service;

import com.hainguyen.model.Thing;

public interface ThingService {
    Iterable<Thing> findAll();

    Thing findById(Integer id);

    void save(Thing thing);

    void remove(Integer id);
}
