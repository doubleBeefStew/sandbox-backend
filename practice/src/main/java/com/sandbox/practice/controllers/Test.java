package com.sandbox.practice.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin("https://jubilant-capybara-xr696q5x7xqhq9x-4200.app.github.dev")
public class Test {
    @GetMapping("ping")
    public String Ping() {
        return new String("ivan");
    }
}
