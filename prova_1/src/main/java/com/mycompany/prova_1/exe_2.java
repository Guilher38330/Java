/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova_1;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;
public class exe_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] D = new int[12];
        
        int i, tamanhoC = 0;
        
        
        for (i = 0; i < 12; i++) {
            System.out.println("Digite o " + (i + 1) + " valor: ");
            D[i] = ler.nextInt();
        }
        for (i = 0; i < 12; i++) {
            if(D[i] <= 0){
               tamanhoC++;
            }
        }
        int[] C = new int[tamanhoC];
        int j;
        
        for (j = 0; j < tamanhoC; j++){
            System.out.println("Os valores do vetor D: "+D[i]);
            System.out.println("Os valores do vetor C: "+C[j]);
        }
    }
}


