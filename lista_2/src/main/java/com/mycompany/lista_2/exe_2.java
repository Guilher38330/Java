/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_2;

/**
 *
 * @author Guilherme
 */
import java.util.Scanner;

public class exe_2 {
       public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n1, n2, media;
        System.out.println("Digite o primeiro número: ");
        n1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scan.nextInt();
        media = (n1 + n2 ) / 2;
        System.out.println("Media: "+media);
    }
}
