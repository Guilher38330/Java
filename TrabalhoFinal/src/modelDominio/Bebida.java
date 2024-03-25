/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

/**
 *
 * @author Guilherme
 */
public class Bebida  extends Produto{
    private int tipoBebida;
    private String embalagem;

    public Bebida(int tipoBebida, String embalagem, String Nome, int quantidade, float preco) {
        super(Nome, quantidade, preco);
        this.tipoBebida = tipoBebida;
        this.embalagem = embalagem;
    }
    

    
    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public int getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(int tipoBebida) {
        this.tipoBebida = tipoBebida;
    }
}
