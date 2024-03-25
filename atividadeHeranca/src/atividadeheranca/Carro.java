/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeheranca;

/**
 *
 * @author Guilherme
 */
public class Carro extends Veiculo{
    private int tamanhoProtaMalas;

    public Carro(int tamanhoProtaMalas, String marca, String modelo) {
        super(marca, modelo);
        this.tamanhoProtaMalas = tamanhoProtaMalas;
    }

    public int getTamanhoProtaMalas() {
        return tamanhoProtaMalas;
    }

    public void setTamanhoProtaMalas(int tamanhoProtaMalas) {
        this.tamanhoProtaMalas = tamanhoProtaMalas;
    }
    
    @Override
    public  void liga(){
        System.out.println("Você ligou o carro");
    }
    @Override
    public  void desliga(){
        System.out.println("Você desligou o carro");
    }
    
}
