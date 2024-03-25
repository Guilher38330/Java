/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2repeticao;

/**
 *
 * @author Guilherme
 */
import java.util.*;
public class exe_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int senha = 0;
        System.out.println("Informe a senha: ");
        senha = ler.nextInt();
        while(senha != 2021){
        System.out.println("SENHA INVALIDA");
        System.out.println("Informe a senha");
        senha = ler.nextInt();
        }
        if(senha == 2021){
            System.out.println("ACESSO PERMITIDO A INF 2 EHHH LEGAL!!!");
        }
    }
}
