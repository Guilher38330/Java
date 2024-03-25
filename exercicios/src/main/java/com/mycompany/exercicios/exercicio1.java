package com.mycompany.exercicios;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String frase;
        char caracter;
        int vogais=0, numeros=0;
        
        System.out.println("Digite uma frase: ");
        frase = leia.nextLine();
        for(int i = 0; i<frase.length(); i++) {
            caracter = frase.charAt(i);
            if(caracter=='a'||caracter=='e'||caracter=='i'||caracter=='o'||caracter=='u') {
                vogais++;
            }
            else if(caracter=='1'||caracter=='2'||caracter=='3'||caracter=='4'||caracter=='5'||caracter=='6'||caracter=='7'||caracter=='8'||caracter=='9'||caracter=='0') {                
                numeros++;
            }
        }
        System.out.println("Numero de caracteres: "+frase.length());
        System.out.println("Com todas em maiuscula: "+frase.toUpperCase());
        System.out.println("Numero de vogais: "+vogais);
        System.out.println("Numero de numeros: "+numeros);
    }
}
