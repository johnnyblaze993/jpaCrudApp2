package com.roxy.controller;

import com.roxy.entity.GymLeaders;
import com.roxy.repository.GymLeadersRepository;

import java.util.List;
// import java.util.Optional;

// import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
// import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Options;

import io.micronaut.http.HttpResponse;
// import io.micronaut.http.annotation.Post;
// import io.micronaut.http.annotation.Put;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

@ExecuteOn(TaskExecutors.IO)
@Controller("/gymleaders")
public class GymLeadersController {

    protected final GymLeadersRepository gymLeadersRepository;

    public GymLeadersController(GymLeadersRepository gymLeadersRepository) {
        this.gymLeadersRepository = gymLeadersRepository;
    }

    @Get("/")
    public List<GymLeaders> index() {
        return gymLeadersRepository.findAll();
    }



}
