/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;

public class exe_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int V_Mensal, V_M_Comissao, Comissao = 0;

        System.out.println("Insira o valor mensal: ");
        V_Mensal = ler.nextInt();

        if (V_Mensal >= 100000.00) {
            Comissao = (int) (V_Mensal * 0.15);
            V_M_Comissao = (int) (700.00 + Comissao);
        } else if (V_Mensal < 100000.00 && V_Mensal >= 60000.00) {
            Comissao = (int) (V_Mensal * 0.10);
            V_M_Comissao = (int) (600.00 + Comissao);
        } else if (V_Mensal < 60000.00 && V_Mensal <= 20000.00) {
            Comissao = (int) (V_Mensal * 0.10);
            V_M_Comissao = (int) (500.00 + Comissao);
        } else if (V_Mensal < 20000.00) {
            Comissao = (int) (V_Mensal * 0.05);
            V_M_Comissao = (int) (400.00 + Comissao);
        }
        System.out.println("O valor da venda mensal e:" + V_Mensal);
        System.out.println("A comissao sera de:" + Comissao);
    }
}
