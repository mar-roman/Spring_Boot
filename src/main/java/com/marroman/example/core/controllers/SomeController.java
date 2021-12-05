package com.dronikon.example.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("/info")
    public String giveInformation() {
        return """
                Hello, my name is Nikita <br>
                My GitHub: github.com/dronikosha;
    }
}
