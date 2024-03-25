/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2repeticao;

/**
 *
 * @author aluno
 */
import java.util.*;

public class exe_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, cont = 0;
        do {
            System.out.println("Informe um numero: ");
            numero = ler.nextInt();
            if (numero >= 100 || numero <= 200) {
                //cont = cont +1
                cont++;
            }
        } while (numero != 0);
        System.out.println("QTD no intervalo de 100 a 200 = " + cont);
    }
}
