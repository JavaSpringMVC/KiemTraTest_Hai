package com.hainguyen.service;

import com.hainguyen.model.Thing;
import com.hainguyen.repository.ThingRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ThingServiceImpl implements ThingService {
    @Autowired
    ThingRepository thingRepository;

    @Override
    public Iterable<Thing> findAll() {
        return thingRepository.findAll();
    }

    @Override
    public Thing findById(Integer id) {
        return thingRepository.findOne(id);
    }

    @Override
    public void save(Thing thing) {
        thingRepository.save(thing);
    }

    @Override
    public void remove(Integer id) {
        thingRepository.delete(id);
    }
}
