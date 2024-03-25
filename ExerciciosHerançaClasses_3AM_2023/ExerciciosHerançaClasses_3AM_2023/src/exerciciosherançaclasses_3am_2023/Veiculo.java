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
public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void ligar() {
        System.out.println("Veículo ligado.");
    }
    
    public void desligar() {
        System.out.println("Veículo desligado.");
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Marca: " + this.marca + ", Modelo: " + this.modelo;
    }
    
    

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
}
