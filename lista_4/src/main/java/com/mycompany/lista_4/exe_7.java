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

public class exe_7 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int kcal = 0, prato, sobremesa, bebida;
            System.out.println("------ MENU ------");
            System.out.println("PRATO\n1 - Vegetariano 180 cal\n2 - Peixe 230 cal\n3 - Frango 250 cal\n4 - Carne 350 cal\n");
            prato = ler.nextInt();
            switch (prato) {
                case 1:
                    kcal = 180;
                    break;
                case 2:
                    kcal = 230;
                    break;
                case 3:
                    kcal = 250;
                    break;
                case 4:
                    kcal = 350;
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA!!!");

            }
            System.out.println("------------------");
            System.out.println("\nSOBREMESA\n1 - Abacaxi 75 cal\n2- Sorvete diet 110 cal\n3 - Mousse diet 170 cal\n4 - Mousse chocolate 200 cal\n");
            sobremesa = ler.nextInt();
            switch (sobremesa) {
                case 1:
                    kcal = kcal + 75;
                    break;
                case 2:
                    kcal = kcal + 110;
                    break;
                case 3:
                    kcal = kcal + 170;
                    break;
                case 4:
                    kcal = kcal  + 200;
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA!!!");
            }
            System.out.println("------------------");
            System.out.println("\nBEBIDA\n1 - Chá 20 cal\n2 - Suco de laranja 70 cal\n3 - Suco de melão 100 cal\n4 - Refrigerante diet 65 cal");
            bebida = ler.nextInt();
            switch (bebida) {
                case 1:
                    kcal = kcal + 20;
                    break;
                case 2:
                    kcal = kcal + 70;
                    break;
                case 3:
                    kcal = kcal + 100;
                    break;
                case 4:
                    kcal = kcal + 65;
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA!!!");
            }
   
            System.out.println("O total de calorias e: " +kcal);
        
    }
}
