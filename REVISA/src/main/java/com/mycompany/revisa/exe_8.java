/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisa;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;

public class exe_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] M = new int[5][5];
        int somaLinha4 = 0, somaColuna2 = 0, somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0, somaTotal = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 5; j++) {
            somaLinha4 += M[3][j];
        }
        System.out.println("Soma da linha 4: " + somaLinha4);

        for (int i = 0; i < 5; i++) {
            somaColuna2 += M[i][1];
        }
        System.out.println("Soma da coluna 2: " + somaColuna2);

        for (int i = 0; i < 5; i++) {
            somaDiagonalPrincipal += M[i][i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

        for (int i = 0; i < 5; i++) {
            somaDiagonalSecundaria += M[i][4 - i];
        }
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaTotal += M[i][j];
            }
        }
        System.out.println("Soma total: " + somaTotal);
    }
}
