package com.example.demo.model;

import java.util.ArrayList;

public class Escola {
    private int escolaId;
    private String nomeEscola;
    private int qtdAlunos;
    private String endereco;
    private boolean publica;
    private int anoFundacao;
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

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public boolean addCurso(Curso curso) {
        return cursos.add(curso);
    }

	@Override
	public String toString() {
		return "Escola [anoFundacao=" + anoFundacao + ", endereco=" + endereco + ", escolaId=" + escolaId
				+ ", nomeEscola=" + nomeEscola + ", publica=" + publica + ", qtdAlunos=" + qtdAlunos + "]";
    }
}


