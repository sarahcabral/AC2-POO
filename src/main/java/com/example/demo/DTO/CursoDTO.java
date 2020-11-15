package com.example.demo.DTO;

import com.example.demo.model.Escola;

public class CursoDTO {
    
    private String nomeCurso;
    private Escola escola;
    private float carga_horaria;
    private boolean eletiva;       
    private float mesalidade;
    private int duracao_meses;
    private String descricao;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public float getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(float carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public boolean isEletiva() {
        return eletiva;
    }

    public void setEletiva(boolean eletiva) {
        this.eletiva = eletiva;
    }

    public float getMesalidade() {
        return mesalidade;
    }

    public void setMesalidade(float mesalidade) {
        this.mesalidade = mesalidade;
    }

    public int getDuracao_meses() {
        return duracao_meses;
    }

    public void setDuracao_meses(int duracao_meses) {
        this.duracao_meses = duracao_meses;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
