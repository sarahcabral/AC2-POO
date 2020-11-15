package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Curso;
import com.example.demo.model.Escola;
import com.example.demo.repository.CursoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repositorio;

    @Autowired
    private EscolaService escolaService;

    public List<Curso> getAllCursos(){
        return repositorio.getAllCursos();
    }

    public Curso getCursoById(int id) {
        Optional <Curso> op = repositorio.getCursoById(id);
        return op.orElseThrow( ()  -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Curso não cadastrado"));
    }

    public Curso salvar(int idEscola, Curso curso) {
        Escola escola = escolaService.getEscolaById(idEscola);
        
        curso.setEscola(escola);
        escola.addCurso(curso);

        return repositorio.salvar(curso);
    }

    public void remove(int idEscola, Curso curso) {
        Escola escola = escolaService.getEscolaById(idEscola);
        escola.apgCurso(curso);
        repositorio.remove(curso);

        
    }
    
    



	
    
}
