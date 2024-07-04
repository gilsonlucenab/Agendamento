package com.example.demo.controller;

import com.example.demo.model.Agendamento;
import com.example.demo.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
public class AgendamentoController {

    @Autowired
    private AgendamentoService service;

    @GetMapping
    public List<Agendamento> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Agendamento create(@RequestBody Agendamento agendamento) {
        return service.save(agendamento);
    }
}
