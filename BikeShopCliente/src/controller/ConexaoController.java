/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modelDominio.Usuario;

/**
 *
 * @author Guilherme
 */
public class ConexaoController {

    private ObjectInputStream in;
    private ObjectOutputStream out;

    public ConexaoController(ObjectInputStream in, ObjectOutputStream out) {
        this.in = in;
        this.out = out;
    }

    // aqui teremos zilhoes de metodos que se comunicarao com o servidor
    public Usuario efetuarLogin(Usuario user) {
        try {
            // enviando o comando para o servidor
            out.writeObject("UsuarioEfetuarLogin");
            in.readObject(); // recebendo o ok
            //enviar o usuario que esta tentando fazer o login
            out.writeObject(user);
            Usuario userLogin = (Usuario) in.readObject();
            return userLogin;

        } catch (Exception e) {
            e.printStackTrace();
            //se acontecer um erro retornamos null
            return null;
        }
    }

}
