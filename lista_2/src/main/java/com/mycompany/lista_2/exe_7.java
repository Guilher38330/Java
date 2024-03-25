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
public class exe_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float ValorG, gorgeta, ValorT;
        System.out.println("Qual o valor gasto: ");
        ValorG = scan.nextFloat();
        System.out.println("Qual o valor da gorgeta: ");
        gorgeta = scan.nextFloat();
        
        ValorT = ValorG * gorgeta/100;
        
        System.out.println("O valor gasto foi de: "+ ValorT);
    }
}
