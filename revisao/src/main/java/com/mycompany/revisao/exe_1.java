/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao;

/**
 *
 * @author Guilherme
 */

import java.util.Scanner;

public class exe_1 {

    public static void main(String[] args) {
        Scanner ler = Scanner new(System.in);
        double peso, altura, IMC;

        System.out.println("Informe a altura");
        altura = ler.nextDouble();
        System.out.println("Informe o peso");
        peso = ler.nextDouble();

        IMC = peso / altura * altura;

        if (IMC < 18) {
            System.out.println("Seu peso e: " + IMC);
            System.out.println("Cuidado, você está abaixo do peso normal");
        } else if (IMC >= 18 || IMC < 25) {
            System.out.println("Seu peso e: " + IMC);
            System.out.println("Parabéns, você está no peso normal");
        } else {
            System.out.println("Seu peso e: " + IMC);
            System.out.println("Cuidado, você está acima do seu peso normal");
        }
    }
}
