/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import modelDominio.Mensagem;

public class Client {

    public static void main(String[] args) {
        try{
            // definindo endereço e porta onde o servidor se encontra
            Socket socket = new Socket("localhost", 12345);
            System.out.println("Conectado!");

            // Criando um objeto de streaming de saída para enviar os dados
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            
            // juntando algumas mensagens para enviar
            List<Mensagem> messagens = new ArrayList<>();
            messagens.add(new Mensagem("Alô você aí do outro lado!"));
            messagens.add(new Mensagem("Como você está hoje?"));
            messagens.add(new Mensagem("Que horas são?"));
            messagens.add(new Mensagem("Guilherme"));

            System.out.println("Enviando mensagens para o Servidor Socket");
            out.writeObject(messagens);
            String resposta = (String) in.readObject();
            System.out.println("Resposta do servidor: "+resposta);
            
            System.out.println("Fechando o socket e terminando o programa.");
            socket.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}