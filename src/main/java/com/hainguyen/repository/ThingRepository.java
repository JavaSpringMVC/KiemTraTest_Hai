package com.hainguyen.repository;

import com.hainguyen.model.Thing;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ThingRepository extends PagingAndSortingRepository<Thing, Integer> {
}
