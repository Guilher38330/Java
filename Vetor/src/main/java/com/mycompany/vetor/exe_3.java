/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor;

/**
 *
 * @author Guilherme
 */
import java.util.*;

public class exe_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int C[] = new int[10], i;
        for (i = 0; i < 10; i++) {
            System.out.println("Informe o " + (i + 1) + "º numero: ");
            C[i] = ler.nextInt();
            if (C[i] < 0) {
                C[i] = 0;
            }
            System.out.println("O valor do vetor C e: " + C[i]);
        }
    }
}
