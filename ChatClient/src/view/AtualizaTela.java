/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.SwingUtilities;

/**
 *
 * @author herrmann
 */
public class AtualizaTela extends Thread{

    private ObjectInputStream in;

    public AtualizaTela(ObjectInputStream in) {
        this.in = in;
    }
    
    public void run() {
        
      String msg;
        try {
            msg = (String)in.readObject();
            while(true){
                updateProgress(msg);
                msg = (String)in.readObject();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }   
        
    }
    
        private void updateProgress(String msg) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FormMensagens.jTextArea1.append(msg);
            }
        });
    }

}
