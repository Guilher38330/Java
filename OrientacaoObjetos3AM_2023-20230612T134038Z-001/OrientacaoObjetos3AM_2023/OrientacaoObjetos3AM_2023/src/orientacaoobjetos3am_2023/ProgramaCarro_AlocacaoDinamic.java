/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos3am_2023;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ProgramaCarro_AlocacaoDinamic {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
         //declarando a lista de carros.
         
        LinkedList<Carro> listaCarros = new LinkedList();

        System.out.println("DESEJA: 1 - Cadastrar carro, 2 - Visualizar carro, 3 - Sair);");
        int opsao = ler.nextInt();
        while (opsao != 3) {
            //verificando a opsao informada pelo usuario
            if (opsao == 1) { //cadrastar
                // solicitando as informaçoes do carro
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
                
                //adicionando o objeto (Carro) na lista
                    listaCarros.add(meuCarro);
                    
            } else if (opsao == 2) {// visualizar
                
                //Navegando nos elementos da lista.
                for(int i = 0; i < listaCarros.size(); i++){
                    
                }
            }

            System.out.println("DESEJA: 1 - Cadastrar carro, 2 - Visualizar carro, 3 - Sair);");
            opsao = ler.nextInt();
        }

    }
}
