package com.roxy.controller;

import io.micronaut.http.annotation.Controller;
//imoort get
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloController {

    @Get("/")
    public String index() {
        return "Hello World";
    }

}
