/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Guilherme
 */
import java.util.*;

public class exe_1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int cont = 0;
        String f;
        char letra;

        System.out.println("Escreva uma frase: ");
        f = ler.nextLine();

        for (int i = 0; i < f.length(); i++) {
            letra = f.charAt(i);
            if (letra != ' ') {
                cont++;
            }
        }
        System.out.println("Numero de letras: " + cont);
    }
}
