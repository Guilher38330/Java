/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacaoobjetos3am_2023;

/**
 *
 * @author aluno
 */
import java.util.Scanner;

public class Programa_CB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //solicitano as informações da conta.
        System.out.println("Informe o nome do titular: ");
        String nome_titular = entrada.nextLine();
        
        System.out.println("Informe o cpf do titular: ");
        String cpf_titular = entrada.nextLine();
        
        System.out.println("Informe o valor do saldo: ");
        float saldo = entrada.nextFloat();
        
        //criando o objeto da classe Conta_Bancaria.
        Conta_Bancaria minhaConta = new Conta_Bancaria(nome_titular, cpf_titular, saldo);

        System.out.println("DESEJA: 1 - Ver saldo, 2 - Sacar, 3 - Depositar, 4 - Sair");
        int opcao = entrada.nextInt();
        while (opcao != 4) {
            
            //verificando a opcão desejada
            if (opcao == 1) {//ver saldo
                System.out.println("Saldo: " + minhaConta.saldo);
                
                
            } else if (opcao == 2) {
                //solicitando o valor que deseja sacar
                System.out.println("Informe o valor que deseja sacar:");
                float valor_saque = entrada.nextFloat();
                //chamando valor_saque.
                boolean resultado = minhaConta.sacar(valor_saque);
                //verificando valor do saque.
                if(resultado == true){
                    System.out.println("Saque efetuado com sucesso");
                }else{
                    System.out.println("Erro: saldo insuficiente");
                }
                
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja depositar:");
                float valor_deposito = entrada.nextFloat();
                //chamando valor_deposito.
                boolean resultado = minhaConta.depositar(valor_deposito);
                //verificando valor do deposito.
                if(resultado == true){
                    System.out.println("Deposito efetuado com sucesso");
                }else{
                    System.out.println("Erro: deposito nao efetuado");
                }
                
            }
            System.out.println("DESEJA: 1 - Ver saldo, 2 - Sacar, 3 - Depositar, 4 - Sair");
            opcao = entrada.nextInt();
        }

    }

}
