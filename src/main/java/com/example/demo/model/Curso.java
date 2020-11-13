package com.example.demo.model;

public class Curso {
    private int cursoID;
    private String nomeCurso;
    private Escola nomeEscola;
    private float carga_horaria;
    private boolean eletiva;        //Curso obrigatorio ou opcional
    private float mesalidade;
    private int duracao_meses;
    private String descricao;



    public int getCursoID() {
        return cursoID;
    }

    public void setCursoID(int cursoID) {
        this.cursoID = cursoID;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Escola getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(Escola nomeEscola) {
        this.nomeEscola = nomeEscola;
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

    @Override
    public String toString() {
        return "Curso [carga_horaria=" + carga_horaria + ", cursoID=" + cursoID + ", descricao=" + descricao
                + ", duracao_meses=" + duracao_meses + ", eletiva=" + eletiva + ", mesalidade=" + mesalidade
                + ", nomeCurso=" + nomeCurso + ", nomeEscola=" + nomeEscola + "]";
    }



    
}
