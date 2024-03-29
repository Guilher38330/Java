/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cantina;

import java.util.LinkedList;
import modelDominio.Produto;
import modelDominio.Venda;

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
        this.listaProduto = new LinkedList<>();
        this.listaVenda = new LinkedList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBVendas = new javax.swing.JButton();
        jBCadrastroProduto1 = new javax.swing.JButton();
        jBEntradaDoEstoque1 = new javax.swing.JButton();
        jBVisualizacaoVendas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBVendas.setText("Cadastro de Venda");
        jBVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVendasActionPerformed(evt);
            }
        });

        jBCadrastroProduto1.setText("Cadastro de Produto");
        jBCadrastroProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadrastroProduto1ActionPerformed(evt);
            }
        });

        jBEntradaDoEstoque1.setText("Entrada/Retirada de Produtos");
        jBEntradaDoEstoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntradaDoEstoque1ActionPerformed(evt);
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
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVisualizacaoVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBEntradaDoEstoque1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCadrastroProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jBCadrastroProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBEntradaDoEstoque1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBVisualizacaoVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadrastroProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadrastroProduto1ActionPerformed
        // TODO add your handling code here:
        TelaCadastroProduto cadastroProdutos = new TelaCadastroProduto(this.listaProduto);
        cadastroProdutos.setVisible(true);
        
    }//GEN-LAST:event_jBCadrastroProduto1ActionPerformed

    private void jBEntradaDoEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntradaDoEstoque1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBEntradaDoEstoque1ActionPerformed

    private void jBVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVendasActionPerformed
        // TODO add your handling code here:
         TelaCadastroDEVendas cadastroDeVendas = new TelaCadastroDEVendas(this.listaProduto, this.listaVenda);
        cadastroDeVendas.setVisible(true);
    }//GEN-LAST:event_jBVendasActionPerformed

    private void jBVisualizacaoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisualizacaoVendasActionPerformed
        // TODO add your handling code here:
        TelaVisualizacaoVenda visualizacaoVenda = new TelaVisualizacaoVenda(this.listaProduto, this.listaVenda);
        visualizacaoVenda.setVisible(true);
    }//GEN-LAST:event_jBVisualizacaoVendasActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadrastroProduto1;
    private javax.swing.JButton jBEntradaDoEstoque1;
    private javax.swing.JButton jBVendas;
    private javax.swing.JButton jBVisualizacaoVendas;
    // End of variables declaration//GEN-END:variables
}
