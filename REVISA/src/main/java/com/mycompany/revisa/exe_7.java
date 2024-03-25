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

public class exe_7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] A = new int[4][6];
        int[][] B = new int[4][6];
        int[][] S = new int[4][6];
        int[][] D = new int[4][6];
        int i, j;

        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 6; ++j) {
                System.out.println("Informe o " + (i + 1) + " elemento de A: ");
                A[i][j] = ler.nextInt();
            }
        }
        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 6; ++j) {
                System.out.println("Informe o " + (i + 1) + " elemento de B: ");
                B[i][j] = ler.nextInt();
            }
        }
        
        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 6; ++j) {
                S[i][j] = A[i][j] + B[i][j];
                System.out.println("Soma do A + B "+ S [i][j]);
            }
            System.out.println("\n");
        }
        
        for (i = 0; i < 4; ++i) {
            for (j = 0; j < 6; ++j) {
                D[i][j] = A[i][j] - B[i][j];
                System.out.println("Diferenca do A + B "+ D[i][j]);
            }
            System.out.println("\n");
        }
    }
}
