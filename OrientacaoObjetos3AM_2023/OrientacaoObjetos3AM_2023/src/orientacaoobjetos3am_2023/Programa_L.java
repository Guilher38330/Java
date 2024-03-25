/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orientacaoobjetos3am_2023;

/**
 *
 * @author aluno
 */
import java.util.Scanner;
public class Programa_L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Lampada lampada_1 = new Lampada();
        System.out.println("Informe a cor da lampada: ");
        String cor = entrada.nextLine();
        System.out.println("Informe o modelo da lampada: ");
        String modelo = entrada.nextLine();
        System.out.println("Informe a potencia da lampada: ");
        float potencia = entrada.nextFloat();
        System.out.println("Informe o estado da lampada: ");
        int estado = entrada.nextInt();
        Lampada lampada_1 = new Lampada(cor, modelo, potencia, estado);
        
        System.out.println("lampada_1 -> Cor: " + lampada_1.cor + ", modelo: " + lampada_1.modelo + ", velocidade: " + lampada_1.potencia + ", capacidade: " + lampada_1.estado);
        lampada_1.Liga();
        lampada_1.Desliga();
        
    }
    
}
