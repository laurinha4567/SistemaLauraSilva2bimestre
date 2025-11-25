/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import tools.Util;
import dao.DAO_Vendedor;
import bean.LfsVendedor;

/**
 *
 * @author laura
 */
public class JDlgVendedores extends javax.swing.JDialog { // ele é do contra não quer funcionar!

    private boolean incluir;

    /**
     * Creates new form JDlgUsuario
     */

    public JDlgVendedores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cadastro Vendedor");

        Util.habilitar(false, jTxtIdlfs_vendedor, jTxtLfs_descricao, jTxtLfs_nome,
                jFmtLfs_cpf, jFmtLfs_data_nascimento, jFmtLfs_telefone, jTxtLfs_salario,
                jBtnConfirmar, jBtnCancelar, jBtnExcluir, jBtnAlterar);

    }

    public void beanView(LfsVendedor vendedorbean) {
        jTxtIdlfs_vendedor.setText(Util.intToStr(vendedorbean.getIdlfsVendedor()));
        jTxtLfs_descricao.setText(vendedorbean.getLfsDescricao());
        jTxtLfs_nome.setText(vendedorbean.getLfsNome());
        jFmtLfs_cpf.setText(vendedorbean.getLfsCpf());
        jFmtLfs_data_nascimento.setText(Util.dateToStr(vendedorbean.getLfsDataNascimento()));
        jFmtLfs_telefone.setText(vendedorbean.getLfsTelefone());
        jTxtLfs_salario.setText(Util.doubleToStr(vendedorbean.getLfsSalario()));
    

 
    }
         public LfsVendedor viewBean() {
        LfsVendedor vendedorbean = new LfsVendedor();
        int codigo = Util.strToInt(jTxtIdlfs_vendedor.getText());
        vendedorbean.setIdlfsVendedor(codigo);

        vendedorbean.setLfsDescricao(jTxtLfs_descricao.getText());
        vendedorbean.setLfsNome(jTxtLfs_nome.getText());
        vendedorbean.setLfsCpf(jFmtLfs_cpf.getText());
        vendedorbean.setLfsDataNascimento(Util.strToDate(jFmtLfs_data_nascimento.getText()));
        vendedorbean.setLfsTelefone(jFmtLfs_telefone.getText());
        vendedorbean.setLfsSalario(Util.strToDouble(jTxtLfs_salario.getText()));
    
        return vendedorbean;
         }       
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtIdlfs_vendedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtLfs_descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTxtLfs_nome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jFmtLfs_cpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jFmtLfs_data_nascimento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFmtLfs_telefone = new javax.swing.JFormattedTextField();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTxtLfs_salario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("ID");

        jTxtIdlfs_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdlfs_vendedorActionPerformed(evt);
            }
        });

        jLabel3.setText("Descricao");

        jLabel4.setText("Nome");

        jLabel5.setText("CPF");

        jLabel6.setText("Data de Nascimento");

        jFmtLfs_data_nascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtLfs_data_nascimentoActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefone");

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

        jLabel8.setText("Salario");

        jTxtLfs_salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtLfs_salarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFmtLfs_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxtLfs_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel7)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtIdlfs_vendedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jTxtLfs_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jTxtLfs_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtLfs_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFmtLfs_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(29, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jBtnIncluir)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPesquisar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTxtIdlfs_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTxtLfs_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jFmtLfs_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtLfs_data_nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtLfs_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFmtLfs_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtLfs_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
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

    private void jTxtIdlfs_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdlfs_vendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdlfs_vendedorActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        incluir = true;
        Util.habilitar(true, jTxtIdlfs_vendedor, jTxtLfs_descricao, jTxtLfs_nome,
                jFmtLfs_cpf, jFmtLfs_data_nascimento, jFmtLfs_telefone, jTxtLfs_salario,
                jBtnConfirmar, jBtnCancelar);

        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
         Util.limpar(jTxtIdlfs_vendedor, jTxtLfs_descricao, jTxtLfs_nome,
                jFmtLfs_cpf, jFmtLfs_data_nascimento, jFmtLfs_telefone, jTxtLfs_salario);
        jTxtIdlfs_vendedor.grabFocus();
         incluir = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
      
        Util.habilitar(true, jTxtIdlfs_vendedor, jTxtLfs_descricao, jTxtLfs_nome,
                jFmtLfs_cpf, jFmtLfs_data_nascimento, jFmtLfs_telefone, jTxtLfs_salario,
                jBtnConfirmar, jBtnCancelar);

        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
          incluir = false;
        jTxtLfs_nome.grabFocus();
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed

        if (Util.perguntar("Deseja Excluir?") == true) {
            DAO_Vendedor vendedorDAO = new DAO_Vendedor();
            vendedorDAO.delete(viewBean());
            Util.habilitar(true, jBtnPesquisar, jBtnIncluir);
        Util.habilitar(false, jBtnAlterar, jBtnExcluir);
        
            Util.limpar(jTxtIdlfs_vendedor, jTxtLfs_descricao, jTxtLfs_nome,
                jFmtLfs_cpf, jFmtLfs_data_nascimento,
                jFmtLfs_telefone, jTxtLfs_salario);
        }
        
        
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        
        DAO_Vendedor vendedorDAO = new DAO_Vendedor();
        if(incluir) {
            vendedorDAO.insert(viewBean());
        } else {
            vendedorDAO.update(viewBean());
        }
        Util.habilitar(false, jTxtIdlfs_vendedor, jTxtLfs_descricao, jTxtLfs_nome,
                jFmtLfs_cpf, jFmtLfs_data_nascimento, jFmtLfs_telefone, jTxtLfs_salario,
                jBtnConfirmar, jBtnCancelar);

        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
        Util.limpar(jTxtIdlfs_vendedor, jTxtLfs_descricao, jTxtLfs_nome,
                jFmtLfs_cpf, jFmtLfs_data_nascimento, jFmtLfs_telefone, jTxtLfs_salario,
                jBtnConfirmar);


    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        Util.habilitar(false, jTxtIdlfs_vendedor, jTxtLfs_descricao, jTxtLfs_nome,
                jFmtLfs_cpf, jFmtLfs_data_nascimento, jFmtLfs_telefone, jTxtLfs_salario,
                jBtnConfirmar, jBtnCancelar);

        Util.habilitar(true, jBtnIncluir,jBtnPesquisar);
        Util.limpar(jTxtIdlfs_vendedor, jTxtLfs_descricao, jTxtLfs_nome,
                jFmtLfs_cpf, jFmtLfs_data_nascimento, jFmtLfs_telefone, jTxtLfs_salario,
                jBtnConfirmar);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed

        JDlgVendedorPesquisar jDlgVendedorPesquisar = new JDlgVendedorPesquisar(null, true);
        jDlgVendedorPesquisar.setTelaPai(this);
        jDlgVendedorPesquisar.setVisible(true);
        
        Util.habilitar(false, jBtnPesquisar, jBtnIncluir);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir);


    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jTxtLfs_salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtLfs_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtLfs_salarioActionPerformed

    private void jFmtLfs_data_nascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtLfs_data_nascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtLfs_data_nascimentoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedores dialog = new JDlgVendedores(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JFormattedTextField jFmtLfs_cpf;
    private javax.swing.JFormattedTextField jFmtLfs_data_nascimento;
    private javax.swing.JFormattedTextField jFmtLfs_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTxtIdlfs_vendedor;
    private javax.swing.JTextField jTxtLfs_descricao;
    private javax.swing.JTextField jTxtLfs_nome;
    private javax.swing.JTextField jTxtLfs_salario;
    // End of variables declaration//GEN-END:variables
}
