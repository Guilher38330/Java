/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 *
 * @author Guilherme
 */
public class TrataClienteController extends Thread {

    private Socket socket; // conexao do cliente
    private ObjectOutputStream out; // objeto out para enviar coisas para o cliente
    private ObjectInputStream in; // objeto in para receber coisas do cliente
    private int idUnico; // idUnico e o numero do cliente

    //contrutor que recebe o socket, o idUnico e criea os objetos da entrada e saida
    public TrataClienteController(Socket socket, int idUnico) {
        this.socket = socket;
        this.idUnico = idUnico;

        try {
            //criando objetos de entrada e saida
            this.in = new ObjectInputStream(this.socket.getInputStream());
            this.out = new ObjectOutputStream(this.socket.getOutputStream());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //metodo run é o metodo que executa dentro da thred. esse metodo ira receber os comandos do 
    // cliente, fazer os devidos tratamentos e entao devolver uma resposta para o cliente
    @Override
    public void run() {

        String comando;
        System.out.println("Esperando comandos do cliente: " + idUnico);

        try {
            comando = (String) in.readObject();
            // enquanto o comando for DIFERENTE de "fim"
            while (!comando.equalsIgnoreCase("fim")) {
                System.out.println("Cliente " + idUnico + " enviou comando: " + comando);
                // daqui em diante iremos tratar todos os comandos em blocos de if/else

                //lendo o proximo comando
                comando = (String) in.readObject();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // fechando conexao com o cliente
        try {
            System.out.println("Cliente " + idUnico + " finalizou a conexao");
            in.close();
            out.close();
            socket.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
