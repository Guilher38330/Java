/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orientacaoobjetos3am_2023;

/**
 *
 * @author aluno
 */
public class Lampada {

    private String cor;
    private String modelo;
    private float potencia;
    private int estado;

    public Lampada(String Cor, String Modelo, float Potencia, int Estado) {
        this.cor = cor;
        this.modelo = modelo;
        this.potencia = potencia;
        this.estado = estado;
    }
    /*Demonstração plus ultra
    public Lampada(String Cor, String Modelo, float Potencia,) {
        this.cor = Cor;
        this.modelo = Modelo;
        this.potencia = Potencia;
        this.estado = 0;
    */
    

    public void Liga() {
        if (estado == 0) {
            this.estado = 1;
            System.out.println("Você ligou a lampada!.");
        } else {
            System.out.println("Lampada ja esta ligada!");
        }
    }

    public void Desliga() {
        if (estado == 1) {
            this.estado = 0;
            System.out.println("Você desligou a lampada!.");
        } else {
            System.out.println("lampada ja esta desligada");
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
