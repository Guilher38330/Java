/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.ConexaoController;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Guilherme
 */
public class Principal {
    public static ConexaoController ccont;
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            
            ccont = new ConexaoController(in, out);
            
            TelaLogin telalogin = new TelaLogin();
            telalogin.setVisible(true);
            
            //criar objeto de classe que controla a conexao com o servidor envia comandos e recebe respostas
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
