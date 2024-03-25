/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos3am_2023;

/**
 *
 * @author aluno
 */
import java.util.LinkedList;
import java.util.Scanner;
public class ProgramaCarro_AlocacaoDinamica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //declarando a lista de carros.
        LinkedList<Carro> listaCarros = new LinkedList();
        
        System.out.println("DESEJA: 1 - cadastrar carro, 2 - visualizar carro, 3 - sair");
        
        int opcao = scan.nextInt();
        while(opcao != 3){
            //Verificando a opção do usuário
            
            if(opcao == 1){//cadastrar
                
                //1° solicitar as informações do carro
                    System.out.println("informe a cor do carro:");
                    String cor = scan.nextLine();
                    System.out.println("informe a modelo do carro:");
                    String modelo = scan.nextLine();
                    System.out.println("informe a velocidade do carro:");
                    float velocidade = scan.nextFloat();
                    System.out.println("informe a capacidade do carro:");
                    int capacidade = scan.nextInt();
                    
                    //Criando o objeto da classe.
                    Carro meuCarro = new Carro(cor, modelo, velocidade, capacidade);
                    
                    //adicionando o objeto (Carro) na lista
                    listaCarros.add(meuCarro);
                    
            }else if(opcao == 2){//visualizar
                
                //Navegando nos elementos da lista.
                for(int i = 0; i < listaCarros.size(); i++){
                    
                }
            }
            System.out.println("DESEJA: 1 - cadastrar carro, 2 - visualizar carro, 3 - sair");
            opcao = scan.nextInt();
        }
    }
}
