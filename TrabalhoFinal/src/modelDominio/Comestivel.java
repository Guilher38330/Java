/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

/**
 *
 * @author Guilherme
 */
public class Comestivel extends Produto{
    private int tipoConsumivel;

    public Comestivel(int tipoConsumivel, String Nome, int quantidade, float preco) {
        super(Nome, quantidade, preco);
        this.tipoConsumivel = tipoConsumivel;
    }

    
    

    public int getTipoConsumivel() {
        return tipoConsumivel;
    }

    public void setTipoConsumivel(int tipoConsumivel) {
        this.tipoConsumivel = tipoConsumivel;
    }
    
}
