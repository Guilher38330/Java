/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;

public class exe_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe um valor inteiro positivo: ");
            int valor = ler.nextInt();
            while (valor < 0) {
                System.out.print("Valor inválido! Informe um valor inteiro positivo: ");
                valor = ler.nextInt();
            }

            int soma = somatorio(valor);
            System.out.println("A soma dos valores de 1 até " + valor + " é: " + soma);
        }

        ler.close();
    }

    public static int somatorio(int valor) {
        int soma = 0;
        for (int i = 1; i <= valor; i++) {
            soma += i;
        }
        return soma;
    }
}
