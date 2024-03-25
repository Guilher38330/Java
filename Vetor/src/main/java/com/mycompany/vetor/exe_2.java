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
public class exe_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int D[] = new int [10];
        int F[] = new int [10];
        int i;
        
        for(i = 0; i < 10; i++){
            System.out.println("Informe o "+ (i + 1) + "º numero: ");
            D[i] = ler.nextInt();
        }
        for(i = 0; i < 10; i++){
            F[i] = D[i];
        }
        for(i = 0; i < 10; i++){
            System.out.println("F ["+1+"] = "+F[i]);
        }
    }
}
