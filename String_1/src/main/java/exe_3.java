/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Guilherme
 */
import java.util.*;
public class exe_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int count = 0;
        char ch;
        String frase;
        System.out.println("Informe um carecter: ");
        ch = ler.next().charAt(0);
        
        for(int i = 0; i < 5; i++){
            count = 0;
            System.out.println("Digite uma frase: ");
            frase = ler.next();
            for(int j = 0; j < frase.length(); j++){
                if(frase.charAt(j) == ch){
                    count++;
                }
            }
            System.out.println("O numero de ocorrencias do caracter "+ch+" aparecer "+count+"vezes.");
        }
        
    }
}
