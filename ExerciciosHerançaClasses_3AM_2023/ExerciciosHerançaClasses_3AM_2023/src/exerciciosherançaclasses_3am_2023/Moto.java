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
public class Moto extends Veiculo{
    
    private int quantidadeRodas;

    public Moto(int quantidadeRodas, String marca, String modelo) {
        super(marca, modelo);
        this.quantidadeRodas = quantidadeRodas;
    }

    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }
    
    @Override
    public void desligar() {
        System.out.println("Moto desligada.");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", quantidade de rodas: " + this.quantidadeRodas;
    }
    
    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public void setQuantidadeRodas(int quantidadeRodas) {
        this.quantidadeRodas = quantidadeRodas;
    }

    
    
    
}
