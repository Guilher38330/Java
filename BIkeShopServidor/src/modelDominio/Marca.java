/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelDominio;

import java.io.Serializable;

/**
 *
 * @author Guilherme
 */
public class Marca implements Serializable{
    private static final long serialVersionUID = 123456789L;

    private int codMarca;
    private String nommeMarca;

    public Marca(int codMarca, String nommeMarca) {
        this.codMarca = codMarca;
        this.nommeMarca = nommeMarca;
    }

    public Marca(int codMarca) {
        this.codMarca = codMarca;
    }

    public Marca(String nommeMarca) {
        this.nommeMarca = nommeMarca;
    }

    public String getNommeMarca() {
        return nommeMarca;
    }

    public void setNommeMarca(String nommeMarca) {
        this.nommeMarca = nommeMarca;
    }

    public int getCodMarca() {
        return codMarca;
    }

    public void setCodMarca(int codMarca) {
        this.codMarca = codMarca;
    }

    @Override
    public String toString() {
        return "Marca{" + "codMarca=" + codMarca + ", nommeMarca=" + nommeMarca + '}';
    }
    
    
    
}
