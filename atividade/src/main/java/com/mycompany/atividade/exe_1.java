/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class exe_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n1, n2, n3;
        char continuar;

        do {
            System.out.print("Digite o primeiro número: ");
            n1 = ler.nextInt();

            System.out.print("Digite o segundo número: ");
            n2 = ler.nextInt();

            System.out.print("Digite o terceiro número: ");
            n3 = ler.nextInt();

            int maiorValor = obtemMaiorValor(n1, n2, n3);
            int menorValor = obtemMenorValor(n1, n2, n3);

            System.out.println("Maior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);

            System.out.print("Deseja informar novos valores? (S/N) ");
            continuar = ler.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');
        
        ler.close();
    }
}

    public static int obtemMaiorValor(int numero1, int numero2, int numero3) {
        return Math.max(Math.max(numero1, numero2), numero3);
    }

    public static int obtemMenorValor(int numero1, int numero2, int numero3) {
        return Math.min(Math.min(numero1, numero2), numero3);
    }
