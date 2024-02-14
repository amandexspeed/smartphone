package com.example;

import java.io.IOException;
import java.util.Scanner;


public class SmartphoneApp {
    
    public static Scanner scn = new Scanner(System.in);

    static public Smartphone criarSmartphoneVazio(){

        scn.nextLine(); //limpa o buffer do teclado, para que o proximo nextLine nao pegue o que ja foi lido.
        System.out.println("Digite a marca do celular: ");
        String marca = scn.nextLine();
        

        System.out.println("Digite o modelo do celular: ");
        String modelo = scn.nextLine();

        System.out.println("Digite o nome do celular: ");
        String nome = scn.nextLine();

        System.out.println("Digite a capacidade do disco do celular: ");
        int capacidadeDisco = scn.nextInt();

        System.out.println("Digite o nivel de bateria do celular: ");
        int nivelBateria = scn.nextInt();

        scn.nextLine();
        System.out.println("Digite se o celular esta ligado (s/n): ");
        boolean ligado = false;
        char estado = scn.nextLine().charAt(0);
        if(estado=='S'|| estado=='s')
            ligado = true;

        //(boolean ligado, int quantidadeMaxAplicativos, int quantidadeMaxComponentes)

        System.out.println("Digite a quantidade máxima de aplicativos:");
        int quantidadeMaxAplicativos = scn.nextInt();

        System.out.println("Digite a quantidade máxima de componentes:");
        int quantidadeMaxComponentes = scn.nextInt();

        Smartphone smartphone = new Smartphone(nome, modelo, marca, capacidadeDisco, nivelBateria, ligado, quantidadeMaxAplicativos, quantidadeMaxComponentes);

        return smartphone;

    }

    static public Smartphone criarSmartphone(){

        Smartphone smartphone = criarSmartphoneVazio();

        System.out.println("Criando componentes...");
        smartphone.criarComponentes();

        System.out.println("Criando aplicativos...");
        smartphone.criarAplicativos();

        return smartphone;

    }

    public static void main(String[] args) throws IOException,InterruptedException {
        
        int opcao = 0;

        Smartphone smartphone = null;
        System.out.println("Deseja criar um smartphone vazio? S/N: ");
        char op = scn.next().charAt(0);
        if(op == 'S' || op == 's')
            smartphone = criarSmartphoneVazio();
        else
            smartphone = criarSmartphone();

        do {

            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
    

            System.out.println("Escolha a opção desejada");
            System.out.println("0 - Sair");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Carregar");
            System.out.println("4 - Formatar");
            System.out.println("5 - Abrir aplicativo");
            System.out.println("6 - Abrir componente");
            System.out.println("7 - Verificar status");
            System.out.println("8 - Remover aplicativo");
            System.out.println("9 - Remover componente");
            System.out.println("10 - Adicionar aplicativo");
            System.out.println("11 - Adicionar componente");
            System.out.println("12 - Listar componentes");
            System.out.println("13 - Listar aplicativos");
            System.out.println("14 - Buscar aplicativo por nome");
            System.out.println("15 - Buscar componente por nome");
            System.out.println("16 - Buscar aplicativo por consumo de bateria");

            opcao = scn.nextInt();
            

            switch (opcao) {
                case 0:
                    
                    System.out.println("Tchau!");

                break;

                case 1:

                    smartphone.ligar();

                break;

                case 2:

                 smartphone.desligar();

                break;
            
                case 3:

                    smartphone.carregar();

                break;

                case 4:

                    smartphone.formatar();

                break;

                case 5:
                {
                    scn.nextLine();
                    System.out.println("Digite o nome do aplicativo: ");
                    String nome = scn.nextLine();
                    smartphone.usarAplicativo(nome);
                }
                break;

                case 6:
                {
                    scn.nextLine();
                    System.out.println("Digite o nome do componente: ");
                    String nomeComponente = scn.nextLine();
                    smartphone.usarComponente(nomeComponente);
                }
                break;

                case 7:

                    smartphone.verificarStatus();

                break;

                case 8:
                {
                    scn.nextLine();
                    System.out.println("Digite o nome do aplicativo: ");
                    String nome = scn.nextLine();
                    smartphone.removerAplicativo(nome);
                }
                break;

                case 9:
                {
                    scn.nextLine();
                    System.out.println("Digite o nome do componente: ");
                    String nomeComponente = scn.nextLine();
                    smartphone.removerComponente(nomeComponente);
                }

                break;

                case 10:
                    if(!smartphone.isLigado()){
                        System.out.println("Celular desligado!");
                        break;
                    }
                    smartphone.criarAplicativos();

                break;

                case 11:
                    if(!smartphone.isLigado()){
                    System.out.println("Celular desligado!");
                    break;
                }
                    smartphone.criarComponentes();

                break;

                case 12:

                    smartphone.listarComponentes();

                break;

                case 13:

                    smartphone.listarAplicativos();

                break;

                case 14:
                {
                    scn.nextLine();
                    System.out.println("Digite o nome do aplicativo: ");
                    String nome = scn.nextLine();
                    Aplicativo app = smartphone.buscarAplicativo(nome);
                    if (app!=null)
                     System.out.println(app.toString());
                }
                break;

               

                case 15:
                {
                    scn.nextLine();
                    System.out.println("Digite o nome do componente: ");
                    String nomeComponente = scn.nextLine();
                    Componente componente =  smartphone.buscarComponente(nomeComponente);
                    if (componente!=null)
                     System.out.println(componente.toString());
                } 
                break;

                case 16:
                {
                    scn.nextLine();
                    System.out.println("Digite o consumo de bateria: ");
                    double consumo = scn.nextDouble();
                    Aplicativo apps[] = smartphone.buscarAplicativo(consumo);

                    for(Aplicativo app : apps)
                        if (app!=null)
                        System.out.println(app.toString());
                }
                break;
                default:

                    System.out.println("Opção inválida");

                break;

                
            }

            System.out.println("Solicitação concluída...");
            Thread.sleep(5000);

        }while (opcao!=0);

    }

}
