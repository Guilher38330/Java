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

public class exe_6 {

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int[] R = new int[5];
            int[] S = new int[10];
            int[] X = new int[5];
            int count = 0;

            for (int i = 0; i < R.length; i++) {
                System.out.println("Informe um número para R: ");
                R[i] = scan.nextInt();
            }

            for (int i = 0; i < S.length; i++) {
                System.out.println("Informe um número para S: ");
                S[i] = scan.nextInt();
            }

            for (int i = 0; i < R.length; i++) {
                for (int j = 0; j < S.length; j++) {
                    if (R[i] == S[j]) {
                        X[count++] = R[i];
                    }
                }
            }

            System.out.println("Elementos comuns entre R e S: ");
            for (int i = 0; i < count; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}
