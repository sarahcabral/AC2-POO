package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Curso;
import org.springframework.stereotype.Component;

@Component
public class CursoRepository {

    private int nextId;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
        
    public List<Curso> getAllCursos(){
        return cursos;
    }

    public Optional<Curso> getCursoById(int id){
        for (Curso aux : cursos) {
            if(aux.getCursoId() == id) {
                return Optional.of(aux); 
            }       
        } 
        return Optional.empty();
    }

    public Curso salvar(Curso curso) {
        curso.setCursoId(nextId++);
        cursos.add(curso);
        return curso;
    }


}
