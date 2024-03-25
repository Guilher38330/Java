/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modelDominio.Mensagem;

/**
 *
 * @author herrmann
 */
public class TrataCliente extends Thread{
    public static ServerSocket server;
    public static ArrayList<ObjectOutputStream> clientes;
    
    private ObjectInputStream in;
    private ObjectOutputStream out;
    private Socket s;

    // Constructor 
    public TrataCliente(Socket con){
        try{
            this.s = con;
            in = new ObjectInputStream(con.getInputStream());
            out = new ObjectOutputStream(con.getOutputStream());
        }catch(IOException e){
            e.printStackTrace();
        }
    } 
    
    public void run(){
        
        try{
            clientes.add(out);
            Mensagem received = (Mensagem)in.readObject();
            String msg = received.getTexto();
            
            while(!"Sair".equalsIgnoreCase(msg) && msg != null)
            {
                msg = received.getTexto();
                sendToAll(received);
                System.out.println(received);
                // esperando próxima mensagem
                received = (Mensagem)in.readObject();
            }
            System.out.println("Desconectando cliente: "+out);
            s.close();
            clientes.remove(out);
        }catch (Exception e) {
            e.printStackTrace();

        }
    }
        /***
     * Método usado para enviar mensagem para todos os clients
     * @param bwSaida do tipo BufferedWriter
     * @param msg do tipo String
     * @throws IOException
     */
    public void sendToAll(Mensagem received) throws  IOException
    {

        Date date = new Date(); // This object contains the current date value
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        
        for(ObjectOutputStream bw : clientes){
            try{
            //if(!(bw == out)){ // evitando enviar para ele mesmo
                System.out.println("Enviando mensagem para cliente: "+bw);
                bw.writeObject("["+formatter.format(date)+"] "+received.getApelido() + " -> " + received.getTexto()+"\r\n");
            //}
            }catch(SocketException ex){
                System.out.println("ERRO enviando mensagem para cliente: "+bw);
            }
        }
    }
    
    
}
