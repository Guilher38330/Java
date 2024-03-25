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
public class exe_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char sexo;
        int idade;
        System.out.println("Informe o sexo (M/F):");
        sexo = ler.next().charAt(0);
        System.out.println("Informe a idade:");
        idade = ler.nextInt();
        if((idade < 25) && ((sexo == 'F') || (sexo == 'f'))){
            System.out.println("Aceito");
        }else{
            System.out.println("NÃOOOO aceito");
        }
    }
}
