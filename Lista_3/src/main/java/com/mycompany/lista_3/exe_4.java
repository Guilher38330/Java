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
public class exe_4 {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);
         char sexo;
         float peso, h;
         System.out.println("Informe altura: ");
         h = ler.nextInt();
         System.out.println("Informe o sexo 1 = F e 2 = M:");
         sexo = ler.next().charAt(0);
         
            if(sexo == 2){
         peso =  (float) ((72.7 * h)-58);
         System.out.println("Seu peso ideal e: "+peso);
        }else{
             
         peso = (float) ((62.1 * h)-44.7);
         System.out.println("Seu peso ideal e: "+peso);
         }
         
    }
}
