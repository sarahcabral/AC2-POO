package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import com.example.demo.model.Escola;
import org.springframework.stereotype.Component;

@Component
public class EscolaRepository {
    
    private int nextId = 1;
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
        nextId = 2;

    }

    public List<Escola> getAllEscolas(){
        return escolas;
    }

    public Optional <Escola> getEscolaById(int Id){
        for(Escola aux : escolas){
            if(aux.getEscolaId() == Id)
                return Optional.of(aux);
        }
        return Optional.empty();
    }

    public Escola salvar(Escola escola) {
        escola.setEscolaId(nextId++);
        escolas.add(escola);
        return escola;
    }

    public Escola update(Escola escola) {
        Escola aux = getEscolaById(escola.getEscolaId()).get();
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
