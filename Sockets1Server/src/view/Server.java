/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import modelDominio.Mensagem;

public class Server {

    public static void main(String[] args) {

        try {
            // Informa em qual porta irá rodar o servidor. É nessa porta que o 
            // servidor esperará as conexões oriundas dos clientes
            ServerSocket ss = new ServerSocket(12345);
            System.out.println("Servidor esperando conexões...");
            Socket socket = ss.accept(); // Programa fica parado aqui até receber uma conexão na porta 7777
            System.out.println("Conexão de " + socket + "!");

            // Criando um objeto de streaming para receber os dados
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

            // Lendo mensagens do socket
            List<Mensagem> listaMensagens = (List<Mensagem>) in.readObject();
            System.out.println("Recebido [" + listaMensagens.size() + "] mensagens de: " + socket);
            // Printando todas as mensagens
            System.out.println("Todas as mensagens:");
            
            // posso utilizar foreach
            //listaMensagens.forEach((msg) -> System.out.println(msg.getText()));
            
            // ou um for para percorrer as mensagens
            for (int i = 0; i < listaMensagens.size(); i++) {
                System.out.println(listaMensagens.get(i).getText());
            }
            
            out.writeObject("Meu querido cliente. Eu recebi sua mensagen");
            

            System.out.println("Fechando sockets.");
            ss.close();
            socket.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
