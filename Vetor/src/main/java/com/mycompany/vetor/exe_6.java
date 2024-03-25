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
public class exe_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x[] = new int[10];
        int y[] = new int[10], i;
        
        for(i = 0; i < 10; i++){
            System.out.println("Informe um valor: ");
            x[i] = ler.nextInt();
        } 
        for(i = 0; i < 10; i++){
		if (i %2 == 0){
			y[i] = x[i] * 2;
		} else {
			y[i] = x[i] * 3;
		}
	}
        for(i = 0; i < 10; i++){
            System.out.println("O valor do vetor y e: "+y[i]);
        }
    }
}
