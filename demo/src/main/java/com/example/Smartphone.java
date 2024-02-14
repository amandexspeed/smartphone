package com.example;

import java.util.Scanner;
import java.util.Arrays;

public class Smartphone {

    public static Scanner scn = new Scanner(System.in);

    private String nome;
    private String modelo;
    private String marca;
    private double capacidadeDisco;
    private double nivelBateria;
    private boolean ligado;
    private Aplicativo[] aplicativos;
    private int quantidadeMaxAplicativos;
    private int quantidadeAplicativosInstalados;
    private Componente[] componentes;
    private int quantidadeMaximaComponentes;
    private int quantidadeComponentesInstalados;
    private double armazenamentoUsado;
    
    public Smartphone(String nome, String modelo, String marca, double capacidadeDisco, double nivelBateria,
        boolean ligado, Aplicativo[] aplicativos, int quantidadeMaxAplicativos, int quantidadeAplicativosInstalados,
        Componente[] componentes, int quantidadeMaximaComponentes, int quantidadeComponentesInstalados) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadeDisco = capacidadeDisco;
        this.nivelBateria = nivelBateria;
        this.ligado = ligado;
        this.aplicativos = aplicativos;
        this.quantidadeMaxAplicativos = quantidadeMaxAplicativos;
        this.quantidadeAplicativosInstalados = quantidadeAplicativosInstalados;
        this.componentes = componentes;
        this.quantidadeMaximaComponentes = quantidadeMaximaComponentes;
        this.quantidadeComponentesInstalados = quantidadeComponentesInstalados;
    }

    public Smartphone(String nome, String modelo, String marca, boolean ligado, Aplicativo[] aplicativos, 
        int quantidadeMaxAplicativos, int quantidadeAplicativosInstalados,Componente[] componentes, 
        int quantidadeMaximaComponentes, int quantidadeComponentesInstalados) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidadeDisco = 128;
        this.nivelBateria = 75;
        this.ligado = ligado;
        this.aplicativos = aplicativos;
        this.quantidadeMaxAplicativos = quantidadeMaxAplicativos;
        this.quantidadeAplicativosInstalados = quantidadeAplicativosInstalados;
        this.componentes = componentes;
        this.quantidadeMaximaComponentes = quantidadeMaximaComponentes;
        this.quantidadeComponentesInstalados = quantidadeComponentesInstalados;
    }

    

    public Smartphone(String nome, String modelo, String marca, int capacidadeDisco, int nivelBateria, boolean ligado, int quantidadeMaxAplicativos,
            int quantidadeMaximaComponentes) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.ligado = ligado;
        this.quantidadeMaxAplicativos = quantidadeMaxAplicativos;
        this.capacidadeDisco = capacidadeDisco;
        this.nivelBateria = nivelBateria;
        this.aplicativos = new Aplicativo[quantidadeMaxAplicativos];
        this.quantidadeAplicativosInstalados = 0;
        this.componentes = new Componente[quantidadeMaximaComponentes];
        this.quantidadeMaximaComponentes = quantidadeMaximaComponentes;
        this.quantidadeComponentesInstalados = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidadeDisco() {
        return capacidadeDisco;
    }

    public void setCapacidadeDisco(double capacidadeDisco) {
        this.capacidadeDisco = capacidadeDisco;
    }

    public double getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public Aplicativo[] getAplicativos() {
        return aplicativos;
    }

    public void setAplicativos(Aplicativo[] aplicativos) {
        this.aplicativos = aplicativos;
    }

    public int getQuantidadeMaxAplicativos() {
        return quantidadeMaxAplicativos;
    }

    public void setQuantidadeMaxAplicativos(int quantidadeMaxAplicativos) {
        this.quantidadeMaxAplicativos = quantidadeMaxAplicativos;
    }

    public int getQuantidadeAplicativosInstalados() {
        return quantidadeAplicativosInstalados;
    }

    public void setQuantidadeAplicativosInstalados(int quantidadeAplicativosInstalados) {
        this.quantidadeAplicativosInstalados = quantidadeAplicativosInstalados;
    }

    public Componente[] getComponentes() {
        return componentes;
    }

    public void setComponentes(Componente[] componentes) {
        this.componentes = componentes;
    }

    public int getQuantidadeMaximaComponentes() {
        return quantidadeMaximaComponentes;
    }

    public void setQuantidadeMaximaComponentes(int quantidadeMaximaComponentes) {
        this.quantidadeMaximaComponentes = quantidadeMaximaComponentes;
    }

    public int getQuantidadeComponentesInstalados() {
        return quantidadeComponentesInstalados;
    }

    public void setQuantidadeComponentesInstalados(int quantidadeComponentesInstalados) {
        this.quantidadeComponentesInstalados = quantidadeComponentesInstalados;
    }

    public double getArmazenamentoUsado() {
        return armazenamentoUsado;
    }

    public void setArmazenamentoUsado(double armazenamentoUsado) {
        this.armazenamentoUsado = armazenamentoUsado;
    }

    @Override
    public String toString() {
        return "Smartphone [nome=" + nome + ", modelo=" + modelo + ", marca=" + marca + ", capacidadeDisco="
                + capacidadeDisco + ", nivelBateria=" + nivelBateria + ", ligado=" + ligado + ", aplicativos="
                + Arrays.toString(aplicativos) + ", quantidadeMaxAplicativos=" + quantidadeMaxAplicativos
                + ", quantidadeAplicativosInstalados=" + quantidadeAplicativosInstalados + ", componentes="
                + Arrays.toString(componentes) + ", quantidadeMaximaComponentes=" + quantidadeMaximaComponentes
                + ", quantidadeComponentesInstalados=" + quantidadeComponentesInstalados + "]";
    }


    //Métodos
    public void ligar(){
        if(!isLigado()){
            if(getNivelBateria() == 0){
                System.out.println("Celular sem bateria");
                return;
            }
            setLigado(true);
            System.out.println("Celular ligado");
        }else{
            System.out.println("Celular já está ligado");
        }
    }

    public void desligar(){
        if(isLigado()){
            setLigado(false);
            System.out.println("Celular desligado");
        }else{
            System.out.println("Celular já está desligado");
        }
    }

    public void carregar(){
        setNivelBateria(getNivelBateria()+10);
    }

    public void formatar(){
        if (isLigado()) {
            for(int i = 0; i < getQuantidadeAplicativosInstalados(); i++){
                aplicativos[i] = null;
            }
            setQuantidadeAplicativosInstalados(0);
            setArmazenamentoUsado(0);
        }else{

            System.out.println("Celular desligado!");

        }


    }
       

    public Componente buscarComponente(String nome){
        for(int i = 0; i < getQuantidadeComponentesInstalados(); i++){
            if(componentes[i].getDescricao().equals(nome)){
                return componentes[i];
            }
        }
        System.out.println("Componente não encontrado.");
        return null;
    }

    public Aplicativo buscarAplicativo(String nome){
        for(int i = 0; i < getQuantidadeAplicativosInstalados(); i++){
            if(aplicativos[i].getNome().equals(nome)){
                return aplicativos[i];
            }
        }
        System.out.println("Aplicativo não encontrado.");
        return null;
    }

    public Aplicativo[] buscarAplicativo(double consumoBateria){
        Aplicativo[] aplicativosNivelBateria = new Aplicativo[getQuantidadeAplicativosInstalados()];
        int contador = 0;

        for(int i = 0; i < getQuantidadeAplicativosInstalados(); i++){
            if(aplicativos[i].getConsumoBateria() >= consumoBateria){
                aplicativosNivelBateria[contador] = aplicativos[i];
                contador++;
            }
        }
        if(contador > 0){
            return aplicativosNivelBateria;
        }
        System.out.println("Não foram encontrados os aplicativos");
        return null;
    }

    public void adicionarComponente(Componente componente) {
        
            if (getQuantidadeComponentesInstalados() < getQuantidadeMaximaComponentes()) {
                componentes[quantidadeComponentesInstalados++] = componente;
                System.out.println("Componente adicionado com sucesso");
            } else {
                System.out.println("Limite máximo de componentes atingido.");
            }

    }

    public void adicionarAplicativo(Aplicativo aplicativo){
            if(getQuantidadeAplicativosInstalados() < getQuantidadeMaxAplicativos()){
                if(armazenamentoUsado+aplicativo.getTamanho() > capacidadeDisco){
                    System.out.println("Não é possível instalar o aplicativo. Capacidade do disco insuficiente.");
                }else{

                    this.aplicativos[quantidadeAplicativosInstalados++] = aplicativo;
                    System.out.println("Aplicativo adicionado com sucesso");
                    setArmazenamentoUsado(getArmazenamentoUsado() + aplicativo.getTamanho());
                }
            }else {
                System.out.println("Limite máximo de aplicativos atingido.");
            }
        
    }
    
    public void removerComponente(String nome){
        if(isLigado()){
            for(int i = 0; i < getQuantidadeMaximaComponentes(); i++){
                if(componentes[i].getDescricao().equals(nome)){
                    this.componentes[i] = null;
                    setQuantidadeComponentesInstalados(getQuantidadeComponentesInstalados() - 1);
                    System.out.println("Componente removido com sucesso");
                    return;
                }
            }
            System.out.println("Componente não encontrado");
        }else{

            System.out.println("Celular desligado!");

        }
    }

    public void removerAplicativo(String nome){
        if(isLigado()){
            for(int i = 0; i < getQuantidadeMaxAplicativos(); i++){
                if(aplicativos[i].getNome().equals(nome)){
                    setArmazenamentoUsado(getArmazenamentoUsado() - aplicativos[i].getTamanho());
                    this.aplicativos[i] = null;
                    setQuantidadeAplicativosInstalados(getQuantidadeAplicativosInstalados() - 1);
                    System.out.println("Aplicativo removido com sucesso");
                    return;
                }
            }
            System.out.println("Aplicativo não encontrado");
        }else{

            System.out.println("Celular desligado!");

        }
    }

    public void usarComponente(String nome){
        if(isLigado()){
            if(buscarComponente(nome) != null){
                setNivelBateria(getNivelBateria() - buscarComponente(nome).getConsumoBateria());
                System.out.println("Componente utilizado");
            }else{
                System.out.println("Componente não existe");
            }
        }else{

            System.out.println("Celular desligado!");

        }
    }

    public void usarAplicativo(String nome){
        if(isLigado()){
            if(buscarAplicativo(nome) != null){
                if(getNivelBateria() - buscarAplicativo(nome).getConsumoBateria()>0){
                    setNivelBateria(getNivelBateria() - buscarAplicativo(nome).getConsumoBateria());
                    System.out.println("Aplicativo utilizado");
                }else{

                    System.out.println("Bateria insuficiente.O celular descarregou");
                    setLigado(false);
                    setNivelBateria(0);
                } 

            }
        }else{

            System.out.println("Celular desligado!");

        }
    }
    

    public void criarAplicativos(){
        char op = 'n';
        do{

            System.out.println("Digite o nome do aplicativo: ");
            String nome = scn.nextLine();

            System.out.println("Digite o consumo de bateria do aplicativo: ");
            int consumoBateria = scn.nextInt();

            System.out.println("Digite o tamanho do aplicativo: ");
            int tamanho = scn.nextInt();

            Aplicativo aplicativo = new Aplicativo(nome, consumoBateria, tamanho);

            adicionarAplicativo(aplicativo);

            scn.nextLine();
            System.out.println("Deseja criar outro aplicativo? (s/n)");
            op = scn.nextLine().charAt(0);

        }while(op!='n' && op!='N');

    }

    public void criarComponentes(){
        char op = 'n';
        do{

            System.out.println("Digite a descricao do componente: ");
            String descricao = scn.nextLine();

            System.out.println("Digite o consumo de bateria do componente: ");
            double consumoBateria = scn.nextDouble();

            Componente componente = new Componente(descricao, consumoBateria);

            adicionarComponente(componente);

            scn.nextLine();
            System.out.println("Deseja criar outro componente? (s/n)");
            op = scn.nextLine().charAt(0);

        }while(op!='n' && op!='N');

    }

    public void listarComponentes(){
        if(!isLigado()){
            System.out.println("Celular desligado!");
            return;
        }
        for(int i = 0; i < getQuantidadeComponentesInstalados(); i++){
            if(componentes[i] != null)
            System.out.println(componentes[i].toString());
        }
    }

    public void listarAplicativos(){
        if(!isLigado()){
            System.out.println("Celular desligado!");
            return;
        }
        for(int i = 0; i < getQuantidadeAplicativosInstalados(); i++){
            if(aplicativos[i] != null)
            System.out.println(aplicativos[i].toString());
        }
    }

    public void verificarStatus(){

        System.out.println("Espaço livre: " + (getCapacidadeDisco()-getArmazenamentoUsado()));
        System.out.println("Nivel de bateria: " + getNivelBateria());
        System.out.println("Ligado: " + (isLigado()?"Sim":"Não"));
        System.out.println("Quantidade de aplicativos instalados: " + getQuantidadeAplicativosInstalados());
        System.out.println("Quantidade de componentes instalados: " + getQuantidadeComponentesInstalados());

    }

/*     public Smartphone criarSmartphoneVazio(){

        System.out.println("Digite a marca do celular: ");
        String marca = scn.nextLine();

        System.out.println("Digite o modelo do celular: ");
        String modelo = scn.nextLine();

        System.out.println("Digite o nome do celular: ");
        String nome = scn.nextLine();

        System.out.println("Digite a capacidade do disco do celular: ");
        double capacidadeDisco = scn.nextDouble();

        System.out.println("Digite o nivel de bateria do celular: ");
        double nivelBateria = scn.nextDouble();

        System.out.println("Digite se o celular esta ligado (s/n): ");
        boolean ligado = scn.nextLine().charAt(0) == 's' ? true : false;

        System.out.println("Digite a quantidade máxima de aplicativos:");
        int quantidadeMaxAplicativos = scn.nextInt();

        System.out.println("Digite a quantidade máxima de componentes:");
        int quantidadeMaxComponentes = scn.nextInt();

        Smartphone smartphone = new Smartphone(nome, modelo, marca, capacidadeDisco, nivelBateria, ligado, quantidadeMaxAplicativos, quantidadeMaxComponentes);

        return smartphone;

    }

    public Smartphone criarSmartphone(){

        Smartphone smartphone = criarSmartphoneVazio();

        criarComponentes();

        criarApps();

        return smartphone;

    } */

}

