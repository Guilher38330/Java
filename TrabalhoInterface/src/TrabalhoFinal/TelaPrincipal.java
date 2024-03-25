/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TrabalhoFinal;

import ModelDominio.Produto;
import ModelDominio.Venda;
import java.util.LinkedList;

/**
 *
 * @author Guilherme
 */
public class TelaPrincipal extends javax.swing.JFrame {
    LinkedList<Produto> listaProduto;
    LinkedList<Venda> listaVenda;
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        
        this.listaProduto =new LinkedList<>();
        this.listaVenda =new LinkedList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLDeseja = new javax.swing.JLabel();
        jBCadastroProduto = new javax.swing.JButton();
        jBCadastroVenda = new javax.swing.JButton();
        jBVisualizacaoVendas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setBackground(new java.awt.Color(204, 255, 204));

        jLDeseja.setText("Deseja:");

        jBCadastroProduto.setBackground(new java.awt.Color(51, 0, 153));
        jBCadastroProduto.setForeground(new java.awt.Color(255, 255, 255));
        jBCadastroProduto.setText("Cadastrar Produto");
        jBCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroProdutoActionPerformed(evt);
            }
        });

        jBCadastroVenda.setBackground(new java.awt.Color(51, 0, 153));
        jBCadastroVenda.setForeground(new java.awt.Color(255, 255, 255));
        jBCadastroVenda.setText("Cadastrar Venda");
        jBCadastroVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastroVendaActionPerformed(evt);
            }
        });

        jBVisualizacaoVendas.setBackground(new java.awt.Color(51, 0, 153));
        jBVisualizacaoVendas.setForeground(new java.awt.Color(255, 255, 255));
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
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVisualizacaoVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCadastroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLDeseja, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLDeseja)
                .addGap(33, 33, 33)
                .addComponent(jBCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBCadastroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBVisualizacaoVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroProdutoActionPerformed
        // TODO add your handling code here:
        
        TelaCadastroProduto cadastroProduto = new TelaCadastroProduto(this.listaProduto);
        cadastroProduto.setVisible(true);
    }//GEN-LAST:event_jBCadastroProdutoActionPerformed

    private void jBCadastroVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastroVendaActionPerformed
        // TODO add your handling code here:
        
        TelaCadastroVenda cadastroVenda = new TelaCadastroVenda(this.listaProduto, this.listaVenda);
        cadastroVenda.setVisible(true);
    }//GEN-LAST:event_jBCadastroVendaActionPerformed

    private void jBVisualizacaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizacaoVendasActionPerformed
        // TODO add your handling code here:
        
        TelaVisualizacaoVenda visualizacaoVenda = new TelaVisualizacaoVenda(this.listaProduto, this.listaVenda);
        visualizacaoVenda.setVisible(true);
        
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
    private javax.swing.JButton jBCadastroProduto;
    private javax.swing.JButton jBCadastroVenda;
    private javax.swing.JButton jBVisualizacaoVendas;
    private javax.swing.JLabel jLDeseja;
    // End of variables declaration//GEN-END:variables
}