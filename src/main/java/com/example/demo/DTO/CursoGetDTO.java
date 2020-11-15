package com.example.demo.DTO;

public class CursoGetDTO {
    private int cursoId;
    private String nomeCurso;
    private float carga_horaria;
    private boolean eletiva;        
    private float mesalidade;
    private int duracao_meses;
    private String descricao;

    public CursoGetDTO(int cursoId, String nomeCurso, float carga_horaria, boolean eletiva, float mesalidade,
                                                                        int duracao_meses, String descricao) {
        this.cursoId = cursoId;
        this.nomeCurso = nomeCurso;
        this.carga_horaria = carga_horaria;
        this.eletiva = eletiva;
        this.mesalidade = mesalidade;
        this.duracao_meses = duracao_meses;
        this.descricao = descricao;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
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
