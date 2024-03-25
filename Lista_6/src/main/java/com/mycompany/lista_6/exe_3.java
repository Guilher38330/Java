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
public class exe_3 {
        public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, numero, par, impar;
        System.out.println("Digite um numero: ");
        numero = ler.nextInt();
        for(x = 0; x < 10; x++){
            System.out.println("digite um numero:");
            numero = ler.nextInt();
        }if(numero % 2 == 1){
            System.out.println("Impar\n");
        }else{
            System.out.println("Par\n");
        }
    }
}
