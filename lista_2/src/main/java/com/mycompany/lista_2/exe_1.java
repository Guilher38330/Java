/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_2;

/**
 *
 * @author Guilherme
 */

import java.util.Scanner;

public class exe_1 {
     public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int base, altura, area;
        System.out.println("Digite a base: ");
         base = scan.nextInt();
        System.out.println("Digite a altura: ");
        altura = scan.nextInt();
        area = (base * altura) /2;
        System.out.println("Area: "+area);
     }
}
