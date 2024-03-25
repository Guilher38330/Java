/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeheranca;

/**
 *
 * @author Guilherme
 */
public class Moto extends Veiculo{
    private int numeroRodas;

    public Moto(int numeroRodas, String marca, String modelo) {
        super(marca, modelo);
        this.numeroRodas = numeroRodas;
    }

    public int getNumeroRodas() {
        return numeroRodas;
    }

    public void setNumeroRodas(int numeroRodas) {
        this.numeroRodas = numeroRodas;
    }
    @Override
    public  void liga(){
        System.out.println("Você ligou a moto");
    }
    @Override
    public  void desliga(){
        System.out.println("Você desligou a moto");
    }
    
}
