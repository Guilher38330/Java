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
public class Carro extends Veiculo{
    private int tamanhoPortaMalas;

    public Carro(int tamanhoPortaMalas, String marca, String modelo) {
        super(marca, modelo);
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }
    
    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado.");
    }
    
    @Override
    public String toString() {
        return super.toString() + ", tamanho porta malas: " + this.tamanhoPortaMalas;
    }
    
    public int getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }

    public void setTamanhoPortaMalas(int tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }
    
    
    
    
}
