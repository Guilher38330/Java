/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicios;

/**
 *
 * @author Guilherme
 */
public class jnvknkjdn {
    public static void main(String[] args) {
        
    
    int d[] = {2, 0, -5, 8, -1, 0, -9, 10, 2, -3, 4, 7};

int tamanhoC = 0;

for (int i = 0; i < d.length; i++) {
   if (d[i] > 0) {
      tamanhoC++;
   }
}

int c[] = new int[tamanhoC];
int j = 0;

for (int i = 0; i < d.length; i++) {
   if (d[i] > 0) {
      c[j] = d[i];
      j++;
   }
}
}
}
