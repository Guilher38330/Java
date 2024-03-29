/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalhofinal;

import TrabalhoModelDominio.Produto;
import TrabalhoModelDominio.Vendas;
import java.util.LinkedList;

/**
 *
 * @author vitie
 */
public class TelaPrincipal extends javax.swing.JFrame {
        //lista de contas
         LinkedList<Produto> listaProdutos;
         //lista de clientes
         LinkedList<Vendas > listaVendas;
        
    public TelaPrincipal() {
        initComponents();
        
        //instanciando a lista de contas
        this.listaProdutos =new LinkedList<>();
        this.listaVendas =new LinkedList<>();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jBCadastroProdutos = new javax.swing.JButton();
        jLDeseja = new javax.swing.JLabel();
        jBCadastrodeVendas = new javax.swing.JButton();
        jBVisualizacaoVendas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBCadastroProdutos.setText("Cadastro de Produtos");
        jBCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroProdutosActionPerformed(evt);
            }
        });

        jLDeseja.setText("Deseja:");

        jBCadastrodeVendas.setText("Cadastro de Vendas");
        jBCadastrodeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrodeVendasActionPerformed(evt);
            }
        });

        jBVisualizacaoVendas.setText("Visualização de Vendas");
        jBVisualizacaoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisualizacaoVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBCadastrodeVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCadastroProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBVisualizacaoVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLDeseja)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLDeseja)
                .addGap(30, 30, 30)
                .addComponent(jBCadastroProdutos)
                .addGap(45, 45, 45)
                .addComponent(jBCadastrodeVendas)
                .addGap(41, 41, 41)
                .addComponent(jBVisualizacaoVendas)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroProdutosActionPerformed
        // TODO add your handling code here:
        CadastroDeProdutos cadastroDeProdutos = new CadastroDeProdutos(this.listaProdutos);
        cadastroDeProdutos.setVisible(true);
    }//GEN-LAST:event_jBCadastroProdutosActionPerformed

    private void jBCadastrodeVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrodeVendasActionPerformed
        // TODO add your handling code here:
        cadastrodevendas cadastrodevendas = new cadastrodevendas(this.listaProdutos, this.listaVendas);
        cadastrodevendas.setVisible(true);
    }//GEN-LAST:event_jBCadastrodeVendasActionPerformed

    private void jBVisualizacaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizacaoVendasActionPerformed
        // TODO add your handling code here:
        VisualizacaoDeVendas visualizacaoDeVendas = new VisualizacaoDeVendas(this.listaVendas, this.listaProdutos);
        visualizacaoDeVendas.setVisible(true);
    }//GEN-LAST:event_jBVisualizacaoVendasActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCadastroProdutos;
    private javax.swing.JButton jBCadastrodeVendas;
    private javax.swing.JButton jBVisualizacaoVendas;
    private javax.swing.JLabel jLDeseja;
    // End of variables declaration//GEN-END:variables
}
