
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos3am_2023;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ProgramaCarroAlocacaoDinamica {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //declarando a lista de carros
        LinkedList<Carro> listaCarros = new LinkedList<>();

        System.out.println("Deseja: 1 - Cadastrar carro, 2 - visualizar carro, 3 - Visualizar carro específico, 4 - Editar carro, 5 - Ligar carro (específico), 6 - Desligar  carro (específico), 7 - Acelerar carro, 8 - Remover carro (específico), 9 - Pesquisa por modelo, 10 - Editar dados do carro (informando o modelo), 11 - Sair: ");
        int opcao = ler.nextInt();
        while (opcao != 11) {
            //verificando a opção do usuário
            if (opcao == 1) { //cadastrar
                //solicitando as informações do carro
                System.out.println("Informe a cor do carro: ");
                String cor = ler.nextLine();
                cor = ler.nextLine();
                System.out.println("Informe o modelo do carro: ");
                String modelo = ler.nextLine();
                System.out.println("Informe a velocidade do carro: ");
                float velocidade = ler.nextFloat();
                System.out.println("Informe a capacidade do carro: ");
                int capacidade = ler.nextInt();
                //criando o objeto da classe carro
                Carro meuCarro = new Carro(cor, modelo, velocidade, capacidade);
                //adicionando o carro na lista
                listaCarros.add(meuCarro);
                System.out.println("Carro cadrastrado com sucesso!");
            } else if (opcao == 2) { //visualizar
                //navegando nos elementos da lista
                for (int x = 0; x < listaCarros.size(); x++) {
                    // obtendo cada um dos elementos(objetos)
                    Carro meuCarro = listaCarros.get(x);
                    // mostrando as informaçoes do carro
                    System.out.println("Cor: " + meuCarro.getCor());
                    System.out.println("Modelo: " + meuCarro.getModelo());
                    System.out.println("Velocidade: " + meuCarro.getVelocidade());
                    System.out.println("Capacidade: " + meuCarro.getCapacidade());

                }
            } else if (opcao == 3) {//visualizar carro em especifico
                //solicitando a posiçao (do carro) desejado
                System.out.println("Informe a posicao do carro desejado: ");
                int posicao = ler.nextInt();
                //verificando a posisao informada pelo usuario
                if (posicao >= 0 && posicao == listaCarros.size()) {
                    //obtendo o objeto da lista
                    Carro meuCarro = listaCarros.get(posicao);
                } else {
                    System.out.println("Erro: posicao informada e invalida.");
                }
            } else if (opcao == 4) {
                for (int x = 0; x < listaCarros.size(); x++) {
                    Carro meuCarro = listaCarros.get(x);
                    System.out.println("Informe a cor do carro: ");
                    String cor = ler.nextLine();
                    cor = ler.nextLine();
                    System.out.println("Informe o modelo do carro: ");
                    String modelo = ler.nextLine();
                    System.out.println("Informe a velocidade do carro: ");
                    float velocidade = ler.nextFloat();
                    System.out.println("Informe a capacidade do carro: ");
                    int capacidade = ler.nextInt();
                    meuCarro.setCor(cor);
                    meuCarro.setModelo(modelo);
                    meuCarro.setVelocidade(velocidade);
                    meuCarro.setCapacidade(capacidade);
                    System.out.println("Carro editado com sucesso");

                }else{
                    System.out.println("Erro: posicao informada e invalida.");
                }
            } else if (opcao == 5) {
                // solicitando a posicao do carro desejado
                System.out.println("Informe a posicao desejada: ");
                int posicao = ler.nextInt();
                //verificando a posisao informada pelo usuario
                if (posicao >= 0 && posicao < listaCarros.size()) {
                    Carro meuCarro = listaCarros.get(posicao);
                    //ligando o carro
                    meuCarro.liga();
                } else {
                    System.out.println("Erro: posicao informada e invalida.");
                }
            } else if (opcao == 6) {//desligar
                System.out.println("Informe a posicao desejada: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaCarros.size()) {
                    Carro meuCarro = listaCarros.get(posicao);
                    meuCarro.desliga();
                } else {
                    System.out.println("Erro: posicao informada e invalida.");
                }
            } else if (opcao == 7) {//acelerar
                System.out.println("Informe a posicao desejada: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaCarros.size()) {
                    Carro meuCarro = listaCarros.get(posicao);
                    //solicitando a quantidade de vezer que deseja acelerar
                    System.out.println("Informe a quantidade de vezes que deseja acelerar: ");
                    int quatidade = ler.nextInt();
                    meuCarro.acelera(quatidade);
                } else {
                    System.out.println("Erro: posicao informada e invalida.");
                }
            } else if (opcao == 8) {// remover
                // solicitando a posição do carro desejado
                System.out.println("Informe a posicao do carro a ser removido: ");
                int posicao = ler.nextInt();
                // verificando se a opção informada é válida
                if (posicao >= 0 && posicao < listaCarros.size()) {
                    // obtendo o objeto (carro) da lista
                    Carro meuCarro = listaCarros.get(posicao);
                    listaCarros.remove(posicao);
                    System.out.println("Carro removido!");
                } else {
                    System.out.println("Erro: Posicao informada invalida!");
                }
            } else if (opcao == 9) {//pesquisa
                System.out.println("Informe o modelo do carro a ser pesquisado: ");
                String modeloPesquisado = ler.nextLine();
                modeloPesquisado = ler.nextLine();
                // navegando elementos (carros) da lista
                boolean achei = false;
                for (int x = 0; x < listaCarros.size(); x++) {
                    Carro meuCarro = listaCarros.get(x);
                    //verificando o modelo do carro
                    if (modeloPesquisado.equals(meuCarro.getModelo())) {
                        // mostrando os dados do carro
                        System.out.println("Cor: " + meuCarro.getCor());
                        System.out.println("Modelo: " + meuCarro.getModelo());
                        System.out.println("Velocidade: " + meuCarro.getVelocidade());
                        System.out.println("Capacidade: " + meuCarro.getCapacidade());
                        achei = true;
                        break;
                    }
                }
                // verificando se encontrou carro com o modelo informado
                if (achei == false) {
                    System.out.println("Erro: não existe carro com o modelo informado ");
                }
            } else if (opcao == 10) {
                System.out.println("Informe o modelo do carro a ser editado: ");
                String modeloPesquisado = ler.nextLine();
                modeloPesquisado = ler.nextLine();
                // navegando elementos (carros) da lista
                boolean achei = false;
                for (int x = 0; x < listaCarros.size(); x++) {
                    Carro meuCarro = listaCarros.get(x);
                    //verificando o modelo do carro
                    if (modeloPesquisado.equals(meuCarro.getModelo())) {
                        // editando os dados do carro
                        System.out.println("Informe a cor do carro: ");
                        String cor = ler.nextLine();
                        cor = ler.nextLine();
                        System.out.println("Informe o modelo do carro: ");
                        String modelo = ler.nextLine();
                        System.out.println("Informe a velocidade do carro: ");
                        float velocidade = ler.nextFloat();
                        System.out.println("Informe a capacidade do carro: ");
                        int capacidade = ler.nextInt();
                        //editando de fato as informaçoes do carro
                        meuCarro.setCor(cor);
                        meuCarro.setModelo(modelo);
                        meuCarro.setVelocidade(velocidade);
                        meuCarro.setCapacidade(capacidade);
                        System.out.println("Carro editado com sucesso");
                        achei = true;
                        break;
                    }
                }
                // erificando se encontrou o carro
                if (achei == false) {
                    System.out.println("Erro: não existe carro com o modelo informado ");
                }
            }
            System.out.println("Deseja: 1 - Cadastrar carro, 2 - visualizar carro, 3 - Visualizar carro específico, 4 - Editar carro, 5 - Ligar carro (específico), 6 - Desligar  carro (específico), 7 - Acelerar carro, 8 - Remover carro (específico), 9 - Pesquisa por modelo, 10 - Editar dados do carro (informando o modelo), 11 - Sair: ");
            opcao = ler.nextInt();
        }
    }
}
