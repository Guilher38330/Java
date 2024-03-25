/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3repeticao;

/**
 *
 * @author aluno
 */
import java.util.*;
public class exe_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float nota;
        int contaA = 0, contaE = 0, contaR = 0;
        float somaA = 0, somaE = 0, somaR = 0;
        float mediaA, mediaE, mediaR;
        do {
            System.out.println("Informe a nota:");
            nota = ler.nextFloat();
            if (nota >= 6 && nota <= 10) {
                contaA++;
                somaA = somaA + nota;
            } else if (nota >= 4 && nota < 6) {
                contaE++;
                somaE = somaE + nota;
            } else if (nota > 0 && nota < 4) {
                contaR++;
                somaR = somaR + nota;
            }
            while (nota != 99);
            mediaA = somaA / contaA;
            mediaE = somaE / contaE;
            mediaR = somaR / contaR;
        }
    }

}
