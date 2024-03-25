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
public class exe_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int gremio, inter, empate ;
        System.out.println("Informe os gols do Grêmio ");
        gremio = ler.nextInt();
        System.out.println("Informe os gols do Inter");
        inter = ler.nextInt();
        
        if(gremio == inter){
            System.out.println("EMPATE");
        }else if (gremio > inter){
            System.out.println("O Gremio ganhou");
        }else{
            System.out.println("O Inter ganhou");
        
        }
        
    }
}
