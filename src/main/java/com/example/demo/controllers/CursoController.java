package com.example.demo.controllers;

import java.util.List;

import com.example.demo.DTO.CursoDTO;
import com.example.demo.DTO.CursoGetDTO;
import com.example.demo.model.Curso;
import com.example.demo.service.CursoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/{codigo}")
    public ResponseEntity<CursoGetDTO> getCursoByCodigo(@PathVariable int codigo) {
        Curso curso = servico.getCursoByCodigo(codigo);
        CursoGetDTO dto = servico.toDTO(curso);
        return ResponseEntity.ok(dto);
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<Curso> atualizar(@PathVariable int codigo, @RequestBody CursoDTO dto) {
        Curso curso = servico.fromDTO(dto);
        curso.setCursoId(codigo);
        curso = servico.update(curso);
        return ResponseEntity.ok(curso);
    }
    
    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> remove(@PathVariable int codigo) {
        servico.removeByCodigo(codigo);
        return ResponseEntity.noContent().build();
    }


}
