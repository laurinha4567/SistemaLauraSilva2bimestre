/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import bean.LfsCliente;
import bean.LfsVenda;
import bean.LfsVendasJogos;
import bean.LfsVendedor;
import dao.DAO_Venda;
import dao.DAO_Cliente;
import dao.DAO_Vendajogos;
import dao.DAO_Vendedor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import tools.Util;

public class JDlgVenda extends javax.swing.JDialog {
     ControlerVendasJogos controlerVendasJogos;
    boolean incluir;
    

    /**
     * Creates new form JDlgUsuario
     */
   
    public JDlgVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Movimento Venda");
        DAO_Cliente clienteDAO = new DAO_Cliente();
        
        List lista = (List) clienteDAO.listAll();
        for (int i = 0; i < lista.size(); i++) {
            jCboLfs_fk_vendedor.addItem((LfsVendedor) lista.get(i));
        }        
          DAO_Vendedor DAO_vendedor = new DAO_Vendedor();
        List listaVend = (List) DAO_vendedor.listAll();
        for (Object object : listaVend) {
            jCboLfs_fk_vendedor.addItem((LfsVendedor) object);
        }
        controlerVendasJogos = new ControlerVendasJogos();
        controlerVendasJogos.setList(new ArrayList());
        jTblVendaJogos.setModel(controlerVendasJogos);
    }

    public void beanView(LfsVenda lfsVenda) {
        jCboLfs_fk_cliente.setSelectedItem(lfsVenda.getLfsCliente());
        jCboLfs_fk_vendedor.setSelectedItem(lfsVenda.getLfsVendedor());
        jTxtLfs_idVenda.setText(Util.intToStr(lfsVenda.getLfsIdVenda()));
        jFmtLfs_dataVenda.setText(Util.dateToStr(lfsVenda.getLfsDataVenda()));
        jTxtLfs_total.setText(Util.doubleToStr(lfsVenda.getLfsTotal()));
        jTxtLfs_observacoes.setText(lfsVenda.getLfsObservacoes());
        if(lfsVenda.getLfsStatusVenda().equals("Vendido")) {
            jCboLfs_status_Venda.setSelectedIndex(0);
        } else {
            jCboLfs_status_Venda.setSelectedIndex(1);
        }
        //está dando um erro por conta do listAll
         DAO_Vendajogos dao_vendas = new DAO_Vendajogos();
        List lista = (List) dao_vendas.listVendas(lfsVenda);
        controlerVendasJogos.setList(lista);
    }
       
    public LfsVenda viewBean() {
        LfsVenda lfsVenda = new LfsVenda();
        int codigo = Util.strToInt(jTxtLfs_idVenda.getText());
        lfsVenda.setLfsIdVenda(codigo);
        lfsVenda.setLfsStatusVenda(jCboLfs_status_Venda.getSelectedItem().toString());
        lfsVenda.setLfsCliente((LfsCliente) jCboLfs_fk_cliente.getSelectedItem());
        lfsVenda.setLfsVendedor((LfsVendedor) jCboLfs_fk_vendedor.getSelectedItem());
        lfsVenda.setLfsObservacoes(jTxtLfs_observacoes.getText());
        lfsVenda.setLfsDataVenda(Util.strToDate(jFmtLfs_dataVenda.getText()));
        lfsVenda.setLfsTotal(Util.strToDouble(jTxtLfs_total.getText()));
        return lfsVenda;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTxtLfs_idVenda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblVendaJogos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jFmtLfs_dataVenda = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jTxtLfs_total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCboLfs_status_Venda = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTxtLfs_observacoes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCboLfs_fk_vendedor = new javax.swing.JComboBox<LfsVendedor>();
        jCboLfs_fk_cliente = new javax.swing.JComboBox<LfsCliente>();
        jLabel7 = new javax.swing.JLabel();
        jBtnIncluirJogos = new javax.swing.JButton();
        jBtnAlterarJogos = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmar.jpg"))); // NOI18N
        jBtnConfirmar.setText("confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel3.setText("ID");

        jTxtLfs_idVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLfs_idVendaActionPerformed(evt);
            }
        });

        jTblVendaJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTblVendaJogos);

        jLabel4.setText("Data");

        jLabel1.setText("Total");

        jTxtLfs_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLfs_totalActionPerformed(evt);
            }
        });

        jLabel2.setText("Status Venda");

        jCboLfs_status_Venda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendido", "Em Andamento" }));

        jLabel5.setText("Observação");

        jLabel6.setText("Vendedor");

        jCboLfs_fk_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboLfs_fk_vendedorActionPerformed(evt);
            }
        });

        jLabel7.setText("Cliente");

        jBtnIncluirJogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluirJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirJogosActionPerformed(evt);
            }
        });

        jBtnAlterarJogos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterarJogos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarJogosActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluir.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTxtLfs_idVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtLfs_dataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jCboLfs_fk_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCboLfs_fk_cliente, 0, 197, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTxtLfs_observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCboLfs_status_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTxtLfs_total, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnIncluirJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnAlterarJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jBtnIncluir)
                .addGap(18, 18, 18)
                .addComponent(jBtnAlterar)
                .addGap(18, 18, 18)
                .addComponent(jBtnExcluir)
                .addGap(18, 18, 18)
                .addComponent(jBtnConfirmar)
                .addGap(18, 18, 18)
                .addComponent(jBtnCancelar)
                .addGap(40, 40, 40)
                .addComponent(jBtnPesquisar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtLfs_idVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtLfs_dataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtLfs_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboLfs_status_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtLfs_observacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboLfs_fk_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboLfs_fk_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluirJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAlterarJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnPesquisar)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        incluir = true;
        Util.habilitar(true, jTxtLfs_idVenda, jCboLfs_status_Venda, jFmtLfs_dataVenda, jTxtLfs_observacoes, jTxtLfs_total, jCboLfs_fk_vendedor, jCboLfs_fk_cliente, jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnPesquisar);
        Util.limpar(jTxtLfs_idVenda, jCboLfs_status_Venda, jTxtLfs_observacoes, jFmtLfs_dataVenda, jTxtLfs_total, jCboLfs_fk_vendedor, jCboLfs_fk_cliente);
        controlerVendasJogos.setList(new ArrayList()); 
        jTxtLfs_idVenda.grabFocus();
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        incluir = false;
        Util.habilitar(true, jTxtLfs_idVenda, jCboLfs_status_Venda, jFmtLfs_dataVenda, jTxtLfs_observacoes, jTxtLfs_total, jCboLfs_fk_vendedor, jCboLfs_fk_cliente, jBtnConfirmar, jBtnCancelar);
        Util.habilitar(false, jBtnAlterar, jBtnExcluir);
        jFmtLfs_dataVenda.grabFocus();
         Util.limpar(jTxtLfs_idVenda, jCboLfs_status_Venda, jTxtLfs_observacoes, jFmtLfs_dataVenda, jTxtLfs_total, jCboLfs_fk_vendedor, jCboLfs_fk_cliente);
        jTxtLfs_idVenda.grabFocus();
         controlerVendasJogos.setList(new ArrayList()); 

    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        if (Util.perguntar("Tem certezaaa??") == true) {
            DAO_Venda vendaDAO = new DAO_Venda();
                  
            DAO_Vendajogos dao_vendajogos = new DAO_Vendajogos();
            
               
              for (int ind = 0; ind < jTblVendaJogos.getRowCount(); ind++) {
                LfsVendasJogos lfsVendasjogos = controlerVendasJogos.getBean(ind);
                dao_vendajogos.delete(lfsVendasjogos);
            }
               vendaDAO.delete(viewBean()); 
        }

        Util.limpar(jTxtLfs_idVenda, jTxtLfs_observacoes, jCboLfs_status_Venda, jFmtLfs_dataVenda, jTxtLfs_total, jCboLfs_fk_vendedor, jCboLfs_fk_cliente);
         controlerVendasJogos.setList(new ArrayList()); 
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        DAO_Venda vendaDAO = new DAO_Venda();
        DAO_Vendajogos dao_vendajogos = new DAO_Vendajogos();
        LfsVenda lfsvenda = viewBean();
        if (incluir == true) {
            vendaDAO.insert(lfsvenda);
            for (int ind = 0; ind < jTblVendaJogos.getRowCount(); ind++) {
                LfsVendasJogos lfsVendasjogos = controlerVendasJogos.getBean(ind);
                lfsVendasjogos.setLfsVenda(lfsvenda);
               dao_vendajogos.insert(lfsVendasjogos);
            }
        } else {
            vendaDAO.update(lfsvenda);

        }
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
        Util.habilitar(false, jTxtLfs_idVenda, jCboLfs_status_Venda, jFmtLfs_dataVenda, jTxtLfs_observacoes, jTxtLfs_total, jCboLfs_fk_vendedor, jCboLfs_fk_cliente, jBtnConfirmar, jBtnCancelar);
        Util.limpar(jTxtLfs_idVenda, jTxtLfs_observacoes, jCboLfs_status_Venda, jFmtLfs_dataVenda, jTxtLfs_total, jCboLfs_fk_vendedor, jCboLfs_fk_cliente);
         controlerVendasJogos.setList(new ArrayList()); 
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed

      //  Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
      //  Util.habilitar(false, jTxtLfs_idVenda, jFmtLfs_dataVenda, jCboLfs_status_Venda, jTxtLfs_observacoes, jTxtLfs_total, jCboLfs_fk_vendedor, jCboLfs_fk_cliente, jBtnConfirmar, jBtnCancelar);
       // Util.limpar(jTxtLfs_idVenda, jTxtLfs_observacoes, jCboLfs_status_Venda, jFmtLfs_dataVenda, jCboLfs_status_Venda, jTxtLfs_total, jCboLfs_fk_vendedor, jCboLfs_fk_cliente);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed

        JDlgVendaPesquisar jDlgVendaPesquisar = new JDlgVendaPesquisar(null, true);
        jDlgVendaPesquisar.setTelaAnterior(this);
        jDlgVendaPesquisar.setVisible(true);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jTxtLfs_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLfs_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLfs_totalActionPerformed

    private void jCboLfs_fk_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboLfs_fk_vendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCboLfs_fk_vendedorActionPerformed

    private void jTxtLfs_idVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLfs_idVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLfs_idVendaActionPerformed

    private void jBtnIncluirJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirJogosActionPerformed
        // TODO add your handling code here:
        JDlgVendasJogos jDlgVendasJogos = new JDlgVendasJogos(null, true);
         jDlgVendasJogos.setTelaAnterior(this);
    jDlgVendasJogos.setVisible(true);
        
    }//GEN-LAST:event_jBtnIncluirJogosActionPerformed

    private void jBtnAlterarJogosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarJogosActionPerformed
        // TODO add your handling code here:
        JDlgVendasJogos jDlgVendasJogos = new JDlgVendasJogos(null, true);
    jDlgVendasJogos.setVisible(true);
    }//GEN-LAST:event_jBtnAlterarJogosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       if (jTblVendaJogos.getSelectedRow() == -1) {
            Util.mensagem("Oh seu loco, precisa selecionar uma linha.");
        } else {
            if (Util.perguntar("Deseja excluir o produto ?") == true) {
                controlerVendasJogos.removeBean(jTblVendaJogos.getSelectedRow());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVenda dialog = new JDlgVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterarJogos;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnIncluirJogos;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<LfsCliente> jCboLfs_fk_cliente;
    private javax.swing.JComboBox<LfsVendedor> jCboLfs_fk_vendedor;
    private javax.swing.JComboBox<String> jCboLfs_status_Venda;
    private javax.swing.JFormattedTextField jFmtLfs_dataVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTblVendaJogos;
    private javax.swing.JTextField jTxtLfs_idVenda;
    private javax.swing.JTextField jTxtLfs_observacoes;
    private javax.swing.JTextField jTxtLfs_total;
    // End of variables declaration//GEN-END:variables
}
