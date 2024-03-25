/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_3;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;
public class exe_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int senha = 0;
        System.out.println("Digite uma senha: ");
        senha = ler.nextInt();
        
        if(senha == 1234){
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("ACESSO NEGADO \n Digite outra senha:");
            senha = ler.nextInt();
        }             
    }
}
