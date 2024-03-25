/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.TrataCliente;
import java.io.BufferedWriter;
import java.lang.invoke.MethodHandles;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author herrmann
 */
public class ChatServer {
    
    public static void main(String []args) {
        try{
            TrataCliente.server = new ServerSocket(12345);
            TrataCliente.clientes = new ArrayList<>();

            while(true){
                System.out.println("Aguardando conexão...");
                Socket con = TrataCliente.server.accept();
                System.out.println("Cliente conectando...");
                Thread t = new TrataCliente(con);
                t.start();
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
