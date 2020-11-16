package com.example.demo.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.DTO.EscolaDTO;
import com.example.demo.model.Curso;
import com.example.demo.model.Escola;
import com.example.demo.service.CursoService;
import com.example.demo.service.EscolaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/escolas")
public class EscolaController {
    
    @Autowired
    private EscolaService escolaService;

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Escola> getEscolas() {
        return escolaService.getAllEscolas();
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Escola> getEscolaByCodigo(@PathVariable int codigo) {
        Escola esc = escolaService.getEscolaByCodigo(codigo);
        return ResponseEntity.ok(esc);
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody EscolaDTO novoEscola, 
                                        HttpServletRequest request, 
                                        UriComponentsBuilder builder
                                        ) {
        Escola esc = escolaService.salvar(escolaService.fromDTO(novoEscola));
        UriComponents uriComponents = builder.path(request.getRequestURI()+"/"+esc.getEscolaId()).build();                         
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> remover(@PathVariable int codigo) {
        escolaService.removeByCodigo(codigo);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{codigo}")
    public ResponseEntity<Escola> atualizar(@PathVariable int codigo, @RequestBody EscolaDTO escolaDTO) {
        Escola escola = escolaService.fromDTO(escolaDTO);
        escola.setEscolaId(codigo);
        escola = escolaService.update(escola);
        return ResponseEntity.ok(escola);
    }

    @GetMapping("/{codigo}/cursos")
    public List<Curso> getCursosEscola(@PathVariable int codigo) {
        Escola esc = escolaService.getEscolaByCodigo(codigo);
        return esc.getCursos();
    }

    @PostMapping("/{codigo}/cursos")
    public ResponseEntity<Void> salvar(@PathVariable int codigo, 
                                        @RequestBody Curso curso, 
                                        HttpServletRequest request, 
                                        UriComponentsBuilder builder
                                        ) {
        curso = cursoService.salvar(codigo, curso);
        UriComponents uriComponents = builder.path(request.getRequestURI()+"/"+curso.getCursoId()).build();
        return ResponseEntity.created(uriComponents.toUri()).build();
    }

    
    
    







}