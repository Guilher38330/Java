/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor;

/**
 *
 * @author Guilherme
 */
public class exe_1 {
    public static void main(String[] args) {
        int A[] = new int [10];
        int valor = 0, i;
        for(i = 0; i < 10; i++){
            valor = valor + 10;
            A[i] = valor;
        }
        for(i = 0; i < 10; i++){
            System.out.println("O valor da A["+i+"] = "+A[i]);
    }
}
}