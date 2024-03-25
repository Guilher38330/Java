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
public class Comum extends Usuario implements Serializable {

    private static final long serialVersionUID = 123456789L;

    public Comum(int codUsuario, String nomeUsuario, String nome, String senha, String email) {
        super(codUsuario, nomeUsuario, nome, senha, email);
    }

    public Comum(String nomeUsuario, String nome, String senha, String email) {
        super(nomeUsuario, nome, senha, email);
    }

    public Comum(int codUsuario) {
        super(codUsuario);
    }

    public Comum(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public String toString() {
        return super.toString() + "Comum{" + '}';
    }
    
}
