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

public class exe_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º numero inteiro positivo: ");
            num = sc.nextInt();

            if (ehPrimo(num) == 1) {
                System.out.println("O número " + num + " é primo!");
            } else {
                System.out.println("O número " + num + " não é primo!");
            }
        }

        sc.close();
    }

    public static int ehPrimo(int num) {
        if (num <= 1) {
            return 0;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}
