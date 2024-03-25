/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelDominio;

/**
 *
 * @author Guilherme
 */
public class Comestivel extends Produto{
    
    private int tipoComestivel;

    public Comestivel(int tipoComestivel, String nome, int quantidade, float preco) {
        super(nome, quantidade, preco);
        this.tipoComestivel = tipoComestivel;
    }

    public int getTipoComestivel() {
        return tipoComestivel;
    }

    public void setTipoComestivel(int tipoComestivel) {
        this.tipoComestivel = tipoComestivel;
    }
    
    
}
