/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividadepolimorfismo;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        LinkedList<ContaBancaria> listaConta = new LinkedList<>();

        System.out.println("DESEJA: 1 - Cadrastar conta, 2 - Visualizar contas cadrastradas, 3 - Verificar saldo, 4 - Efetuar saque, 5 - Efetuar deposito, 6 - Excluir conta, 7 - Pesquisar conta por CPF, 8 - Editar dados da conta, 9 - Efetuar Saque (através do CPF), 10 - Atualizar saldo (apenas contas do tipo Poupança), 11 - Sair");
        int opcao = ler.nextInt();
        while (opcao != 11) {
            if (opcao == 1) {
                System.out.println("(1 - Conta Bancária,\n 2 – Conta Especial,\n 3 – ContaPoupança");
                int opcao1 = ler.nextInt();
                System.out.println("Informe o nome: ");
                String nome = ler.nextLine();
                nome = ler.nextLine();
                System.out.println("Informe o CPF: ");
                String cpf = ler.nextLine();
                System.out.println("Informe o saldo da conta: ");
                float saldo = ler.nextFloat();

                if (opcao1 == 1) {// bancaria
                    ContaBancaria minhaConta = new ContaBancaria(nome, cpf, saldo);
                    listaConta.add(minhaConta);
                } else if (opcao1 == 2) {// especial
                    System.out.println("Informe o limite da conta especial: ");
                    float limite = ler.nextFloat();
                    ContaEspecial minhaContaEspecial = new ContaEspecial(limite, nome, cpf, saldo);
                    listaConta.add(minhaContaEspecial);
                } else if (opcao1 == 3) {// poupanca
                    System.out.println("Informe o dia de rendimento: ");
                    int rendimento = ler.nextInt();
                    ContaPoupanca minhaContaPoupanca = new ContaPoupanca(rendimento, nome, cpf, saldo);
                    listaConta.add(minhaContaPoupanca);
                }
                System.out.println("Conta cadrastada com sucesso! ");

            } else if (opcao == 2) {
                for (int i = 0; i < listaConta.size(); i++) {
                    ContaBancaria minhaConta = listaConta.get(i);
                    System.out.println("Nome: " + minhaConta.getNomeTitular() + ", CPF: " + minhaConta.getCpfTitular() + ", Saldo: " + minhaConta.getSaldo());
                }
            } else if (opcao == 3) {
                System.out.println("Informe a posicao da conta desejada: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaConta.size()) {
                    ContaBancaria minhaConta = listaConta.get(posicao);
                    System.out.println("Nome: " + minhaConta.getNomeTitular() + ", CPF: " + minhaConta.getCpfTitular() + ", Saldo: " + minhaConta.getSaldo());
                } else {
                    System.out.println("Erro: posicao informada é inválida.");
                }
            } else if (opcao == 4) {
                System.out.println("Informe a posicao desejada: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaConta.size()) {
                    ContaBancaria minhaConta = listaConta.get(posicao);
                    System.out.println("Informe quanto voce deseja sacar: ");
                    float valorSaque = ler.nextInt();
                    minhaConta.sacar(valorSaque);
                    boolean resultado = minhaConta.sacar(valorSaque);
                    if (resultado == true) {
                        System.out.println("Saque efetuado com sucesso.");
                    } else {
                        System.out.println("Erro: saldo insuficiente.");
                    }
                } else {
                    System.out.println("Erro: posicao informada é inválida.");
                }
            } else if (opcao == 5) {
                System.out.println("Informe a posicao desejada: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaConta.size()) {
                    ContaBancaria minhaConta = listaConta.get(posicao);
                    System.out.println("Informe quanto voce deseja sacar: ");
                    float valorDeposito = ler.nextInt();
                    minhaConta.depositar(valorDeposito);
                    boolean resultado = minhaConta.depositar(valorDeposito);
                    if (resultado == true) {
                        System.out.println("Deposito efetuado com sucesso.");
                    } else {
                        System.out.println("Erro: depósito não efetuado.");
                    }
                } else {
                    System.out.println("Erro: posicao informada é inválida.");
                }
            } else if (opcao == 6) {
                System.out.println("Informe a posicao desejada: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaConta.size()) {
                    ContaBancaria minhaConta = listaConta.get(posicao);
                    listaConta.remove(posicao);
                    System.out.println("Conta removida!");
                } else {
                    System.out.println("Erro: Posicao informada invalida!");
                }
            } else if (opcao == 7) {
                System.out.println("Informe o CPF a ser pesquisado: ");
                String modeloPesquisado = ler.nextLine();
                modeloPesquisado = ler.nextLine();
                boolean achei = false;
                for (int i = 0; i < listaConta.size(); i++) {
                    ContaBancaria minhaConta = listaConta.get(i);
                    if (modeloPesquisado.equals(minhaConta.getCpfTitular())) {
                        System.out.println("Nome: " + minhaConta.getNomeTitular() + ", CPF: " + minhaConta.getCpfTitular() + ", Saldo: " + minhaConta.getSaldo());
                        achei = true;
                        break;
                    }
                }
                if (achei == false) {
                    System.out.println("Erro: não existe conta com esse CPF informado!");
                }
            } else if (opcao == 8) {
                System.out.println("Informe a posicao desejada: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaConta.size()) {
                    ContaBancaria minhaConta = listaConta.get(posicao);
                    System.out.println("Informe o nome: ");
                    String nomeTitular = ler.nextLine();
                    nomeTitular = ler.nextLine();
                    System.out.println("Informe o CPF: ");
                    String cpfTitular = ler.nextLine();
                    System.out.println("Informe o saldo da conta: ");
                    float saldo = ler.nextFloat();
                    minhaConta.setNomeTitular(nomeTitular);
                    minhaConta.setCpfTitular(cpfTitular);
                    minhaConta.setSaldo(saldo);
                    System.out.println("Conta editado com sucesso");
                } else {
                    System.out.println("Erro: Posicao informada invalida!");
                }

            } else if (opcao == 9) {
                System.out.println("Informe o CPF a ser pesquisado: ");
                String modeloPesquisado = ler.nextLine();
                modeloPesquisado = ler.nextLine();
                boolean achei = false;
                for (int i = 0; i < listaConta.size(); i++) {
                    ContaBancaria minhaConta = listaConta.get(i);
                    if (modeloPesquisado.equals(minhaConta.getCpfTitular())) {
                        System.out.println("Nome: " + minhaConta.getNomeTitular() + ", CPF: " + minhaConta.getCpfTitular() + ", Saldo: " + minhaConta.getSaldo());
                        System.out.println("Informe quanto voce deseja sacar: ");
                        float valorSaque = ler.nextInt();
                        minhaConta.sacar(valorSaque);
                        boolean resultado = minhaConta.sacar(valorSaque);
                        if (resultado == true) {
                            System.out.println("Saque efetuado com sucesso.");
                        } else {
                            System.out.println("Erro: saldo insuficiente.");
                        }
                        achei = true;
                        break;
                    }
                }
                if (achei == false) {
                    System.out.println("Erro: não existe conta com esse CPF informado!");
                }
            }else if(opcao == 10){
                System.out.println("Informe a posicao desejada: ");
                int posicao = ler.nextInt();
                if (posicao >= 0 && posicao < listaConta.size()) {
                    ContaBancaria minhaConta = listaConta.get(posicao);
                    
                    if(minhaConta instanceof ContaPoupanca){
                        ContaPoupanca minhaContaPoupanca = (ContaPoupanca)minhaConta;
                        System.out.println("Informe a taxa de rendimento: ");
                        float taxaRendimento = ler.nextFloat();
                        System.out.println("Informe o dia do rendimento: ");
                        int diaRendimento = ler.nextInt();
                        
                        minhaContaPoupanca.calcularNovoSaldo(taxaRendimento, posicao);
                    }else{
                        System.out.println("Erro, a conta informada nao é do tipo poupanca");
                }
                    
            }else{
                    System.out.println("Posiçao informada invalida!");
                }
            System.out.println("DESEJA: 1 - Cadrastar conta, 2 - Visualizar contas cadrastradas, 3 - Verificar saldo, 4 - Efetuar saque, 5 - Efetuar deposito, 6 - Excluir conta, 7 - Pesquisar conta por CPF, 8 - Editar dados da conta, 9 - Efetuar Saque (através do CPF), 10 - Atualizar saldo (apenas contas do tipo Poupança), 11 - Sair");
            opcao = ler.nextInt();
        }
    }
}
