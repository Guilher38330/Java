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

public class exe_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Informe um numero: ");
            numero = entrada.nextInt();
            if (numero > 0) {
                System.out.println("POSITIVO");
            } else if (numero < 0) {
                System.out.println("NEGATIVO");
            }
        } while (numero != 0);
    }
}
