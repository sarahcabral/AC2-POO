package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Curso;
import org.springframework.stereotype.Component;

@Component
public class CursoRepository {

    private int nextId = 1;
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

    public Curso update(Curso curso) {
        Curso aux = getCursoById(curso.getCursoId()).get();
        if(aux != null) {
            aux.setDescricao(curso.getDescricao());
        }
        return aux;
    }

	public void remove(Curso curso) {
        cursos.remove(curso);
	}




}
