package com.example.demo.service;

import com.example.demo.model.Agendamento;
import com.example.demo.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository repository;

    public List<Agendamento> findAll() {
        return repository.findAll();
    }

    public Agendamento save(Agendamento agendamento) {
        return repository.save(agendamento);
    }
}
