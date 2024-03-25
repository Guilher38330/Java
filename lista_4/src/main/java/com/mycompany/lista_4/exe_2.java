/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;
public class exe_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double x1, x2, y1, y2, d; 
        
        System.out.println("Digite o valor do ponto x1: ");
        x1 = ler.nextDouble();
        System.out.println("Digite o valor do ponto x2: ");
        x2 = ler.nextDouble();
        System.out.println("Digite o valor do ponto y1: ");
        y1 = ler.nextDouble();
        System.out.println("Digite o valor do ponto y2: ");
        y2 = ler.nextDouble();
        
        d = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow ((y2 - y1), 2));
        
        System.out.println("Valor do ponto e: "+d);
            
    }
}
