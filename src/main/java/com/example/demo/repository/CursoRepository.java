package com.example.demo.repository;

import javax.annotation.PostConstruct;
import com.example.demo.model.Curso;
import org.springframework.stereotype.Component;

@Component
public class CursoRepository {

    private int nextId;
    
    @PostConstruct
    public void init() {
        Curso cs = new Curso();

        cs.setNomeCurso("Automacao Industrial");
        cs.setDescricao("Curso integrado ao Ensino médio");
        cs.setDuracao_meses(36);
        cs.setMesalidade(0);
        cs.setEletiva(false);
        cs.setCarga_horaria(400);
        cs.setCursoId(1);
        cs.setEscola();
        nextId = 2;
        
        

    }
    
}
