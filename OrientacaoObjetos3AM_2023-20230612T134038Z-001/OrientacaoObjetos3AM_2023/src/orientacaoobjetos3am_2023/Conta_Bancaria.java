/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos3am_2023;

/**
 *
 * @author aluno
 */
public class Conta_Bancaria {

    String nome_titular;
    String cpf_titular;
    float saldo;

    public Conta_Bancaria(String nome_titular, String cpf_titular, float saldo) {
        this.nome_titular = nome_titular;
        this.cpf_titular = cpf_titular;
        this.saldo = saldo;
    }

    public Conta_Bancaria(String nome_titular, String cpf_titular) {
        this.nome_titular = nome_titular;
        this.cpf_titular = cpf_titular;
        this.saldo = 0;
    }

    public boolean sacar(float valor_saque) {
        boolean resultado;
        //verificando se o saldo é possivel;
        if (this.saldo >= valor_saque) {
            this.saldo = this.saldo - valor_saque;
            //System.out.println("saque efetuado com sucesso.");
            resultado = true;
        } else {
            //System.out.println("Erro: saldo insuficiente.");
            resultado = false;
        }
        return resultado;
    }

    public boolean depositar(float valor_deposito) {
        boolean resultado;
        if (this.saldo > 0) {
            this.saldo = this.saldo + valor_deposito;
            //System.out.println("valor efetuado com sucesso.");
            resultado = true;
        } else {
            //System.out.println("Erro: deposito nao efetuado.");
            resultado = false;
        }
        return resultado;
    }
}
