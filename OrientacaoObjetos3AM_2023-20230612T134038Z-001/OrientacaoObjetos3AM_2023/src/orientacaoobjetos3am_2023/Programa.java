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
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        //Carro meuCarro = new Carro();
        System.out.println("Informe a cor do carro: ");
        String cor = entrada.nextLine();
        System.out.println("Informe o modelo do carro: ");
        String modelo = entrada.nextLine();
        System.out.println("Informe a velocidade do carro: ");
        float velocidade = entrada.nextFloat();
        System.out.println("Informe a capacidade do carro: ");
        int capacidade = entrada.nextInt();
        Carro meuCarro = new Carro(cor, modelo, velocidade, capacidade);
        
       // Carro meuCarro2 = new Carro();
        System.out.println("Informe a cor do segundo carro: ");
        cor = entrada.nextLine();
        cor = entrada.nextLine();
        System.out.println("Informe o modelo do segundo carro: ");
        modelo = entrada.nextLine();
        System.out.println("Informe a velocidade do segundo carro: ");
        velocidade = entrada.nextFloat();
        System.out.println("Informe a capacidade do segundo carro: ");
        capacidade = entrada.nextInt();
        Carro meuCarro2 = new Carro(cor,modelo,velocidade,capacidade);
        
        System.out.println("Carro 1 -> Cor: " + meuCarro.getCor() + ", modelo: " + meuCarro.getModelo() + ", velocidade: " + meuCarro.getVelocidade() + ", capacidade: " + meuCarro.getCapacidade());
        meuCarro.liga();
        System.out.println("Deseja acelerar o primeiro carro em quantas vezes: ");
        int quantidade = entrada.nextInt();
        meuCarro.acelera(quantidade);
        meuCarro.desliga();
        System.out.println("Velocidade após a aceleração: " + meuCarro.getVelocidade());
        
        System.out.println("Carro 2 -> Cor: " + meuCarro2.getCor() + ", modelo: " + meuCarro2.getModelo() + ", velocidade: " + meuCarro2.getVelocidade() + ", capacidade: " + meuCarro2.getCapacidade());
        meuCarro2.liga();
        System.out.println("Deseja acelerar o segundo carro em quantas vezes: ");
        quantidade = entrada.nextInt();
        meuCarro2.acelera(quantidade);
        meuCarro2.desliga();
        System.out.println("Velocidade após a aceleração: " + meuCarro2.getVelocidade());
    }
    
}
