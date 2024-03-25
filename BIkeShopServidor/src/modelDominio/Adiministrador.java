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
public class Adiministrador extends Usuario implements Serializable {

    private static final long serialVersionUID = 123456789L;

    public Adiministrador(int codUsuario, String nomeUsuario, String nome, String senha, String email) {
        super(codUsuario, nomeUsuario, nome, senha, email);
    }

    public Adiministrador(String nomeUsuario, String nome, String senha, String email) {
        super(nomeUsuario, nome, senha, email);
    }

    public Adiministrador(int codUsuario) {
        super(codUsuario);
    }

    public Adiministrador(String nome, String senha) {
        super(nome, senha);
    }

    @Override
    public String toString() {
        return super.toString() + "Adiministrador{" + '}';
    }
    
}
