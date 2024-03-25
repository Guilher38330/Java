
package trabalhofinal;

import TrabalhoModelDominio.Bebida;
import TrabalhoModelDominio.Comestivel;
import TrabalhoModelDominio.Produto;
import java.awt.Container;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;
import javax.swing.JOptionPane;

public class CadastroDeProdutos extends javax.swing.JFrame {

    LinkedList<Produto> listaProdutos;
    
    public CadastroDeProdutos(LinkedList<Produto>listaProdutos) {
        initComponents();
        //inicializando a lista
        this.listaProdutos = listaProdutos;   
        GerenciaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLNome = new javax.swing.JLabel();
        jLQuantidade = new javax.swing.JLabel();
        jLPreco = new javax.swing.JLabel();
        jLTipoProduto = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFQuantidade = new javax.swing.JTextField();
        jTFPreco = new javax.swing.JTextField();
        jCBProduto = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jCBTipoBebida = new javax.swing.JComboBox<>();
        jTFEmbalagem = new javax.swing.JTextField();
        jLEmbalagem = new javax.swing.JLabel();
        jLTipoBebida = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLTipoComestivel = new javax.swing.JLabel();
        jCBTipoComestivel = new javax.swing.JComboBox<>();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jLNome.setText("Nome:");

        jLQuantidade.setText("Quantidade:");

        jLPreco.setText("Preço:");

        jLTipoProduto.setText("Tipo Produto:");

        jTFPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPrecoActionPerformed(evt);
            }
        });

        jCBProduto.setEditable(true);
        jCBProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Selecionar>>", "Bebida", "Comestível" }));
        jCBProduto.setToolTipText("");
        jCBProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNome)
                            .addComponent(jLPreco)
                            .addComponent(jLTipoProduto)))
                    .addComponent(jLQuantidade))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLQuantidade))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPreco))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLTipoProduto)
                    .addComponent(jCBProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bebida"));

        jCBTipoBebida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<< Selecionar >>", "Água", "Suco", "Refrigerante", "Outro" }));

        jLEmbalagem.setText("Embalagem:");

        jLTipoBebida.setText("Tipo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEmbalagem)
                    .addComponent(jLTipoBebida))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFEmbalagem)
                    .addComponent(jCBTipoBebida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBTipoBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTipoBebida))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEmbalagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEmbalagem))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Comestível"));

        jLTipoComestivel.setText("Tipo:");

        jCBTipoComestivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<< Selecionar >>", " Prato", " Lanche", " Diversos" }));
        jCBTipoComestivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoComestivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTipoComestivel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jCBTipoComestivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBTipoComestivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTipoComestivel))
                .addContainerGap(19, Short.MAX_VALUE))
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
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBProdutoActionPerformed
       GerenciaCampos();
            
    }//GEN-LAST:event_jCBProdutoActionPerformed

    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        // TODO add your handling code here:
        //passo 1: verificando se o usuario informou os dados
        //pega os dados
        if(!jTFNome.getText().equals("")){
            if(!jTFQuantidade.getText().equals("")){
                if(!jTFPreco.getText().equals("")){
                    if(jCBProduto.getSelectedIndex()!= 0){
                        
                        if(jCBProduto.getSelectedIndex()== 1){
                            try{
                                String nome = jTFNome.getText();
                                int quantidade = Integer.parseInt(jTFQuantidade.getText());
                                float preco = Float.parseFloat(jTFPreco.getText());
                                int tipoBebida = jCBTipoBebida.getSelectedIndex();
                                String embalagem = jTFEmbalagem.getText();
                                Bebida minhaBebida = new Bebida(tipoBebida, embalagem, nome, (int) preco, quantidade);
                                this.listaProdutos.add(minhaBebida);
                                LimpaCampos();
                                 JOptionPane.showMessageDialog(rootPane, "Bebida cadastrada com sucesso!!!");
                            }catch(Exception exc){
                                JOptionPane.showMessageDialog(rootPane, "Dados inválidos!!!");
                            }
                        }else if(jCBProduto.getSelectedIndex()== 2) {
                            
                                 try{
                                    String nome = jTFNome.getText();
                                    int quantidade = Integer.parseInt(jTFQuantidade.getText());
                                    float preco = Float.parseFloat(jTFPreco.getText());
                                    int tipoComestivel = jCBTipoComestivel.getSelectedIndex();
                                    Comestivel meuComestivel = new Comestivel(tipoComestivel, nome, quantidade, preco);
                                    this.listaProdutos.add(meuComestivel);
                                    LimpaCampos();
                                    JOptionPane.showMessageDialog(rootPane, "Comestível cadastrado com sucesso!!!");
                                 }catch(Exception exc){
                                JOptionPane.showMessageDialog(rootPane, "Dados inválidos!!!");
                            }        
                        }      
                    }else {
                        JOptionPane.showMessageDialog(jCBTipoComestivel, "Erro: Informe o produto!!!");
                    }
                }else {
                    JOptionPane.showMessageDialog(jCBTipoComestivel, "Erro: Informe o preço!!!");
                }
            }else {
                JOptionPane.showMessageDialog(jCBTipoComestivel, "Erro: Informe a quantidade!!!");
            }
        }else {
            JOptionPane.showMessageDialog(jCBTipoComestivel, "Erro: Informe o seu nome!!!");
        }
        

    
                                  
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jTFPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPrecoActionPerformed

    private void jCBTipoComestivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoComestivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTipoComestivelActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        LimpaCampos();
        
    }//GEN-LAST:event_jBCancelarActionPerformed
   
    public void LimpaCampos(){
        jTFNome.setText("");
        jTFQuantidade.setText("");
        jTFPreco.setText("");
        jTFEmbalagem.setText("");
        jCBProduto.setSelectedIndex(0);
        jCBTipoBebida.setSelectedIndex(0);
        jCBTipoComestivel.setSelectedIndex(0);
        
    }
    
  public void GerenciaCampos(){
      if(jCBProduto.getSelectedIndex()==0){
          jCBTipoBebida.setEnabled(false);
          jCBTipoComestivel.setEnabled(false);
          jTFEmbalagem.setEnabled(false);
     }else if(jCBProduto.getSelectedIndex() == 1){
         jCBTipoBebida.setEnabled(true);
         jCBTipoComestivel.setEnabled(false);
         jTFEmbalagem.setEnabled(true);
     }else if(jCBProduto.getSelectedIndex() == 2){
         jCBTipoBebida.setEnabled(false);
         jTFEmbalagem.setEnabled(false);
         jCBTipoComestivel.setEnabled(true);
     }
       }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCBProduto;
    private javax.swing.JComboBox<String> jCBTipoBebida;
    private javax.swing.JComboBox<String> jCBTipoComestivel;
    private javax.swing.JLabel jLEmbalagem;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPreco;
    private javax.swing.JLabel jLQuantidade;
    private javax.swing.JLabel jLTipoBebida;
    private javax.swing.JLabel jLTipoComestivel;
    private javax.swing.JLabel jLTipoProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFEmbalagem;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFPreco;
    private javax.swing.JTextField jTFQuantidade;
    // End of variables declaration//GEN-END:variables

}

