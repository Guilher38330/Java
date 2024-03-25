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

public class exe_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float SB, SL, aulas_m, valor_H, INSS;
        System.out.println("Valor de aulas: ");
        valor_H = scan.nextFloat();
        System.out.println("Aulas dadas mensalmente: ");
        aulas_m = scan.nextFloat();
        System.out.println("Deasconto do INSS: ");
        INSS = scan.nextFloat();
        SB = valor_H * aulas_m;
        SL = SB - (SB / INSS);
        System.out.println("Salario Liquido: " + SL);
        
    }
}
