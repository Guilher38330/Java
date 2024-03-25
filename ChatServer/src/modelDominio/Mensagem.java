/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDominio;

import java.io.Serializable;

/**
 *
 * @author herrmann
 */
public class Mensagem implements Serializable{
    private static final long serialVersionUID = 123456789L;
    private String apelido;
    private String texto;

    public Mensagem(String apelido, String texto) {
        this.apelido = apelido;
        this.texto = texto;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Mensagem{" + "apelido=" + apelido + ", texto=" + texto + '}';
    }
    
    
    
    
}
