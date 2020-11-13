package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;

public class Escola {
    private int escolaId;
    private String nomeEscola;
    private int qtdAlunos;
    private String endereco;
    private String slogan;
    private boolean publica;
    private Date dataFundacao;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();

    public int getEscolaId() {
        return escolaId;
    }

    public void setEscolaId(int escolaId) {
        this.escolaId = escolaId;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public boolean isPublica() {
        return publica;
    }

    public void setPublica(boolean publica) {
        this.publica = publica;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    @Override
    public String toString() {
        return "Escola [dataFundacao=" + dataFundacao + ", endereco=" + endereco + ", escolaId=" + escolaId
                + ", nomeEscola=" + nomeEscola + ", publica=" + publica + ", qtdAlunos=" + qtdAlunos + ", slogan="
                + slogan + "]";
    }
    
}
