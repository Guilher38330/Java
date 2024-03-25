/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2repeticao;

/**
 *
 * @author Guilherme
 */
import java.util.*;
public class exe_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        char fim, op;
        float n1, n2, resp = 0;
        do{
            System.out.println("Escolha uma das operações matemática: ");
            System.out.println("Digite + para SOMA: ");
            System.out.println("Digite - para SUBTRAÇÃO: ");
            System.out.println("Digite * para MULTIPLICAÇÃO: ");
            System.out.println("Digite / para DIVISÃO: ");
            op = ler.next().charAt(0);
            System.out.println("Digite o N1: ");
            n1 = ler.nextFloat();
            System.out.println("Digite o N2: ");
            n2 = ler.nextFloat();
            if(op == '+'){
                resp = n1 + n2;
            }else if(op == '-'){
                resp = n1 - n2;
            }else if(op == '*'){
                resp = n1 * n2;
            }else{
                resp = n1 / n2;  
            }
            System.out.println("A resposta é: "+resp);
            System.out.println("Deseja continuar: ");
            fim = ler.next().charAt(0);        
        }while(fim == 's' || fim == 'S');  
    }
}
