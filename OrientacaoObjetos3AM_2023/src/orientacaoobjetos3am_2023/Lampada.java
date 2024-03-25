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
public class Lampada {
    private String cor;
    private String modelo;
    private float potencia;
    private int estado; // 0 - desligado, 1 - ligado

    public Lampada(String cor, String modelo, float potencia, int estado) {
        this.cor = cor;
        this.modelo = modelo;
        this.potencia = potencia;
        this.estado = estado;
    }

    public Lampada(String cor, String modelo, float potencia) {
        this.cor = cor;
        this.modelo = modelo;
        this.potencia = potencia;
        this.estado = 0; // inicializando a lampada como desligada
    }
    
    
    
    public void ligar() {
        if (this.estado == 0) {
            this.estado = 1;
            System.out.println("Você ligou a lâmpada.");
        } else {
            System.out.println("Lâmpada já está ligada.");
        }
    }
    
    public void desligar() {
        if (this.estado == 1) {
            this.estado = 0;
            System.out.println("Você desligou a lâmpada.");    
        } else {
            System.out.println("Lâmpada já está desligada.");
        }
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

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
}
