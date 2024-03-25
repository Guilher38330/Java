/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjetos3am_2023;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author lorenzi
 */
public class ProgramaCarroAlocacaoDinamica {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declarando a lista de carros
        LinkedList<Carro> listaCarros = new LinkedList<>();

        System.out.println("DESEJA: 1 - Cadastrar carro, 2 - Visualizar carros, 3 - Visualizar carro em específico, 4 - Editar dados de algum carro, 5 - Sair");
        int opcao = entrada.nextInt();
        while (opcao != 5) {
            // verificando a opção informada pelo usuário
            if (opcao == 1) { // cadastrar
                // solicitando as informações do carro
                System.out.println("Informe a cor do carro: ");
                String cor = entrada.nextLine();
                cor = entrada.nextLine();
                System.out.println("Informe o modelo do carro: ");
                String modelo = entrada.nextLine();
                System.out.println("Infome a velocidade do carro: ");
                float velocidade = entrada.nextFloat();
                System.out.println("Informe a capacidade do carro: ");
                int capacidade = entrada.nextInt();
                // criando o objeto da classe carro
                Carro meuCarro = new Carro(cor, modelo, velocidade, capacidade);
                // adicionando o carro na lista
                listaCarros.add(meuCarro);

                System.out.println("Carro cadastrado com sucesso.");
            } else if (opcao == 2) { // visualizar
                // navegando nos elementos da lista
                for (int x = 0; x < listaCarros.size(); x++) {
                    // obtendo cada um dos elementos (objetos)
                    Carro meuCarro = listaCarros.get(x);
                    // mostrando as informações do carro
                    System.out.println("Cor: " + meuCarro.getCor()
                            + ", Modelo: " + meuCarro.getModelo()
                            + ", Velocidade: " + meuCarro.getVelocidade()
                            + ", Capacidade: " + meuCarro.getCapacidade());
                }
            } else if (opcao == 3) { // visualizar carro em específico
                // solicitando a posição (do carro) desejada
                System.out.println("Informe a posição do carro desejada: ");
                int posicao = entrada.nextInt();
                // verificando a posição informada pelo usuário
                if (posicao >= 0 && posicao < listaCarros.size()) {
                    // obtendo o elemento (objeto) da lista
                    Carro meuCarro = listaCarros.get(posicao);
                    // mostrando as informações do carro
                    System.out.println("Cor: " + meuCarro.getCor()
                            + ", Modelo: " + meuCarro.getModelo()
                            + ", Velocidade: " + meuCarro.getVelocidade()
                            + ", Capacidade: " + meuCarro.getCapacidade());
                } else {
                    System.out.println("Erro: posição informada é inválida.");
                }

            } else if (opcao == 4) { // editar dados de carro
                // solicitando a posição (do carro) desejada
                System.out.println("Informe a posição do carro desejada: ");
                int posicao = entrada.nextInt();
                // verificando a posição informada pelo usuário
                if (posicao >= 0 && posicao < listaCarros.size()) {
                    // obtendo o elemento (objeto) da lista
                    Carro meuCarro = listaCarros.get(posicao);
                    // solicitando as informações do carro
                    System.out.println("Informe a cor do carro: ");
                    String cor = entrada.nextLine();
                    System.out.println("Informe o modelo do carro: ");
                    String modelo = entrada.nextLine();
                    System.out.println("Informe a velocidade do carro: ");
                    float velocidade = entrada.nextFloat();
                    System.out.println("Informe a capacidade do carro: ");
                    int capacidade = entrada.nextInt();
                    // alterando as informaçoes do carro
                    meuCarro.setCor(cor);
                    meuCarro.setModelo(modelo);
                    meuCarro.setVelocidade(velocidade);
                    meuCarro.setCapacidade(capacidade);
                    System.out.println("Carro alterado com sucesso");
                } else {
                    System.out.println("Erro: posição informada é inválida.");
                }
            }
            System.out.println("DESEJA: 1 - Cadastrar carro, 2 - Visualizar carros, 3 - Visualizar carro em específico,  4 - Editar dados de algum carro, 5 - Sair");
            opcao = entrada.nextInt();
        }

    }
}
