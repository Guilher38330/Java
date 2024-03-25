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

public class exe_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] Q = new int[10];
        int maior = 0;
        int posicao = 0;

        System.out.println("Preencha o vetor: ");
        for (int i = 0; i < Q.length; i++) {
            System.out.print("q[" + i + "]: ");
            Q[i] = ler.nextInt();
            if (Q[i] > 0) {
                if (Q[i] > maior) {
                    maior = Q[i];
                    posicao = i;
                }
            } else {
                System.out.println("Apenas numeros positivos sao aceitos. Digite novamente");
                i--;
            }
        }

        System.out.println("O maior elemento do vetor Q e " + maior + " e esta na posicao " + posicao);
    }
}
