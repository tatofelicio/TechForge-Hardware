//OTÁVIO FELÍCIO 2768488

import javax.swing.table.DefaultTableModel;


public class FormRelatEstoque extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormRelatEstoque.class.getName());


    private BDEstoque bd = BDEstoque.geraBDEstoque();


    private static FormRelatEstoque formRelatUnic;


    private FormRelatEstoque() {
        initComponents();
        gerarRelatorio();
    }

    //MÉTODO SINGLETON
    public static FormRelatEstoque geraFormRelatEstoque() {
        if (formRelatUnic == null) {
            formRelatUnic = new FormRelatEstoque();
        }
        return formRelatUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboFiltro = new javax.swing.JComboBox<>();
        rotFiltrar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabRelatorio = new javax.swing.JTable();
        rotTotalItens = new javax.swing.JLabel();
        rotValorTotal = new javax.swing.JLabel();
        cxTotalItens = new javax.swing.JTextField();
        cxValorTotal = new javax.swing.JTextField();
        btFiltrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Processador", "Placa de Vídeo", "Placa Mãe", "Memória RAM" }));
        comboFiltro.addActionListener(this::comboFiltroActionPerformed);

        rotFiltrar.setText("FILTRAR POR:");

        tabRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabRelatorio);

        rotTotalItens.setText("TOTAL DE ITENS");

        rotValorTotal.setText("VALOR TOTAL");

        cxTotalItens.setEditable(false);
        cxTotalItens.addActionListener(this::cxTotalItensActionPerformed);

        cxValorTotal.setEditable(false);
        cxValorTotal.addActionListener(this::cxValorTotalActionPerformed);

        btFiltrar.setText("FILTRAR");
        btFiltrar.addActionListener(this::btFiltrarActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("ESTOQUE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btFiltrar)
                                .addGap(164, 164, 164)
                                .addComponent(rotFiltrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(rotTotalItens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxTotalItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rotValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rotFiltrar)
                    .addComponent(btFiltrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTotalItens)
                    .addComponent(rotValorTotal)
                    .addComponent(cxTotalItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void btFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFiltrarActionPerformed
        gerarRelatorio();
    }//GEN-LAST:event_btFiltrarActionPerformed

    private void cxTotalItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTotalItensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTotalItensActionPerformed

    private void cxValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxValorTotalActionPerformed
    public void gerarRelatorio() {
        DefaultTableModel modTab = new DefaultTableModel();
        String filtro = comboFiltro.getSelectedItem().toString();

        if (filtro.equals("Geral")) {
            modTab.setColumnIdentifiers(new Object[]{"ID", "Tipo", "Nome", "Qtd", "Preço (R$)", "Marca", "CNPJ"});

        } else if (filtro.equals("Processador")) {
            modTab.setColumnIdentifiers(new Object[]{"ID", "Nome", "Qtd", "Preço", "Marca", "CNPJ", "Núcleos", "Frequência (GHz)"});

        } else if (filtro.equals("Placa de Vídeo")) {
            modTab.setColumnIdentifiers(new Object[]{"ID", "Nome", "Qtd", "Preço", "Marca", "CNPJ", "VRAM (GB)", "Consumo (W)"});

        } else if (filtro.equals("Placa Mãe")) {
            modTab.setColumnIdentifiers(new Object[]{"ID", "Nome", "Qtd", "Preço", "Marca", "CNPJ", "Socket", "Dimensão"});

        } else if (filtro.equals("Memória RAM")) {
            modTab.setColumnIdentifiers(new Object[]{"ID", "Nome", "Qtd", "Preço", "Marca", "CNPJ", "Capacidade (GB)", "Tecnologia"});
        }


        int totalItensFisicos = 0;
        double valorTotalEstoque = 0.0;

        for (Hardware h : bd.consultarTodos()) {


            int id = h.getId();
            String tipo = h.getTipoComponente();
            String nome = h.getNome();
            int qtd = h.getQtdEstoque();
            double preco = h.getPreco();
            String marca = h.getFabricante().getMarca(); //REFLEXIVIDADE
            String cnpj = h.getFabricante().getCnpj(); //REFLEXIVIDADE

            if (filtro.equals("Geral")) {
                modTab.addRow(new Object[]{id, tipo, nome, qtd, preco, marca, cnpj});


                totalItensFisicos += qtd;
                valorTotalEstoque += (preco * qtd);

            } else if (filtro.equals("Processador") && h instanceof Processador p) {
                modTab.addRow(new Object[]{id, nome, qtd, preco, marca, cnpj, p.getQtdNucleos(), p.getFrequencia()});
                totalItensFisicos += qtd;
                valorTotalEstoque += (preco * qtd);

            } else if (filtro.equals("Placa de Vídeo") && h instanceof PlacaDeVideo pv) {
                modTab.addRow(new Object[]{id, nome, qtd, preco, marca, cnpj, pv.getVeramGb(), pv.getConsumoWatts()});
                totalItensFisicos += qtd;
                valorTotalEstoque += (preco * qtd);

            } else if (filtro.equals("Placa Mãe") && h instanceof PlacaMae pm) {
                modTab.addRow(new Object[]{id, nome, qtd, preco, marca, cnpj, pm.getSocket(), pm.getDimensao()});
                totalItensFisicos += qtd;
                valorTotalEstoque += (preco * qtd);

            } else if (filtro.equals("Memória RAM") && h instanceof MemoriaRam ram) {
                modTab.addRow(new Object[]{id, nome, qtd, preco, marca, cnpj, ram.getCapacidade(), ram.getTecMemoria()});
                totalItensFisicos += qtd;
                valorTotalEstoque += (preco * qtd);
            }
        }

        tabRelatorio.setModel(modTab);


        cxTotalItens.setText(String.valueOf(totalItensFisicos));
        cxValorTotal.setText(String.format("R$ %.2f", valorTotalEstoque));
    }


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
        java.awt.EventQueue.invokeLater(() -> new FormRelatEstoque().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFiltrar;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JTextField cxTotalItens;
    private javax.swing.JTextField cxValorTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotFiltrar;
    private javax.swing.JLabel rotTotalItens;
    private javax.swing.JLabel rotValorTotal;
    private javax.swing.JTable tabRelatorio;
    // End of variables declaration//GEN-END:variables
}
