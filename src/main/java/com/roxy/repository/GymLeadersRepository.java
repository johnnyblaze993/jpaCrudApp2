package com.roxy.repository;

import com.roxy.entity.GymLeaders;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface GymLeadersRepository extends CrudRepository<GymLeaders, Long> {

}
