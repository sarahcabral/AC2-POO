package com.example.demo.controllers;

import java.util.List;

import com.example.demo.model.Curso;
import com.example.demo.service.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService servico;

    @GetMapping
    public List<Curso> getCursos() {
        return servico.getAllCursos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> getEscolaById(@PathVariable int id) {
        Curso curso = servico.getCursoById(id);
        return ResponseEntity.ok(curso);
    }
    


}
