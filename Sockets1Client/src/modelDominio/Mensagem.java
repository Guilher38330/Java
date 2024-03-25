/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDominio;

import java.io.Serializable;

// A classe precisa ser implementada como Serializable para que possa ser enviada por Sockets
public class Mensagem implements Serializable{
    private static final long serialVersionUID = 123456789L; 
    
    private final String text;

    public Mensagem(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}