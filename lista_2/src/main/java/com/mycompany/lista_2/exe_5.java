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
public class exe_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salario, perc, aumento, novoSalario;
        System.out.println("Digite o valor do salario: ");
        salario = scan.nextFloat();
        System.out.println("Digite a porcentagem do aumento: ");
        perc = scan.nextFloat();
        
        novoSalario = salario + ((salario * perc) / 100);
        aumento = novoSalario - salario;
        
        System.out.println("Aumento de: "+ aumento);
        System.out.println("Novo salario e de: "+ novoSalario);
    }
}
