/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelDominio;

/**
 *
 * @author Guilherme
 */
public class Bebida extends Produto{
    
    private int tipoBebida;
    private String embalagen;

    public Bebida(int tipoBebida, String embalagen, String nome, int quantidade, float preco) {
        super(nome, quantidade, preco);
        this.tipoBebida = tipoBebida;
        this.embalagen = embalagen;
    }

    public String getEmbalagen() {
        return embalagen;
    }

    public void setEmbalagen(String embalagen) {
        this.embalagen = embalagen;
    }

    public int getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(int tipoBebida) {
        this.tipoBebida = tipoBebida;
    }
    
    
}
