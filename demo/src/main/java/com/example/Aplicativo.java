package com.example;

public class Aplicativo {
    private String nome;
    private double consumoBateria;
    private double tamanho;
    
    public Aplicativo(String nome, double consumoBateria, double tamanho) {
        this.nome = nome;
        this.consumoBateria = consumoBateria;
        this.tamanho = tamanho;
    }

    public Aplicativo(String nome) {
        this.nome = nome;
        this.consumoBateria = 1.5;
        this.tamanho = 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getConsumoBateria() {
        return consumoBateria;
    }

    public void setConsumoBateria(double consumoBateria) {
        this.consumoBateria = consumoBateria;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Aplicativo [nome=" + nome + ", consumoBateria=" + consumoBateria + ", tamanho=" + tamanho + "]";
    }

    
}
