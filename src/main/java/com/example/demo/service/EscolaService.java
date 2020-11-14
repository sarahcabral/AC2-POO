package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Escola;
import com.example.demo.repository.EscolaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


@Service
public class EscolaService {

    @Autowired
    private EscolaRepository repositorio;
    
    public List<Escola> getAllEscolas() {
        return repositorio.getAllEscolas();
    }
    
    public Escola getEscolaById(int id) {
        Optional <Escola> op = repositorio.getEscolaById(id);
        return op.orElseThrow( ()  -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Escola não cadastrada"));
	}
    
    public Escola salvar(Escola escola) {
        return repositorio.salvar(escola);
    }

    
}
