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

public class exe_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int valor, taxa, tempo, prestacao;
        System.out.println("Digite o valor: ");
        valor = scan.nextInt();
        System.out.println("Digite a taxa: ");
        taxa = scan.nextInt();
        System.out.println("Digite o tempo: ");
        tempo = scan.nextInt();
        prestacao = valor + (valor * (taxa / 100) * tempo);
        System.out.println("Prestacao = "+prestacao);
    }
}
