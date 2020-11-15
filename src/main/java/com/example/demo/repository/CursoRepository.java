package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Curso;
import org.springframework.stereotype.Component;

@Component
public class CursoRepository {

    private int nextCodigo = 1;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
        
    public List<Curso> getAllCursos(){
        return cursos;
    }

    public Optional<Curso> getCursoByCodigo(int codigo){
        for (Curso aux : cursos) {
            if(aux.getCursoId() == codigo) {
                return Optional.of(aux); 
            }       
        } 
        return Optional.empty();
    }

    public Curso salvar(Curso curso) {
        curso.setCursoId(nextCodigo++);
        cursos.add(curso);
        return curso;
    }

    public Curso update(Curso curso) {
        Curso aux = getCursoByCodigo(curso.getCursoId()).get();
        if(aux != null) {
            aux.setDescricao(curso.getDescricao());
        }
        return aux;
    }

	public void remove(Curso curso) {
        cursos.remove(curso);
	}




}
