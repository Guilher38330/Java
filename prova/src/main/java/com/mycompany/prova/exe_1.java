/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;

public class exe_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float n1, n2, sub, div;
        System.out.println("Informe o n1: ");
        n1 = ler.nextFloat();
        System.out.println("Informe o n2: ");
        n2 = ler.nextFloat();

        div = n1 / n2;
        sub = n1 - n2;

        if (n1 % 2 != 0 && n2 % 2 != 0) {
            System.out.println("O numero e impar\nA divisao sera de " + div);
        } else {
            System.out.println("A subtracao sera assim:" + sub);
        }

    }
}
