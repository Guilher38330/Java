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
public class exe_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i, j, idade = 0, menores18 = 0, acima80kgs = 0, total_pessoas;
        float peso = 0, altura = 0, idade_media = 0, altura_media = 0, porcentagem_acima80kgs, NUM_TIMES = 2, NUM_JOGADORES = 3;
        total_pessoas = NUM_TIMES * NUM_JOGADORES;
        
        for(i = 0; i < NUM_TIMES; i++){
        idade_media = 0;
            for(j = 0; j < NUM_JOGADORES; j++){
                System.out.println("Digite a idade do jogador:\n ");
                idade = ler.nextInt();
                System.out.println("Digite o peso do jogador:\n ");
                peso = ler.nextFloat();
                System.out.println("Digite a altura do jogador:\n ");
                altura = ler.nextFloat();
            }
        }
    }
}
