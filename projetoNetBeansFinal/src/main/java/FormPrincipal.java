//OTÁVIO FELÍCIO 2768488

public class FormPrincipal extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPrincipal.class.getName());

    public FormPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BarMnPrinc = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        itMnProc = new javax.swing.JMenuItem();
        itMnPV = new javax.swing.JMenuItem();
        itMnRAM = new javax.swing.JMenuItem();
        itMnPm = new javax.swing.JMenuItem();
        menuVender = new javax.swing.JMenu();
        menuRelat = new javax.swing.JMenu();
        itMnRelatEstoque = new javax.swing.JMenuItem();
        itMnRelatVendas = new javax.swing.JMenuItem();
        itMnRelatCom = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuAjuda = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLogo.setFont(new java.awt.Font("Unispace", 1, 36)); // NOI18N
        lblLogo.setText("TECHFORGE HARDWARE");

        jLabel1.setFont(new java.awt.Font("Unispace", 2, 18)); // NOI18N
        jLabel1.setText("\"Potência que conecta o futuro\"");

        menuCadastro.setText("Gerenciar");

        itMnProc.setText("Processador");
        itMnProc.addActionListener(this::itMnProcActionPerformed);
        menuCadastro.add(itMnProc);

        itMnPV.setText("Placa de Vídeo");
        itMnPV.addActionListener(this::itMnPVActionPerformed);
        menuCadastro.add(itMnPV);

        itMnRAM.setText("Memória RAM");
        itMnRAM.addActionListener(this::itMnRAMActionPerformed);
        menuCadastro.add(itMnRAM);

        itMnPm.setText("Placa Mãe");
        itMnPm.addActionListener(this::itMnPmActionPerformed);
        menuCadastro.add(itMnPm);

        BarMnPrinc.add(menuCadastro);

        menuVender.setText("Vender");
        menuVender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVenderMouseClicked(evt);
            }
        });
        BarMnPrinc.add(menuVender);

        menuRelat.setText("Relatórios");

        itMnRelatEstoque.setText("Estoque");
        itMnRelatEstoque.addActionListener(this::itMnRelatEstoqueActionPerformed);
        menuRelat.add(itMnRelatEstoque);

        itMnRelatVendas.setText("Vendas");
        itMnRelatVendas.addActionListener(this::itMnRelatVendasActionPerformed);
        menuRelat.add(itMnRelatVendas);

        itMnRelatCom.setText("Comissão");
        itMnRelatCom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itMnRelatComMouseClicked(evt);
            }
        });
        itMnRelatCom.addActionListener(this::itMnRelatComActionPerformed);
        menuRelat.add(itMnRelatCom);

        BarMnPrinc.add(menuRelat);

        menuSobre.setText("Sobre Nós");
        menuSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSobreMouseClicked(evt);
            }
        });
        BarMnPrinc.add(menuSobre);

        menuAjuda.setText("Ajuda");
        menuAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAjudaMouseClicked(evt);
            }
        });
        menuAjuda.addActionListener(this::menuAjudaActionPerformed);
        BarMnPrinc.add(menuAjuda);

        setJMenuBar(BarMnPrinc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblLogo)
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itMnPVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnPVActionPerformed
        FormPlacaDeVideo.geraFormPlacaDeVideo().setVisible(true);
    }//GEN-LAST:event_itMnPVActionPerformed

    private void itMnPmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnPmActionPerformed
        FormPlacaMae.geraFormPlacaMae().setVisible(true);
    }//GEN-LAST:event_itMnPmActionPerformed

    private void itMnProcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnProcActionPerformed
        //CadPes.geraCadPes().setVisible(true);
        FormProcessador.geraFormProcessador().setVisible(true);
    }//GEN-LAST:event_itMnProcActionPerformed

    private void itMnRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRAMActionPerformed
        FormMemoriaRAM.geraFormMemoriaRAM().setVisible(true);
    }//GEN-LAST:event_itMnRAMActionPerformed

    private void itMnRelatEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelatEstoqueActionPerformed
        FormRelatEstoque.geraFormRelatEstoque().setVisible(true);
    }//GEN-LAST:event_itMnRelatEstoqueActionPerformed

    private void menuSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSobreMouseClicked
        FormSobre.geraFormSobre().setVisible(true);
    }//GEN-LAST:event_menuSobreMouseClicked

    private void menuVenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVenderMouseClicked
        FormVenda.geraFormVenda().setVisible(true);
    }//GEN-LAST:event_menuVenderMouseClicked

    private void itMnRelatVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelatVendasActionPerformed
        FormRelatVenda.geraFormRelatVenda().setVisible(true);
    }//GEN-LAST:event_itMnRelatVendasActionPerformed

    private void itMnRelatComMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itMnRelatComMouseClicked
        
    }//GEN-LAST:event_itMnRelatComMouseClicked

    private void itMnRelatComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itMnRelatComActionPerformed
        FormRelatComissao.geraFormRelatComissao().setVisible(true);
    }//GEN-LAST:event_itMnRelatComActionPerformed

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
       
    }//GEN-LAST:event_menuAjudaActionPerformed

    private void menuAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAjudaMouseClicked
         FormAjuda.geraFormAjuda().setVisible(true);
    }//GEN-LAST:event_menuAjudaMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMnPrinc;
    private javax.swing.JMenuItem itMnPV;
    private javax.swing.JMenuItem itMnPm;
    private javax.swing.JMenuItem itMnProc;
    private javax.swing.JMenuItem itMnRAM;
    private javax.swing.JMenuItem itMnRelatCom;
    private javax.swing.JMenuItem itMnRelatEstoque;
    private javax.swing.JMenuItem itMnRelatVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuRelat;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuVender;
    // End of variables declaration//GEN-END:variables
}
