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
public class exe_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salario_min, salario_pessoa, qtd_sal_min;
        System.out.println("O valor do salario minimo e: ");
        salario_min = scan.nextFloat();
        System.out.println("Informe o valor do salario recebido pela pessoa: ");
        salario_pessoa = scan.nextFloat();
        
        qtd_sal_min = (salario_pessoa / salario_min);
        
        System.out.println("A quantidade de salarios minimos que a pessoa recebe e: "+ qtd_sal_min);
    }
}
