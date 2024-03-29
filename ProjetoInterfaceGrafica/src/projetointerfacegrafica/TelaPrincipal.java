/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetointerfacegrafica;

import java.util.LinkedList;
import modelDominio.Cliente;
import modelDominio.ContaBancaria;

/**
 *
 * @author Guilherme
 */
public class TelaPrincipal extends javax.swing.JFrame {
    LinkedList<ContaBancaria> listaContaBancaria;
    //declarando a lista de clientes
    LinkedList<Cliente> listaCliente;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        //intanciando a lista de compras
        this.listaContaBancaria = new LinkedList<>();
        this.listaCliente = new LinkedList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLTitulo = new javax.swing.JLabel();
        jBSaqueDeposito = new javax.swing.JButton();
        jBCadrastroConta1 = new javax.swing.JButton();
        jBCadrastroCliente = new javax.swing.JButton();
        JBVisualizarContas1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        JLTitulo.setText("Deseja: ");

        jBSaqueDeposito.setText("Efetuar Saque/ Depósito");
        jBSaqueDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaqueDepositoActionPerformed(evt);
            }
        });

        jBCadrastroConta1.setText("Cadrastrar Conta");
        jBCadrastroConta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadrastroConta1ActionPerformed(evt);
            }
        });

        jBCadrastroCliente.setText("Cadrastar Cliente");
        jBCadrastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadrastroClienteActionPerformed(evt);
            }
        });

        JBVisualizarContas1.setText("Visualizar Contas");
        JBVisualizarContas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVisualizarContas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JLTitulo)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jBCadrastroConta1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jBSaqueDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jBCadrastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBVisualizarContas1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(JLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCadrastroConta1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSaqueDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JBVisualizarContas1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCadrastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadrastroConta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadrastroConta1ActionPerformed
        // TODO add your handling code here:
        TelaCadrastroConta telaCadrastroConta = new TelaCadrastroConta(this.listaCliente, this.listaContaBancaria);
        telaCadrastroConta.setVisible(true);
    }//GEN-LAST:event_jBCadrastroConta1ActionPerformed

    private void jBSaqueDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaqueDepositoActionPerformed
        // TODO add your handling code here:
        TelaSaqueDeposito telaSaqueDeposito = new TelaSaqueDeposito(this.listaContaBancaria);
        telaSaqueDeposito.setVisible(true);
    }//GEN-LAST:event_jBSaqueDepositoActionPerformed

    private void jBCadrastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadrastroClienteActionPerformed
        // TODO add your handling code here:
        TelaCadrastroCliente telaCadrastroCliente = new TelaCadrastroCliente(this.listaCliente);
        telaCadrastroCliente.setVisible(true);
        
        
        TelaVisualizacaoContas2 telaVisualizacaoContas = new TelaVisualizacaoContas2(this.listaContaBancaria);
        telaVisualizacaoContas.setVisible(true);
    }//GEN-LAST:event_jBCadrastroClienteActionPerformed

    private void JBVisualizarContas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVisualizarContas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBVisualizarContas1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBVisualizarContas1;
    private javax.swing.JLabel JLTitulo;
    private javax.swing.JButton jBCadrastroCliente;
    private javax.swing.JButton jBCadrastroConta1;
    private javax.swing.JButton jBSaqueDeposito;
    // End of variables declaration//GEN-END:variables
}
