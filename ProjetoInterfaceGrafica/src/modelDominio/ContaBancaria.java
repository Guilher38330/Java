/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDominio;

/**
 *
 * @author lorenzi
 */
public class ContaBancaria {
    private Cliente clienteTitular;
    private float saldo;

    public ContaBancaria(Cliente clienteTitular, float saldo) {
        this.clienteTitular = clienteTitular;
        this.saldo = saldo;
    }

    public ContaBancaria(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
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

    
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getClienteTitular() {
        return clienteTitular;
    }

    public void setClienteTitular(Cliente clienteTitular) {
        this.clienteTitular = clienteTitular;
    }
    
    
}
