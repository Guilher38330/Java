/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4;
/**
 *
 * @author Guilherme
 */

import java.util.Scanner; 
public class exe_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero_L;
        float per, area, base, altura = 0;
        System.out.println("Digite o numero de lados: ");
        numero_L = ler.nextInt();
        
        if (numero_L == 3){
            System.out.println("A figura é um triangulo\n");
            System.out.println("Informe a base");
            base = ler.nextFloat();
            System.out.println("Informe a altura");
            altura = ler.nextFloat();
            per = (2 * base) + (2 * altura);
            System.out.println("O perimetro é: "+ per);
        }else if (numero_L == 4){
            System.out.println("A figura é um quadrado\n");
            System.out.println("Informe a base");
            base = ler.nextFloat();
            System.out.println("Informe a altura");
            altura = ler.nextFloat();
            area = (base * altura);
            System.out.println("A area é: " + area);
        }else if (numero_L == 5){
            System.out.println("A figura é um pentagono\n");
        }else{
            System.out.println("Poligono não identificado\n");
        }
    }
}
