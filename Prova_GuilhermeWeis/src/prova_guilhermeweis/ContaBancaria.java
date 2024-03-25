/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova_guilhermeweis;

/**
 *
 * @author lorenzi
 */
public class ContaBancaria {
    private String nomeTitular;
    private String cpfTitular;
    private float saldo;

    public ContaBancaria(String nomeTitular, String cpfTitular, float saldo) {
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
    }

    public ContaBancaria(String nomeTitular, String cpfTitular) {
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = 0;
    }
    
    public boolean sacar(float valorSaque) {        
        boolean resultado;
        // verificando se o saque é possível
        if (this.saldo >= valorSaque) {
            this.saldo = this.saldo - valorSaque;
            resultado = true;
            //System.out.println("Saque efetuado com sucesso.");            
        } else {
            resultado = false;
            //System.out.println("Erro: saldo insuficiente.");            
        }
        return resultado;
    }
    
    public boolean depositar(float valorDeposito) {
        boolean resultado;
        if (valorDeposito > 0) {
            this.saldo = this.saldo + valorDeposito;
            resultado = true;
            //System.out.println("Depósito efetuado com sucesso.");
        } else {
            resultado = false;
            //System.out.println("Erro: depósito não efetuado.");
        }
        return resultado;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
