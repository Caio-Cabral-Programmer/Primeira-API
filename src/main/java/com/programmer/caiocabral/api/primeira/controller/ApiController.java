package com.programmer.caiocabral.api.primeira.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController // Porta de entrada da API. É aqui que o Spring vai interpretar as requisições HTTP e as respostas HTTP. Aqui será feito o roteamento das requisições HTTP.
@RequestMapping(path = "/tasks")
public class ApiController {

    private List<String> tasks = new ArrayList<>();

    private ObjectMapper objectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }


    @GetMapping
    public ResponseEntity<String> listTasks() throws JsonProcessingException {
        return ResponseEntity.ok(objectMapper.writeValueAsString(tasks)); // objectMapper converte a lista de tarefas em uma string JSON e retorna como resposta
    }

    @PostMapping
    public ResponseEntity<Void> createTask(@RequestBody String task) {
        tasks.add(task);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTasks() {
        tasks = new ArrayList<>();
        return ResponseEntity.ok().build();
    }
}
