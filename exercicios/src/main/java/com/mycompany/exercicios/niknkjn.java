/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author Guilherme
 */
public class niknkjn {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            for (int j = 100; j <= 999; j++) {
                int product = i * j;
                if (product >= 100000 && product <= 999999 && String.valueOf(product).contains("57")) {
                    System.out.println("4-digit number: " + i + ", 3-digit number: " + j + ", Product: " + product);
                }
            }
        }
    }
}

