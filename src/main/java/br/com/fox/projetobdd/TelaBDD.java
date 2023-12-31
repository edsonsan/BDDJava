/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fox.projetobdd;

import br.com.pageobject.PageObject;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tchul
 */
public class TelaBDD extends javax.swing.JFrame {
    
    String idPai ="";
    int totalLinha=0;

    /**
     * Creates new form TelaBDD
     */
    public TelaBDD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResponsavel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRelator = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrioridade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIdPrincipal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtResumo = new javax.swing.JTextField();
        lblDado = new javax.swing.JLabel();
        txtDado = new javax.swing.JTextField();
        lblQuando = new javax.swing.JLabel();
        txtQuando = new javax.swing.JTextField();
        lblEntao = new javax.swing.JLabel();
        txtEntao = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBDD = new javax.swing.JTable();
        btnAddBdd = new javax.swing.JButton();
        btnNovoBdd = new javax.swing.JButton();
        btnCsv = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        ctxtArea = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnLimpar = new javax.swing.JButton();
        btnJira = new javax.swing.JButton();
        btnlimparTudo = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("TelaBdd"); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel1.setText("Sistema de Cards Jira BDD");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Responsável:");

        txtResponsavel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtResponsavel.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txtResponsavel.setName(""); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Relator:");

        txtRelator.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtRelator.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Tipo de item:");

        txtTipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtTipo.setText("Sub-task");
        txtTipo.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Prioridade:");

        txtPrioridade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPrioridade.setText("Medium");
        txtPrioridade.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("ID principal *:");

        txtIdPrincipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtIdPrincipal.setMargin(new java.awt.Insets(0, 2, 0, 0));
        txtIdPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdPrincipalFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Resumo *:");

        txtResumo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtResumo.setMargin(new java.awt.Insets(0, 2, 0, 0));

        lblDado.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblDado.setText("DADO:");

        txtDado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDado.setMargin(new java.awt.Insets(0, 2, 0, 0));

        lblQuando.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblQuando.setText("QUANDO:");

        txtQuando.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQuando.setMargin(new java.awt.Insets(0, 2, 0, 0));

        lblEntao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblEntao.setText("ENTÃO:");

        txtEntao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEntao.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEntao.setMargin(new java.awt.Insets(0, 2, 0, 0));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setText("BDD Consolidado");

        tblBDD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resumo", "Tipo de Item", "ID Principal", "BDD", "Responsavel", "Relator", "Prioridade"
            }
        ));
        jScrollPane1.setViewportView(tblBDD);

        btnAddBdd.setLabel("Adicionar BDD");
        btnAddBdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddBddMouseClicked(evt);
            }
        });

        btnNovoBdd.setLabel("Novo BDD");
        btnNovoBdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNovoBddMouseClicked(evt);
            }
        });

        btnCsv.setLabel("Gerar CSV");
        btnCsv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCsvMouseClicked(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setLabel("Excluir");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setMargin(new java.awt.Insets(0, 2, 0, 0));
        ctxtArea.setViewportView(txtArea);

        btnLimpar.setText("Limpar");
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });

        btnJira.setBackground(new java.awt.Color(0, 204, 51));
        btnJira.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnJira.setForeground(new java.awt.Color(255, 255, 255));
        btnJira.setText("Exportar para o Jira");
        btnJira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJiraMouseClicked(evt);
            }
        });

        btnlimparTudo.setBackground(new java.awt.Color(102, 153, 255));
        btnlimparTudo.setForeground(new java.awt.Color(255, 255, 255));
        btnlimparTudo.setText("Limpar tudo");
        btnlimparTudo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimparTudoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(txtResumo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ctxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddBdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNovoBdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDado)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtDado, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQuando)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtQuando, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEntao)
                                        .addGap(3, 3, 3)
                                        .addComponent(txtEntao))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnlimparTudo)
                                .addGap(518, 518, 518)
                                .addComponent(btnJira)
                                .addGap(29, 29, 29)
                                .addComponent(btnExcluir))
                            .addComponent(jScrollPane1))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel5)
                                    .addGap(4, 4, 4)
                                    .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel7)
                                    .addGap(3, 3, 3)
                                    .addComponent(txtIdPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel3)
                                    .addGap(4, 4, 4)
                                    .addComponent(txtRelator))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtRelator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrioridade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtResumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDado)
                    .addComponent(txtDado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuando)
                    .addComponent(txtQuando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEntao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEntao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctxtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddBdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovoBdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCsv)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnJira)
                    .addComponent(btnExcluir)
                    .addComponent(btnlimparTudo))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnAddBddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddBddMouseClicked
        // TODO add your handling code here:
        //Função ADD BDD
        
            
        String summary = txtResumo.getText();
        String parentID = txtIdPrincipal.getText().toUpperCase();
        if(!"".equals(summary) && !"".equals(parentID)){
            String issueType = txtTipo.getText();
            String responsavbel = txtResponsavel.getText();
            String relato = txtRelator.getText();
            String prioridade = txtPrioridade.getText();
            //String textoBDD = txtArea.getText();
            System.out.println(summary);
            String textoBDD ="*" + lblDado.getText() + "*" + " " + txtDado.getText()+" "+"\r\n" +
                    "*" + lblQuando.getText() + "*" +" "+ txtQuando.getText()+" "+"\r\n"+
                    "*" + lblEntao.getText() + "*" +" "+ txtEntao.getText()+"\r\n";
            txtArea.append(textoBDD);
        //preenchendo a tabela
            DefaultTableModel tabelaBDD = (DefaultTableModel) tblBDD.getModel();
            Object[] dadoTabela = new Object[]{
                summary, issueType, parentID, textoBDD, responsavbel, relato, prioridade
            };
            tabelaBDD.addRow(dadoTabela);
            System.out.println("------ FIM do cadastro--------");
        }else{
            JOptionPane.showMessageDialog(this,"Campo ID Principal ou Resumo não preenchidos!");        
            txtIdPrincipal.requestFocus();
        }
    }//GEN-LAST:event_btnAddBddMouseClicked

    private void btnNovoBddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoBddMouseClicked
        // TODO add your handling code here:
        txtResponsavel.setText("");
        txtRelator.setText("");
        txtIdPrincipal.setText("");
        txtResumo.setText("");
        txtDado.setText("");
        txtQuando.setText("");
        txtEntao.setText("");
        txtArea.setText("");
        txtResponsavel.requestFocus();
    }//GEN-LAST:event_btnNovoBddMouseClicked

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        // TODO add your handling code here:
        //Excluir BDD da Tabela
        int linhaSelecionada = tblBDD.getSelectedRow();
        if(linhaSelecionada == -1){
            JOptionPane.showMessageDialog(this, "Por favor selecione uma linha.");
        }else{
            DefaultTableModel tabelaBDD = (DefaultTableModel) tblBDD.getModel();
            tabelaBDD.removeRow(linhaSelecionada);
            JOptionPane.showMessageDialog(this, "BDD removido com sucesso.");
        }
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnCsvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCsvMouseClicked
        // TODO add your handling code here:
        // Cria o arquivo CSV para o Jira
        int linhaSelecionada = tblBDD.getRowCount();
        if(linhaSelecionada <= 0){
            JOptionPane.showMessageDialog(this, "Por favor cadastre um BDD.");
        }else{
            DefaultTableModel tabelaBDD = (DefaultTableModel) tblBDD.getModel();
            linhaSelecionada = tblBDD.getRowCount();
            System.out.println(linhaSelecionada);
            String colunaBDD = "";
            String colunasummary = "";
            String colunaissueType = "";
            String colunaparentID = "";
            String colunaresponsavel = "";
            String colunarelator = "";
            String colunaprioridade = "";
            Writer fstream = null;
            BufferedWriter out = null;
            try {
                fstream = new OutputStreamWriter(new FileOutputStream("jiracsv.csv"), StandardCharsets.UTF_8);
            } catch (IOException ex) {
                Logger.getLogger(TelaBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            PrintWriter escrever = new PrintWriter(fstream);
            escrever.println("Resumo,"+ "Responsável," + "Relator,"+ "Tipo de item,"+
                              "Descrição,"+ "Prioridade," +"ID principal");
            for(int i = 0; i < linhaSelecionada; i++){
                colunasummary = (String) tabelaBDD.getValueAt(i, 0);
                colunaissueType = (String) tabelaBDD.getValueAt(i, 1);
                colunaparentID = (String) tabelaBDD.getValueAt(i, 2);
                colunaBDD = (String) tabelaBDD.getValueAt(i, 3);
                colunaresponsavel = (String) tabelaBDD.getValueAt(i, 4);
                colunarelator = (String) tabelaBDD.getValueAt(i, 5);
                colunaprioridade = (String) tabelaBDD.getValueAt(i, 6);
                System.out.println(colunaBDD);
                System.out.println("------------------------------------");
                escrever.print(colunasummary + ","+colunaresponsavel + "," + colunarelator+"," + 
                        colunaissueType + "," + '\"'+ colunaBDD +'\"'+ "," + colunaprioridade + "," + colunaparentID +"\r\n");
            }
            try {
                fstream.close();
            } catch (IOException ex) {
                Logger.getLogger(TelaBDD.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Arquivo CSV criado com sucesso.\n"+
                    "Com " + linhaSelecionada + " BDD.");
            idPai =colunaparentID;
            totalLinha = linhaSelecionada;
        }
    }//GEN-LAST:event_btnCsvMouseClicked

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        // TODO add your handling code here:
        //Limpar campos do BDD
        txtResumo.setText("");
        txtDado.setText("");
        txtQuando.setText("");
        txtEntao.setText("");
        txtArea.setText("");
        txtResumo.requestFocus();
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnJiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJiraMouseClicked
        int vTotal =0;
        System.out.println("O ID PAI é: "+idPai);
        try {
            // TODO add your handling code here:
            //Iniciando a chamada para o Jira utilizando a Page Object
        vTotal= PageObject.jira(idPai, totalLinha);
        } catch (InterruptedException ex) {
            Logger.getLogger(TelaBDD.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, vTotal + " Cards criados com sucesso.");        
    }//GEN-LAST:event_btnJiraMouseClicked

    private void txtIdPrincipalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdPrincipalFocusLost
        // TODO add your handling code here:
            txtIdPrincipal.setText(txtIdPrincipal.getText().toUpperCase());
    }//GEN-LAST:event_txtIdPrincipalFocusLost

    private void btnlimparTudoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimparTudoMouseClicked
        // TODO add your handling code here:
        txtResponsavel.setText("");
        txtRelator.setText("");
        txtIdPrincipal.setText("");
        txtResumo.setText("");
        txtDado.setText("");
        txtQuando.setText("");
        txtEntao.setText("");
        txtArea.setText("");
        txtResponsavel.requestFocus();
        int linhaSelecionada = tblBDD.getRowCount();
        linhaSelecionada = linhaSelecionada  - 1;
        DefaultTableModel tabelaBDD = (DefaultTableModel) tblBDD.getModel();
        System.out.println(linhaSelecionada);    
        for(int i = linhaSelecionada; i > -1; i--){
            tabelaBDD.removeRow(i);
            System.out.println(i +" linha selecionada " + linhaSelecionada);
        }
    }//GEN-LAST:event_btnlimparTudoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void tela() {
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
            java.util.logging.Logger.getLogger(TelaBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBDD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBDD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBdd;
    private javax.swing.JButton btnCsv;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnJira;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovoBdd;
    private javax.swing.JButton btnlimparTudo;
    private javax.swing.JScrollPane ctxtArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblEntao;
    private javax.swing.JLabel lblQuando;
    private javax.swing.JTable tblBDD;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDado;
    private javax.swing.JTextField txtEntao;
    private javax.swing.JTextField txtIdPrincipal;
    private javax.swing.JTextField txtPrioridade;
    private javax.swing.JTextField txtQuando;
    private javax.swing.JTextField txtRelator;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtResumo;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
