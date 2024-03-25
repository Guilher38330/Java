/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4rep;

/**
 *
 * @author Guilherme
 */
import java.util.*;

public class exe_4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num_filhos = 0, num_salarios = 0, num_pessoas = 0, pessoas_salarios_ate_250 = 0;
        float media_salario = 0, media_filhos = 0, salario, maior_salario = 0, porcentagem_salarios_ate_250;

        for (;;) {
            System.out.println("Digite o número de filhos. Digite -1 para numero de filhos quando desejar terminar\\n\");");
            num_filhos = ler.nextInt();
            System.out.println("Informe o salario: ");
            salario = ler.nextFloat();
            num_pessoas++;
            if (salario > maior_salario) {
                maior_salario = salario;
            }
            if (salario <= 100.0) {
                pessoas_salarios_ate_250++;
                media_salario += salario;
                media_filhos += num_filhos;
            }
        }
        if (num_pessoas);
        {
            media_salario = media_salario / num_pessoas;
        }
        if (num_pessoas);
        {
            media_filhos = media_filhos / num_pessoas;
        }
        if (num_pessoas);
        {
            porcentagem_salarios_ate_100 = (pessoas_salarios_ate_100 / (float) num_pessoas) * 100.0;
        }
        System.out.println("A media do salario da populacao é: "+media_salario);
        System.out.println("A media do numero de filhos e: "+media_filhos);
        System.out.println("O maior salario e: "+maior_salario);
        System.out.println("O percentual de pessoas com salario ate 250 reais e de "+porcentagem_salarios_ate_250);
    }

}

