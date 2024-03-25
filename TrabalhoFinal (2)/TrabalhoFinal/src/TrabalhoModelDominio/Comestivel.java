
package TrabalhoModelDominio;

import trabalhofinal.*;

/**
 *
 * @author vitie
 */
public class Comestivel extends Produto{
    
    private int tipoComestivel;

    public Comestivel(int tipoComestivel, String Nome, int Quantidade, Float preco) {
        super(Nome, Quantidade, preco);
        this.tipoComestivel = tipoComestivel;
    }

   

    public int getTipoComestivel() {
        return tipoComestivel;
    }

    public void setTipoComestivel(int tipoComestivel) {
        this.tipoComestivel = tipoComestivel;
    }
    
}
