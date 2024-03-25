/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosherançaclasses_3am_2023;

/**
 *
 * @author lorenzi
 */
public class Triciclo extends Moto{

    public Triciclo(String marca, String modelo) {
        super(3, marca, modelo);
    }
    
    @Override
    public void ligar() {
        super.ligar();
        System.out.println("Este é um triciclo.");
    }
}
