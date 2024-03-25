/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.simul_p_2;

/**
 * Ler um matriz D de 12 elementos (4X3) e criar a matriz E de 12 elementos
 * (4X3) retirando todos os valores impares e negativos e substituindo por ZERO,
 * a seguir mostrar as duas matrizes.
 *
 * @author Guilherme
 */
import java.util.Scanner;

public class SIMUL_P_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int D[][] = new int[4][3];
        int E[][] = new int[4][3];
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("Insire um valor para determinar a matrix D:");
                D[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {

                if (D[i][j] < 0 || D[i][j] % 2 == 1) {
                    E[i][j] = 0;
                } else {
                    E[i][j] = D[i][j];
                }
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("" + D[i][j]);
            }
            System.out.println();
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("" + E[i][j]);
            }
            System.out.println();
        }
    }
}
