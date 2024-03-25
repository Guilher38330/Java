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
//utilizamos serializable para permitir que os objetos da classe sejam transmitidos pela internet
public class Usuario implements Serializable{
    //atributo necessario por causa do serializeble
    private static final long serialVersionUID = 123456789L;
    
    private int codUsuario;
    private String nomeUsuario;
    private String nome;
    private String senha;
    private String email;
    
    // iremos declarar 4 construtores
    // construtor com todos os campos para ser usado no SELECT
    public Usuario(int codUsuario, String nomeUsuario, String nome, String senha, String email) {
        this.codUsuario = codUsuario;
        this.nomeUsuario = nomeUsuario;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    // construtor sem o codigo pois sera usado para fazer INSERT no banco
    public Usuario(String nomeUsuario, String nome, String senha, String email) {
        this.nomeUsuario = nomeUsuario;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }
    
    // construtor usado para fazer DELETE no banco
    public Usuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    // construtor sera usado para fazer login no sistema
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "codUsuario=" + codUsuario + ", nomeUsuario=" + nomeUsuario + ", nome=" + nome + ", senha=" + senha + ", email=" + email + '}';
    }
    
    
    
    
}
