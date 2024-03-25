/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cantina;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelDominio.Produto;
import modelDominio.Venda;

/**
 *
 * @author Guilherme
 */
public class TelaCadastroDEVendas extends javax.swing.JFrame {
LinkedList<Produto> listaProduto;
        LinkedList<Venda> listaVenda;
    /**
     * Creates new form TelaCadastroDEVendas
     */
    public TelaCadastroDEVendas(LinkedList<Produto> listaProduto,
        LinkedList<Venda> listaVenda) {
        this.listaProduto = listaProduto;
        this.listaVenda = listaVenda;
        
        initComponents();
    }

    public void  CarregaCombo(){
           
            for(int i =0; i<this.listaProduto.size(); i++){
                jCBProduto.addItem("<< Selecionar >>");
                Produto meuProduto = this.listaProduto.get(i);
                jCBProduto.addItem(meuProduto.getNome());
                
            }
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNomeCliente = new javax.swing.JLabel();
        jTFNomeCliente = new javax.swing.JTextField();
        jLDataVenda = new javax.swing.JLabel();
        jTFDataVenda = new javax.swing.JTextField();
        jLProduto = new javax.swing.JLabel();
        jCBProduto = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLNomeCliente.setText("Nome Cliente");

        jLDataVenda.setText("Data Venda");

        jLProduto.setText("Produto");

        jCBProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProdutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Quantidade");

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNomeCliente)
                            .addComponent(jLDataVenda)
                            .addComponent(jLProduto)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNomeCliente)
                            .addComponent(jTFDataVenda)
                            .addComponent(jCBProduto, 0, 165, Short.MAX_VALUE)
                            .addComponent(jTFQuantidade)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNomeCliente)
                    .addComponent(jTFNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDataVenda)
                    .addComponent(jTFDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLProduto)
                    .addComponent(jCBProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCBProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBProdutoActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:
         if(!jTFNomeCliente.getText().equals("")){
            if(!jTFDataVenda.getText().equals("")){
                if(!jTFQuantidade.getText().equals("")){
                    if(jCBProduto.getSelectedIndex()!=0){
                        String nomeCliente = (jTFNomeCliente.getText());
                        String dataVenda=(jTFDataVenda.getText());
                        int quantidade =Integer.parseInt (jTFQuantidade.getText());
                        int posicao= jCBProduto.getSelectedIndex();
                        Produto produto = this.listaProduto.get(posicao-1);

                        if(quantidade < produto.getQuantidade()){

                            Venda minhasVendas = new Venda (nomeCliente, dataVenda, quantidade, produto);
                            this.listaVenda.add(minhasVendas);

                            JOptionPane.showMessageDialog(rootPane, " Sua venda foi efetuada!");
                            LimpaCampos();

                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Erro: a quantidade não disponível!");

                        }

                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Erro: informe a quantidade!");

                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Erro: informe o produto!");

                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro: informe a data da venda!");

            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro: informe o seu nome!");

        }
         
       
         
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        LimpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    
       public void LimpaCampos(){
        jTFNomeCliente.setText("");
        jTFDataVenda.setText("");
        jTFQuantidade.setText("");
        jCBProduto.setSelectedIndex(0);
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCBProduto;
    private javax.swing.JLabel jLDataVenda;
    private javax.swing.JLabel jLNomeCliente;
    private javax.swing.JLabel jLProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTFDataVenda;
    private javax.swing.JTextField jTFNomeCliente;
    private javax.swing.JTextField jTFQuantidade;
    // End of variables declaration//GEN-END:variables
}
