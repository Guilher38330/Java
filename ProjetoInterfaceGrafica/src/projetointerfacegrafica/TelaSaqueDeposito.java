/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetointerfacegrafica;

import com.sun.source.util.Plugin;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelDominio.ContaBancaria;

/**
 *
 * @author Guilherme
 */
public class TelaSaqueDeposito extends javax.swing.JFrame {
 LinkedList<ContaBancaria> listaContaBancaria;
    /**
     * Creates new form TelaSaqueDeposito
     */
    public TelaSaqueDeposito(LinkedList<ContaBancaria>listaContaBancarias) {
        initComponents();
        this.listaContaBancaria = listaContaBancarias;
        carregaComboContas();
    }
    //metodo responsavel por carregar a combo box
    public void carregaComboContas(){
        jCBcontaBancaria.addItem("<< Selecionar >>");
        for(int i = 0; i < this.listaContaBancaria.size(); i++){
            ContaBancaria minhaConta = this.listaContaBancaria.get(i);
            //adicionando a conta
            jCBcontaBancaria.addItem(minhaConta.getClienteTitular().getNome() + " - " + minhaConta.getClienteTitular().getCpf());
            
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

        bGOperacoes = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLOperacao = new javax.swing.JLabel();
        jRBsacar = new javax.swing.JRadioButton();
        jRBdepositar = new javax.swing.JRadioButton();
        jLConta = new javax.swing.JLabel();
        jCBcontaBancaria = new javax.swing.JComboBox<>();
        jLValor = new javax.swing.JLabel();
        jBEfetuar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        JTFValor = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Saque Deposito");

        jLOperacao.setText("Operação: ");

        bGOperacoes.add(jRBsacar);
        jRBsacar.setText("Sacar");

        bGOperacoes.add(jRBdepositar);
        jRBdepositar.setText("Depósitar");

        jLConta.setText("Conta: ");

        jCBcontaBancaria.setToolTipText("");

        jLValor.setText("Valor: ");

        jBEfetuar.setText("Efetuar");
        jBEfetuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEfetuarActionPerformed(evt);
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
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLOperacao)
                        .addGap(40, 40, 40)
                        .addComponent(jRBsacar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRBdepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEfetuar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLValor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBcontaBancaria, 0, 188, Short.MAX_VALUE)
                            .addComponent(JTFValor))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLOperacao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBsacar)
                    .addComponent(jRBdepositar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLConta)
                    .addComponent(jCBcontaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValor)
                    .addComponent(JTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEfetuar)
                    .addComponent(jBCancelar))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBEfetuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEfetuarActionPerformed
        // TODO add your handling code here:
        if(jRBsacar.isSelected() || jRBdepositar.isSelected()){
            if(jCBcontaBancaria.getSelectedIndex() != 0){
                if(!JTFValor.getText().equals("")){
                    //obtendo as informacoes
                    float valor = Float.parseFloat(JTFValor.getText());
                    
                    int posicao = jCBcontaBancaria.getSelectedIndex();
                    ContaBancaria minhaConta = this.listaContaBancaria.get(posicao - 1);
                    
                    if(jRBsacar.isSelected()){
                        boolean resultado = minhaConta.sacar(valor);
                        
                        if(resultado == true){
                        JOptionPane.showMessageDialog(rootPane, "Saque efetuado com sucesso");
                        limpaCampus();
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Erro: saldo insuficiente");
                        }
                    }else if(jRBdepositar.isSelected()){
                         boolean resultado = minhaConta.depositar(valor);
                        
                        if(resultado == true){
                        JOptionPane.showMessageDialog(rootPane, "Deposito efetuado com sucesso");
                        limpaCampus();
                        }else{
                            JOptionPane.showMessageDialog(rootPane, "Erro: deposito não efetuado");
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Erro: Informe o valor desejada");
                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro: Informe a conta desejada");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Erro: Informe a operaçao desejada");
        }
    }//GEN-LAST:event_jBEfetuarActionPerformed

    public void limpaCampus(){
    bGOperacoes.clearSelection();
    jCBcontaBancaria.setSelectedIndex(0);
    JTFValor.setText("");
}
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTFValor;
    private javax.swing.ButtonGroup bGOperacoes;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEfetuar;
    private javax.swing.JComboBox<String> jCBcontaBancaria;
    private javax.swing.JLabel jLConta;
    private javax.swing.JLabel jLOperacao;
    private javax.swing.JLabel jLValor;
    private javax.swing.JRadioButton jRBdepositar;
    private javax.swing.JRadioButton jRBsacar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}