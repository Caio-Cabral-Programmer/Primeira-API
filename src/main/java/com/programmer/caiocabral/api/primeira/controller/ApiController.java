package com.programmer.caiocabral.api.primeira.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping
    public ResponseEntity<String> HelloWorld() {
        return ResponseEntity.ok("Hello, World!");
    }
}
