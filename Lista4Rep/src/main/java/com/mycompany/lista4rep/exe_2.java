/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4rep;

/**
 *
 * @author Guilherme
 */
public class exe_2 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.print(i + "" + j + "\t");
                }
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
