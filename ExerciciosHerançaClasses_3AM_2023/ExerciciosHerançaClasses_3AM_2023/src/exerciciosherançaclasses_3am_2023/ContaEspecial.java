/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosherançaclasses_3am_2023;

/**
 *
 * @author lorenzi
 */
public class ContaEspecial extends ContaBancaria{
    private float limite;

    public ContaEspecial(float limite, String nomeTitular, String cpfTitular, float saldo) {
        super(nomeTitular, cpfTitular, saldo);
        this.limite = limite;
    }

    
    public boolean sacar(float valorSaque) {
        boolean resultado;
        resultado = super.sacar(valorSaque);
        // verificando o retorno do sacar
        if (resultado == false) {
            // verificando se o saque será possível com o uso do limite
            if ((super.getSaldo() + this.limite) >= valorSaque) {
                valorSaque = valorSaque - super.getSaldo();
                super.setSaldo(0);
                this.limite = this.limite - valorSaque;
                resultado = true;
            } else {
                resultado = false;
            }
        }
        
        return resultado;
    }
    
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

   
    
    
}
