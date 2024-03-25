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

public class exe_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] Notas = new int[10];
        int soma = 0,  contA = 0;
        int i;
        float mediaT = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Digite a " + (i + 1) + " nota: ");
            Notas[i] = ler.nextInt();

        }
        for (i = 0; i < 10; i++) {
            soma = Notas[i] + soma;
            mediaT = soma / 10;
            if (Notas[i] > mediaT) {
                contA++;
            }
        }
        for (i = 0; i < 10; i++) {
            System.out.println("A " + (i + 1) + " nota: : " + Notas[i]);
            System.out.println("As soma das notas: " + soma);
            System.out.println("Media da turma: " + mediaT);
            System.out.println("Alunos aprovados: " + contA);
            System.out.println("--------------------------");
        }
        

    }
}
