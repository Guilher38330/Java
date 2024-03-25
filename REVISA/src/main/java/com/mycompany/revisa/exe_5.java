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

public class exe_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] U = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + " numero: ");
            U[i] = ler.nextInt();
        }
        
        for (int i = 0; i < 5; i++) {
            int temp = U[i];
            U[i] = U[9 - i];
            U[9 - i] = temp;
        }

 
        System.out.println("Vetor modificado:");
        for (int i = 0; i < 10; i++) {
            System.out.println(U[i]);
        }
    }
}

