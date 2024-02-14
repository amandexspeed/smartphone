package atividade;

public class Componente {
    private String descricao;
    private double consumoBateria;
    
    public Componente(String descricao, double consumoBateria) {
        this.descricao = descricao;
        this.consumoBateria = consumoBateria;
    }

    public Componente(String descricao) {
        this.descricao = descricao;
        this.consumoBateria = 1;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getConsumoBateria() {
        return consumoBateria;
    }

    public void setConsumoBateria(double consumoBateria) {
        this.consumoBateria = consumoBateria;
    }

    @Override
    public String toString() {
        return "Componente [descricao=" + descricao + ", consumoBateria=" + consumoBateria + "]";
    }

}