package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.DTO.EscolaDTO;
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
    
    public Escola getEscolaByCodigo(int codigo) {
        Optional <Escola> op = repositorio.getEscolaByCodigo(codigo);
        return op.orElseThrow( ()  -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Escola não cadastrada"));
	}
    
    public Escola salvar(Escola escola) {
        return repositorio.salvar(escola);
    }

    public Escola fromDTO(EscolaDTO dto) {
        Escola escola = new Escola();
        escola.setAnoFundacao(dto.getAnoFundacao());
        escola.setEndereco(dto.getEndereco());
        escola.setNomeEscola(dto.getNomeEscola());
        escola.setPublica(dto.isPublica());
        escola.setQtdAlunos(dto.getQtdAlunos());
        
        return escola;
    }

	/*public void removeById(int id) {
        int tam = repositorio.
        repositorio.remove(getEscolaById(id));
    }*/

	public Escola update(Escola escola) {
        getEscolaByCodigo(escola.getEscolaId());
        return repositorio.update(escola);
	}
    
}