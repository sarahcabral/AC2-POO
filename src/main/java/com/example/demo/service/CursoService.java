package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.DTO.CursoDTO;
import com.example.demo.DTO.CursoGetDTO;
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

    public Curso fromDTO(CursoDTO dto) {
        Curso curso = new Curso();
        curso.setCarga_horaria(dto.getCarga_horaria());
        curso.setDescricao(dto.getDescricao());
        curso.setDuracao_meses(dto.getDuracao_meses());
        curso.setEletiva(dto.isEletiva());
        curso.setEscola(dto.getEscola());
        curso.setMesalidade(dto.getMesalidade());
        curso.setNomeCurso(dto.getNomeCurso());
        return curso;
    }

    public CursoGetDTO toDTO(Curso curso) {
        CursoGetDTO dto = new CursoGetDTO(  curso.getCursoId(), 
                                            curso.getNomeCurso(),
                                            curso.getCarga_horaria(), 
                                            curso.isEletiva(), 
                                            curso.getMesalidade(),
                                            curso.getDuracao_meses(),
                                            curso.getDescricao()
                                            );
        return dto;
    }
   

    public List<Curso> getAllCursos(){
        return repositorio.getAllCursos();
    }

    public Curso getCursoByCodigo(int codigo) {
        Optional <Curso> op = repositorio.getCursoByCodigo(codigo);
        return op.orElseThrow( ()  -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Curso não cadastrado"));
    }

    public Curso salvar(int codigoEscola, Curso curso) {
        Escola escola = escolaService.getEscolaByCodigo(codigoEscola);
        
        curso.setEscola(escola);
        escola.addCurso(curso);

        return repositorio.salvar(curso);
    }

    public void removeByCodigo(int codigoCurso) {
        Curso curso = getCursoByCodigo(codigoCurso);
        Escola escola = escolaService.getEscolaByCodigo((curso.getEscola()).getEscolaId());
        escola.apgCurso(curso);
        repositorio.remove(curso);
    }

    public Curso update(Curso curso) {
        getCursoByCodigo(curso.getCursoId());
        return repositorio.update(curso);
    }
    

    
    



	
    
}
