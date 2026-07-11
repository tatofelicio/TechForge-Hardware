//OTÁVIO FELÍCIO 2768488

import javax.swing.table.DefaultTableModel;

public class FormRelatVenda extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormRelatVenda.class.getName());
    
    private BDVendas bdVendas = BDVendas.geraBDVendas();


    private static FormRelatVenda formRelatVendaUnic;

    private FormRelatVenda() {
        initComponents();
        gerarRelatorioVendas(); 
    }

    //MÉTODO SINGLETON
    public static FormRelatVenda geraFormRelatVenda() {
        if (formRelatVendaUnic == null) {
            formRelatVendaUnic = new FormRelatVenda();
        }
        return formRelatVendaUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabRelatorio = new javax.swing.JTable();
        rotTitulo = new javax.swing.JLabel();
        rotTotalVendas = new javax.swing.JLabel();
        rotReceitaTotal = new javax.swing.JLabel();
        cxTotalVendas = new javax.swing.JTextField();
        cxReceitaTotal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "VENDEDOR", "CLIENTE", "CPF", "END. ENTREGA", "TELEFONE", "QTD ITENS", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabRelatorio);

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rotTitulo.setText("HISTÓRICO DE VENDAS");

        rotTotalVendas.setText("TOTAL DE VENDAS");

        rotReceitaTotal.setText("RECEITA TOTAL");

        cxTotalVendas.setEditable(false);

        cxReceitaTotal.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(rotTotalVendas)
                .addGap(18, 18, 18)
                .addComponent(cxTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 268, Short.MAX_VALUE)
                .addComponent(rotReceitaTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cxReceitaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(rotTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(rotTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTotalVendas)
                    .addComponent(rotReceitaTotal)
                    .addComponent(cxTotalVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxReceitaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

public void gerarRelatorioVendas() {

    DefaultTableModel modTab = (DefaultTableModel) tabRelatorio.getModel();
    

    modTab.setRowCount(0);

    double montanteFinanceiro = 0.0;
    int contadorVendas = 0;


    for (Venda v : bdVendas.consultarTodos()) {
        
        Cliente c = (Cliente) v.getComprador();
        

        modTab.addRow(new Object[]{
            v.getIdVenda(),
            v.getAtendente().getNome(), //Reflexividade
            v.getComprador().getNome(), //Reflexividade
            v.getComprador().getCpf(), //Reflexividade
            c.getTelefone(),
            c.getEnderecoEntrega(),
            v.getCarrinho().size(),
            String.format("%.2f", v.getValorTotal())
        });
        
        montanteFinanceiro += v.getValorTotal(); 
        contadorVendas++;
    }

    // 4. Atualiza os totais no rodapé
    cxTotalVendas.setText(String.valueOf(contadorVendas));
    cxReceitaTotal.setText(String.format("R$ %.2f", montanteFinanceiro));
}
    @Override
    public void setVisible(boolean visible) {
        if (visible == true) {
            gerarRelatorioVendas(); // Força a atualização toda vez que a tela for aberta
        }
        super.setVisible(visible); 
    }

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
        java.awt.EventQueue.invokeLater(() -> new FormRelatVenda().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cxReceitaTotal;
    private javax.swing.JTextField cxTotalVendas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotReceitaTotal;
    private javax.swing.JLabel rotTitulo;
    private javax.swing.JLabel rotTotalVendas;
    private javax.swing.JTable tabRelatorio;
    // End of variables declaration//GEN-END:variables
}
