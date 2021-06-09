package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("apis")
public class SwaggerDemoRestController {

    @GetMapping
    public String get() {
        return "get";
    }

    @PostMapping
    public void post() {
    }

    @DeleteMapping
    public void delete() {
    }

    @PutMapping
    public void put() {
    }

    @PatchMapping
    public void patch() {
    }
}
