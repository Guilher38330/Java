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
public class exe_1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextInt();
        if(n1==n2){
            System.out.println(n1+" e igual a "+n2);
        }else if(n1 > n2){
            System.out.println(n1+" e maior que "+n2);
        }else {
            System.out.println(n2+" e maior que "+n1);
        }
    }
}
