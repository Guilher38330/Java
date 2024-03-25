/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revisao;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;
public class exe_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Double tempoGastoNaViagem;
        Double velocidadeMedia;
        Double distancia;
        Double litros_usados;
 
        System.out.println("Informe o tempo gasto na viagem ");
        tempoGastoNaViagem = ler.nextDouble();
 
        System.out.println("Informe oa velocidade média");
        velocidadeMedia = ler.nextDouble();
 
        distancia = tempoGastoNaViagem * velocidadeMedia;
 
        litros_usados = (distancia / 12);
 
        System.out.println("A distância percorrida é: " + distancia);
        System.out.println("A quantidade de litros utilizados é: " + litros_usados);
    }
    }
}
}