/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import bean.LfsCliente;
import dao.DAO_Cliente;
import java.util.List;
import tools.Util;

/**
 *
 * @author u07881974109
 */
public class JDlgClientePesquisar extends javax.swing.JDialog {
      
       private JDlgClientes jDlgCliente;
       ControlerCliente controlerCliente;
    
    public JDlgClientePesquisar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Pesquisar clientes");
        setLocationRelativeTo(null);
        
        controlerCliente = new ControlerCliente();
    DAO_Cliente clienteDAO = new DAO_Cliente();
      List lista = (List) clienteDAO.listAll();
      controlerCliente.setList(lista);
        jTable1.setModel(controlerCliente);
        
        
    }

    
    public void setTelaAnterior(JDlgClientes jDlgCliente){
       this.jDlgCliente = jDlgCliente;
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JBtnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        JBtnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmar.jpg"))); // NOI18N
        JBtnOk.setText("Ok");
        JBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBtnOk)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBtnOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtnOkActionPerformed
       
       if (jTable1.getSelectedRow() == -1) {
            Util.mensagem("Nenhum registro foi selecionada. Favor selecionar um registro.");
        } else {
            LfsCliente lfscliente = controlerCliente.getBean(jTable1.getSelectedRow());
            jDlgCliente.beanView(lfscliente);
            this.setVisible(false);
        }
     
    }//GEN-LAST:event_JBtnOkActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         if (evt.getClickCount() == 2) {
            JBtnOkActionPerformed(null);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgClientePesquisar dialog = new JDlgClientePesquisar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton JBtnOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
