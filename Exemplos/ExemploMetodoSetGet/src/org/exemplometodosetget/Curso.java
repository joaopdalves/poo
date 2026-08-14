package org.exemplometodosetget;

public class Curso {
    //atributos privados
    private String nomecurso;
    private int duracao;
    private double valor;
    
    //método set altera o valor do atributo
    public void setNomeCurso(String nome) {
        nomecurso = nome;
    }
    
    //método get retorna o valor do atributo
    public String getNomeCurso() {
        return nomecurso;
    }

    //método set altera o valor com a referência this
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}