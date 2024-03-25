/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista4rep;

/**
 *
 * @author Guilherme
 */
import java.util.*;
public class exe_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont_f = 0, cont_m = 0;
        float altura, menorAlt = 3, maiorAlt = 0, somaAlt = 0, mediaAlt = 0;
        char sexo, sexoMaior = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("Digite a altura: ");
            altura = scan.nextFloat();
            System.out.println("Digite o sexo: ");
            sexo = scan.next().charAt(0);

            if (altura < menorAlt);
            {
                menorAlt = altura;
            }
            if (sexo == 'f' || sexo == 'F')
            {
                somaAlt = somaAlt + altura;
                cont_f++;
            }
            if ((sexo == 'm' || sexo == 'M')){
                cont_m++;
            }
            if (altura > maiorAlt) {
                maiorAlt = altura;
                sexoMaior = sexo;
            }
        }
        mediaAlt = somaAlt / cont_f;
        System.out.println("\nA menor altura do grupo: " + menorAlt);
        System.out.println("\nA media das alturas das mulheres: " + mediaAlt);
        System.out.println("\nNumero de homens: " + cont_m);
        System.out.println("\nSexo da pessoa mais alta: " + sexoMaior);
    }
}
