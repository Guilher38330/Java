/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_4;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;
public class exe_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano;
        
        System.out.println("Informe o ano: ");
        ano = ler.nextInt();
        
        if(ano % 4 == 0 || ano % 400 == 0 || ano % 100 == 0){
            System.out.println("O ano "+ ano +" e bissexto");
        }else{
            System.out.println("O ano "+ ano +" nao e bissexto");
        }
    }
}
