/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjetos3am_2023;

/**
 *
 * @author lorenzi
 */
public class Carro {
    private String cor;
    private String modelo;
    private float velocidade;
    private int capacidade;

    public Carro(String cor, String modelo, float velocidade, int capacidade) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.capacidade = capacidade;
    }

    public Carro(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    
    
    
    
    public void liga() {
        System.out.println("Você ligou o carro.");
    }
    
    public void desliga() {
        System.out.println("Você desligou o carro.");
    }
    
    public void acelera(int quantidade) {
        this.velocidade = this.velocidade * quantidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    
    
}
