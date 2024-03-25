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
    String cor;
    String modelo;
    float velocidade;
    int capacidade;

    public Carro(String cor, String modelo, float velocidade, int capacidade) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.capacidade = capacidade;
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
}
