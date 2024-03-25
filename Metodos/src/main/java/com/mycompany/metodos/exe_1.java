/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;

public class exe_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float raio, area = 0, comprimento = 0;
        double Pi = 3.1415;
        System.out.println("Informe o raio: ");
        raio = ler.nextFloat();
        area = AreaCirculo(raio, Pi);
        System.out.println("Area do Circulo: " + area);
        comprimento = CompCircunferencia(raio, Pi);
        System.out.println("O comprimento da circunferencia: " + comprimento);
        System.out.println("");
    }

    public static Float AreaCirculo(float raio, double Pi) {
        float area_circulo;
        area_circulo = (float) (Pi * Math.pow(raio, 2));
        //area_circulo = (float)(Pi * (raio * raio));
        return area_circulo;
    }

    public static Float CompCircunferencia(float raio, double Pi) {
        float comprimento_circulo;
        comprimento_circulo = (float) (2 * Pi * raio);
        return comprimento_circulo;
    }
}
