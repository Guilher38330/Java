/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.TrataClienteController;
import factory.Conector;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Guilherme
 */
public class Principal {

    public static void main(String[] args) {
        try {
            //testando conexao com o banco de dados
            if(Conector.getConnection() != null){
                System.out.println("Conectado com sucesso no banco");
            }
            
            // iniciando o servidor socket
            ServerSocket servidor = new ServerSocket(12345);
            System.out.println("Servidor inicializado! Aguardando conexoes");
            int idUnico = 0; // variavel que conta os clientes conectados
            while (true) {
                // looping para receber multiplas conexoes
                Socket cliente = servidor.accept();
                System.out.println("Um novo cliente se conectou: " + cliente);
                idUnico++;
                System.out.println("Iniciando um nova thread para o cliente: " + idUnico);
                TrataClienteController trataCliente = new TrataClienteController(cliente, idUnico);
                trataCliente.start();
            }

        } catch (IOException e) {
            // imprime toda a pilha de erro, todo erro que aconteceu
            e.printStackTrace();
        }
    }
}
