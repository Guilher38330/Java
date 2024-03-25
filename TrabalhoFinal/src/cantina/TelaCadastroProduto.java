/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cantina;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelDominio.Bebida;
import modelDominio.Comestivel;
import modelDominio.Produto;
import modelDominio.Venda;

/**
 *
 * @author Guilherme
 */
public class TelaCadastroProduto extends javax.swing.JFrame {
    LinkedList<Produto> listaProduto;
    LinkedList<Venda> listaVenda;
    /**
     * Creates new form CadastroProduto
     */
    public TelaCadastroProduto( LinkedList<Produto> listaProduto) {
        initComponents();
        this.listaProduto = listaProduto;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLQuantidade = new javax.swing.JLabel();
        jLPreco = new javax.swing.JLabel();
        jTFPReco = new javax.swing.JTextField();
        jTFQauntidade = new javax.swing.JTextField();
        jLTipo = new javax.swing.JLabel();
        jCBTipoProduto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLBebida = new javax.swing.JLabel();
        jCBTipoBebida = new javax.swing.JComboBox<>();
        jLEmbalagem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFEmbalagen = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jLTipoComestivel = new javax.swing.JLabel();
        jCBTipoComestivel = new javax.swing.JComboBox<>();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        jBNome.setBackground(new java.awt.Color(255, 153, 0));
        jBNome.setText("Nome:");

        jLQuantidade.setText("Quantidade:");

        jLPreco.setText("Preço:");

        jLTipo.setText("Tipo do Produto:");

        jCBTipoProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<< Selecionar >>", "1 - Comestivle", "2 - Bebida", " " }));
        jCBTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFQauntidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jTFPReco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBTipoProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuantidade)
                    .addComponent(jTFQauntidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPreco)
                    .addComponent(jTFPReco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipo)
                    .addComponent(jCBTipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bebida"));

        jLBebida.setText("Tipo: ");

        jCBTipoBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 – Água ", "2 – Suco ", "3 – Refrigerante ", "4 – Outro" }));

        jLEmbalagem.setText("Embalagem: ");

        jScrollPane1.setViewportView(jTFEmbalagen);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBTipoBebida, 0, 200, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLBebida)
                    .addComponent(jCBTipoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEmbalagem)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Comestivel"));

        jLTipoComestivel.setText("Tipo:");

        jCBTipoComestivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 – Prato", "2 – Lanche", "3 – Diversos" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTipoComestivel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jCBTipoComestivel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTipoComestivel)
                    .addComponent(jCBTipoComestivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

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
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jBSalvar)
                        .addGap(75, 75, 75)
                        .addComponent(jBCancelar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:
            if(jTFNome.getText().equals("")){
                if(jTFQauntidade.getText().equals("")){
                    if(jTFPReco.getText().equals("")){
                        if(jCBTipoProduto.getSelectedIndex()== 1){
                            if(jCBTipoProduto.getSelectedIndex()== 1){
                                try{
                                String nome = jTFNome.getText();
                                int quantidade = Integer.parseInt(jTFQauntidade.getText());
                                float preco = Float.parseFloat(jTFPReco.getText());
                                int tipoBebida = jCBTipoBebida.getSelectedIndex();
                                String embalagem = jTFEmbalagen.getText();
                                Bebida minhaBebida = new Bebida(tipoBebida, embalagem, nome, (int) preco, quantidade);
                                this.listaProduto.add(minhaBebida);
                                LimpaCampos();
                                 JOptionPane.showMessageDialog(rootPane, "Bebida cadastrada com sucesso!!!");
                                }catch(Exception exc){
                                    JOptionPane.showMessageDialog(rootPane, "Dados inválidos!!!");
                            }
                        }else if(jCBTipoProduto.getSelectedIndex()== 2) {
                            
                                 try{
                                    String nome = jTFNome.getText();
                                    int quantidade = Integer.parseInt(jTFQauntidade.getText());
                                    float preco = Float.parseFloat(jTFPReco.getText());
                                    int tipoComestivel = jCBTipoComestivel.getSelectedIndex();
                                    Comestivel meuComestivel = new Comestivel(tipoComestivel, nome, quantidade, preco);
                                    this.listaProduto.add(meuComestivel);
                                    LimpaCampos();
                                    JOptionPane.showMessageDialog(rootPane, " Cadastrado com sucesso");
                                 }catch(Exception exc){
                                JOptionPane.showMessageDialog(rootPane, "Dados inválidos");
                            }        
                        }        
                        }else{
                           JOptionPane.showMessageDialog(jCBTipoComestivel, "Erro: Informe o produto");
                        }
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Erro: informe o preço");
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Erro: informe a quantidade");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro: informe o nome");
            }
         
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        LimpaCampos();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jCBTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoProdutoActionPerformed
        // TODO add your handling code here:
        GerenciaCampos();
    }//GEN-LAST:event_jCBTipoProdutoActionPerformed


    public void LimpaCampos(){
        jTFNome.setText("");
        jTFQauntidade.setText("");
        jTFPReco.setText("");
        jTFEmbalagen.setText("");
        jCBTipoProduto.setSelectedIndex(0);
        jCBTipoBebida.setSelectedIndex(0);
        jCBTipoComestivel.setSelectedIndex(0);
        
    }
    
     public void GerenciaCampos(){
      if(jCBTipoProduto.getSelectedIndex()==0){
          jCBTipoBebida.setEnabled(false);
          jCBTipoComestivel.setEnabled(false);
          jTFEmbalagen.setEnabled(false);
     }else if(jCBTipoProduto.getSelectedIndex() == 1){
         jCBTipoBebida.setEnabled(true);
         jCBTipoComestivel.setEnabled(false);
         jTFEmbalagen.setEnabled(true);
     }else if(jCBTipoProduto.getSelectedIndex() == 2){
         jCBTipoBebida.setEnabled(false);
         jTFEmbalagen.setEnabled(false);
         jCBTipoComestivel.setEnabled(true);
     }
       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JLabel jBNome;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCBTipoBebida;
    private javax.swing.JComboBox<String> jCBTipoComestivel;
    private javax.swing.JComboBox<String> jCBTipoProduto;
    private javax.swing.JLabel jLBebida;
    private javax.swing.JLabel jLEmbalagem;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JLabel jLTipoComestivel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTFEmbalagen;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPReco;
    private javax.swing.JTextField jTFQauntidade;
    // End of variables declaration//GEN-END:variables
}
