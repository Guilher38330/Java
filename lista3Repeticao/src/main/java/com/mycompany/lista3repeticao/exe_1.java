/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3repeticao;

/**
 *
 * @author aluno
 */
import java.util.*;

public class exe_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, i;
        char sexo;
        for (i = 0; 1 < 10; i++) {
            System.out.println("-----------------");
            System.out.println("Informe a idade: ");
            idade = ler.nextInt();
            System.out.println("Informe o sexo: ");
            sexo = ler.next().charAt(0);
            if ((idade >= 21) && (sexo == 'm' || sexo == 'M')){
                System.out.println("Sexo: " + sexo + "\n Idade: " + idade);
            }
        }
    }
}
