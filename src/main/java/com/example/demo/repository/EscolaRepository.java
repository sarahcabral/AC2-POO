package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import com.example.demo.model.Escola;
import org.springframework.stereotype.Component;

@Component
public class EscolaRepository {
    
    private int nextCodigo = 1;
    private ArrayList <Escola> escolas;

    @PostConstruct
    public void init() {

        Escola es = new Escola();

        es.setEndereco("R. Costa Rica, 60 - Jardim Parada do Alto, Sorocaba - SP, 18025-805");
        es.setNomeEscola("ETEC Armando Pannunzio");
        es.setPublica(true);
        es.setAnoFundacao(2012);
        es.setQtdAlunos(2000);
        es.setEscolaId(1);

        escolas = new ArrayList<Escola>();
        escolas.add(es);
        nextCodigo = 2;

    }

    public List<Escola> getAllEscolas(){
        return escolas;
    }

    public Optional <Escola> getEscolaByCodigo(int codigo){
        for(Escola aux : escolas){
            if(aux.getEscolaId() == codigo)
                return Optional.of(aux);
        }
        return Optional.empty();
    }

    public Escola salvar(Escola escola) {
        escola.setEscolaId(nextCodigo++);
        escolas.add(escola);
        return escola;
    }

    public Escola update(Escola escola) {
        Escola aux = getEscolaByCodigo(escola.getEscolaId()).get();
        if(aux != null) {
            aux.setNomeEscola(escola.getNomeEscola());
            aux.setEndereco(escola.getEndereco());
        }
        return aux;
    }

	/*public Escola remove(Escola escolaById) {
        if(escolaById.)
        return 
    }*/

   

}
