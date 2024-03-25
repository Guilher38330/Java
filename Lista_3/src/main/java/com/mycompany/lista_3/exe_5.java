/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_3;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;
public class exe_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe o valor de A: ");
        a = ler.nextInt();
        System.out.println("Informe o valor de B: ");
        b = ler.nextInt();
        System.out.println("Informe o valor de C: ");
        c = ler.nextInt();
        
        if(a + b > c && a + c > b && b + c > a){
            System.out.println("Os 3 lados formam um triangulo!\n");
            if(a == b && a == c)
                System.out.println("Equilatero\n");
        }else{
            if(a == b || a == c || b == c)
                    System.out.println("Isosciles\n");
        else
                
                System.out.println("Escaleno\n");

        }
    }
}
