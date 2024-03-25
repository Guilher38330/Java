package com.mycompany.exercicios;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String frase;
        char caracter, caracterAntes, caracterDepois;
        
        System.out.println("Digite a frase: ");
        frase = leia.nextLine();
        
        for(int i = 0; i<frase.length(); i++) {
            caracter = frase.charAt(i);
            caracterAntes = frase.charAt(i-1);
            caracterDepois = frase.charAt(i+1);
            if(caracterAntes != ' ' && caracter==' '&&caracterDepois!=' ') {
            } else {
                frase.charAt(i);
            }
        }    
    }
}
