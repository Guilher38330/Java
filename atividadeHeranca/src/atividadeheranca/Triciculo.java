/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeheranca;

/**
 *
 * @author Guilherme
 */
public class Triciculo extends Moto{


    public Triciculo(String marca, String modelo) {
        super(3, marca, modelo);
    }
    
    @Override
    public  void liga(){
        super.liga();
        System.out.println("Esse é um triciculo");
    }
    @Override
    public  void desliga(){
        super.desliga();
    }
    
}
