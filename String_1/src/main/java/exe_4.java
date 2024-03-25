/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Guilherme
 */
import java.util.*;
public class exe_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String f, fg="";
        
        for(int i = 0; i < 5; i++){
            System.out.println("Escreva sua frase: ");
            f = ler.nextLine();
            if(f.length() > fg.length()){
                fg = f;
            }
        }
        System.out.println("Maior frase: "+fg);
    }
}
