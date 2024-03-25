/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosherançaclasses_3am_2023;

import java.util.LinkedList;

/**
 *
 * @author lorenzi
 */
public class ExemploPolimorfismo {
    public static void main(String[] args) {
        LinkedList<Veiculo> listaVeiculos = new LinkedList<>();
        
        Veiculo meuVeiculo = new Veiculo("Fiat", "Uno");
        listaVeiculos.add(meuVeiculo);
        
        Carro meuCarro = new Carro(450, "Peugeot", "Peugeot 306");
        listaVeiculos.add(meuCarro);
        
        Moto minhaMoto = new Moto(2, "Honda", "Biz");
        listaVeiculos.add(minhaMoto);
        
        for (int x = 0; x < listaVeiculos.size(); x++) {
            Veiculo meuVeiculo2 = listaVeiculos.get(x);
            System.out.println("Marca: " + meuVeiculo2.getMarca() + ", modelo: " + meuVeiculo2.getModelo());
            if (meuVeiculo2 instanceof Carro) {
                Carro meuCarro2 = (Carro)meuVeiculo2;
                System.out.println("Tamanho do porta malas: " + meuCarro2.getTamanhoPortaMalas());
                //System.out.println("Tamanho do porta malas: " + ((Carro) meuVeiculo2).getTamanhoPortaMalas());
            } else if (meuVeiculo2 instanceof Moto) {
                Moto minhaMoto2 = (Moto)meuVeiculo2;
                System.out.println("Quantidade de rodas: " + minhaMoto2.getQuantidadeRodas());
            }
            
            meuVeiculo2.ligar();
        }
    }
}
