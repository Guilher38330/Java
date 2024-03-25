/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacaoobjetos3am_2023;

import java.util.Scanner;

/**
 *
 * @author lorenzi
 */
public class ProgramaLampada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // solicitando as informações da lâmpada        
        System.out.println("Informe a cor da lâmpada: ");
        String cor = entrada.nextLine();
        System.out.println("Informe o modelo da lâmpada: ");
        String modelo = entrada.nextLine();
        System.out.println("Informe a potência da lâmpada: ");
        float potencia = entrada.nextFloat();
        // criando o objeto da classe lâmpada
        Lampada minhaLampada = new Lampada(cor, modelo, potencia);
        
                
        System.out.println("DESEJA: 1 - Ligar, 2 - Desligar");
        int resposta = entrada.nextInt();
        if (resposta == 1) {
            minhaLampada.ligar();
        } else if (resposta == 2) {
            minhaLampada.desligar();
        }
    }
}
