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
public class exe_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int GrausC, GrausF;
        System.out.println("Informe a temperatura em graus Fahrenheit: ");
        GrausF = scan.nextInt();
        
        GrausC = ((GrausF - 32) * 5/9);
        
        System.out.println("A temperatura em graus celcios e: "+ GrausC);
    }
}
