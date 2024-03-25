/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Guilherme
 */
import java.util.*;
public class exe_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String s;
        Integer count = 0, Spacecont = 0, sem_espaco = 0;
        for(int a = 0; a < 2; a++){
            Spacecont = 0;
            sem_espaco = 0;
            System.out.println("----------------------------------");
            System.out.println("Gigite a "+(a + 1)+ "º String que quer informar: ");
            s = ler.nextLine();
            count = s.length();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == ' '){
                    Spacecont++;
                }
            }
            sem_espaco = count - Spacecont;
            System.out.println("----------------------------------");
            System.out.println("Essa palavra possui: "+count+"caracteres");
            System.out.println("Essa palavra possui "+Spacecont+" espacos");
            System.out.println("Essa palavra possui "+sem_espaco+" sem espaco");
        }
    }
}
