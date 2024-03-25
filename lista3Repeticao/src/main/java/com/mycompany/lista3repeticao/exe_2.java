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

public class exe_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade, idadeMenor = 0, idadeMaior = 0;
        do {
            System.out.println("Digite a idade da pessoa: ");
            idade = ler.nextInt();
            if (idade >= 0 && idade <= 21) {
                idadeMenor++;

            } else if (idade >= 50 && idade <= 140) {
                idadeMaior++;
            }
        } while (idade >= 0 || idade <= 140);
        System.out.println(idadeMenor + "pessoas tem menos de 21 anos");
        System.out.println(idadeMaior + "pessoas tem mais de 50 anos");
    }
}
