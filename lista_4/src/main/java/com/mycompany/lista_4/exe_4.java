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
public class exe_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float macas, total, valor1, valor2;
        System.out.println("Informe a quantidade de macas:");
        macas = ler.nextFloat();
        
        valor1 = (float) (0.30 * macas);
        valor2 = (float) (0.25 * macas);
        
        if(macas > 12){
            System.out.println("O valor que ira pagar pelas macas sera: "+valor1);
            
        }else{
            System.out.println("O valor que ira pagar pelas macas sera: "+valor2);
        }
    }
}
