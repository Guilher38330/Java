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

    String cor;
    String modelo;
    float potencia;
    int estado;

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
}
