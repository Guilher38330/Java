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
public class exe_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Informe um numero positeivo ");
        num = ler.nextInt();
        
        if(num % 2 == 1){
            System.out.println("Impar\n");
        }else{
            System.out.println("Par\n");
        }
    }
}
