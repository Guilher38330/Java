/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_6;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;
public class exe_5 {
    public static void main(String[] args) {
        
    }
        int numeroTotalMercadoria;
        Double valorMercadoria;
        Double valorTotalEmEstoque = 0.0;
        Double mediaValorMercadoria = 0.0;
        int soma = 0;
 
        System.out.println("Informe o número total de mercadorias no estoque");
        numeroTotalMercadoria = ler.nextInt();
 
        for (int i = 1; i == numeroTotalMercadoria; i++) {
            System.out.println("Informe o valor de cada mercadoria");
            valorMercadoria = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de cada mercadoria"));
 
            soma = soma + i;
            valorTotalEmEstoque = numeroTotalMercadoria * valorMercadoria;
            mediaValorMercadoria = valorTotalEmEstoque / soma;
 
        }
 
        System.out.println("O valor total em estoque é de:" + valorTotalEmEstoque);
        System.out.println("A média de valor da mercadoria é de:" + mediaValorMercadoria);
    }
}
