/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeheranca;

/**
 *
 * @author Guilherme
 */
public class ContaEspecial extends ContaBancaria{
    private float limite;

    public ContaEspecial(float limite, String nomeTitular, String cpfTitular, float saldo) {
        super(nomeTitular, cpfTitular, saldo);
        this.limite = limite;
    }
    public boolean sacar(float valorSaque){
        boolean resultado;
        resultado = super.sacar(valorSaque);
        // verificando o retorno do sacar
        if (resultado == false){
            //verificando se o saque sera posivel com o uso do limite
            if(super.getSaldo() + this.limite >= valorSaque){
                valorSaque = valorSaque - super.getSaldo();
                super.setSaldo(0);
                this.limite = this.limite - valorSaque;
                resultado = true;
            }else{
               // return resultado;
            }
        }
        
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    
}
