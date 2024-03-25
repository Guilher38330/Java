/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeheranca;

/**
 *
 * @author Guilherme
 */
public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public ContaPoupanca(int diaRendimento, String nomeTitular, String cpfTitular, float saldo) {
        super(nomeTitular, cpfTitular, saldo);
        this.diaRendimento = diaRendimento;
    }
    public void clacularNovoSaldo(float taxaRendimento, int diaAtual){
        if (this.diaRendimento == diaAtual) {
            taxaRendimento = taxaRendimento / 100;
            float noveSaldo = super.getSaldo() + (super.getSaldo() * taxaRendimento);
            super.setSaldo(noveSaldo);
        }
    }

    public int getDiarendimento() {
        return diaRendimento;
    }

    public void setDiarendimento(int diarendimento) {
        this.diaRendimento = diarendimento;
    }

    
}
