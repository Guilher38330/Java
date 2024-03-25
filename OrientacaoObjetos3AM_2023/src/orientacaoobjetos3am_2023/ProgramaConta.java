/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjetos3am_2023;

import java.util.Scanner;

/**
 *
 * @author lorenzi
 */
public class ProgramaConta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // solicitando as informações ao usuário
        System.out.println("Informe o nome do titular: ");
        String nome = entrada.nextLine();
        System.out.println("Informe o cpf do titular: ");
        String cpf = entrada.nextLine();
        System.out.println("Informe o saldo da conta: ");
        float saldo = entrada.nextFloat();
        // criando o objeto da classe conta
        ContaBancaria minhaConta = new ContaBancaria(nome, cpf, saldo);
        
        System.out.println("DESEJA: 1 - Ver saldo, 2 - Sacar, 3 - Depositar, 4 - Sair");
        int opcao = entrada.nextInt();
        while (opcao != 4) {
            // verificando a opção desejada pelo usuário
            if (opcao == 1) { // ver saldo
                System.out.println("Saldo: " + minhaConta.getSaldo());
            } else if (opcao == 2) { // sacar
                // solicitando ao usuário o valor que deseja sacar
                System.out.println("Informe o valor que deseja sacar: ");
                float valorSaque = entrada.nextFloat();
                // chamando o método sacar
                boolean resultado = minhaConta.sacar(valorSaque);
                // verificando o resultado do saque
                if (resultado == true) {
                    System.out.println("Saque efetuado com sucesso.");
                } else {
                    System.out.println("Erro: saldo insuficiente.");
                }
            } else if (opcao == 3) { // depositar
                // solicitando ao usuário o valor que deseja depositar
                System.out.println("Informe o valor que deseja depositar: ");
                float valorDeposito = entrada.nextFloat();
                // chamando o método depositar
                boolean resultado = minhaConta.depositar(valorDeposito);
                // verificando o resultado do depósito
                if (resultado == true) {
                    System.out.println("Depósito efetuado com sucesso.");
                } else {
                    System.out.println("Erro: depósito não efetuado.");
                }
            }
            
            System.out.println("DESEJA: 1 - Ver saldo, 2 - Sacar, 3 - Depositar, 4 - Sair");
            opcao = entrada.nextInt();
        }
    }
}
