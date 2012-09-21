/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaPrincipal.java
 *
 * Created on 24/10/2009, 16:07:36
 */

package br.com.prestadoradeservicos.views;

import br.com.prestadoradeservicos.controlers.TelaPrincipalControler;

/**
 *
 * @author Anderson Luis Ribeiro
 */
public class TelaPrincipal extends javax.swing.JFrame {
    private TelaPrincipalControler controller;
    /** Creates new form TelaPrincipal */
    public TelaPrincipal(TelaPrincipalControler controller) {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.controller = controller;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btTiposDeServico = new javax.swing.JButton();
        btServicos = new javax.swing.JButton();
        btClientes = new javax.swing.JButton();
        menuPrincipal = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        miClientes = new javax.swing.JMenuItem();
        miTiposDeServico = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        mLancamentos = new javax.swing.JMenu();
        miServicos = new javax.swing.JMenuItem();
        mRelatorios = new javax.swing.JMenu();
        miServicosExecutados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema - Prestadora de Serviços");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btTiposDeServico.setText("Tipos de Serviço");
        btTiposDeServico.setPreferredSize(new java.awt.Dimension(80, 23));
        btTiposDeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTiposDeServicoActionPerformed(evt);
            }
        });

        btServicos.setText("Serviços");
        btServicos.setPreferredSize(new java.awt.Dimension(73, 23));
        btServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btServicosActionPerformed(evt);
            }
        });

        btClientes.setText("Clientes");
        btClientes.setPreferredSize(new java.awt.Dimension(80, 23));
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btTiposDeServico, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTiposDeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        mCadastro.setText("Cadastro");

        miClientes.setText("Clientes");
        miClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesActionPerformed(evt);
            }
        });
        mCadastro.add(miClientes);

        miTiposDeServico.setText("Tipos de Serviço");
        miTiposDeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTiposDeServicoActionPerformed(evt);
            }
        });
        mCadastro.add(miTiposDeServico);

        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mCadastro.add(miSair);

        menuPrincipal.add(mCadastro);

        mLancamentos.setText("Lançamentos");

        miServicos.setText("Serviços");
        miServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miServicosActionPerformed(evt);
            }
        });
        mLancamentos.add(miServicos);

        menuPrincipal.add(mLancamentos);

        mRelatorios.setText("Relatórios");

        miServicosExecutados.setText("Serviços Executados");
        miServicosExecutados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miServicosExecutadosActionPerformed(evt);
            }
        });
        mRelatorios.add(miServicosExecutados);

        menuPrincipal.add(mRelatorios);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
        controller.exibirClienteView();
    }//GEN-LAST:event_miClientesActionPerformed

    private void miTiposDeServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTiposDeServicoActionPerformed
        controller.exibirCadastroDeTipoDeServicosView();
    }//GEN-LAST:event_miTiposDeServicoActionPerformed

    private void miServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miServicosActionPerformed
        controller.exibirLancamentoDeServicosView();
    }//GEN-LAST:event_miServicosActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSairActionPerformed

    private void miServicosExecutadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miServicosExecutadosActionPerformed
        controller.exibirRelatorioDeServicosExecutados();
    }//GEN-LAST:event_miServicosExecutadosActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        controller.exibirClienteView();
    }//GEN-LAST:event_btClientesActionPerformed

    private void btTiposDeServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTiposDeServicoActionPerformed
        controller.exibirCadastroDeTipoDeServicosView();
    }//GEN-LAST:event_btTiposDeServicoActionPerformed

    private void btServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btServicosActionPerformed
        controller.exibirLancamentoDeServicosView();
    }//GEN-LAST:event_btServicosActionPerformed

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClientes;
    private javax.swing.JButton btServicos;
    private javax.swing.JButton btTiposDeServico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mLancamentos;
    private javax.swing.JMenu mRelatorios;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miServicos;
    private javax.swing.JMenuItem miServicosExecutados;
    private javax.swing.JMenuItem miTiposDeServico;
    // End of variables declaration//GEN-END:variables

}