//OTÁVIO FELÍCIO 2768488

public class FormSobre extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormSobre.class.getName());

    private static FormSobre formSobreUnic;
    
    
    private FormSobre() {
        initComponents();
    }

    //MÉTODO SINGLETON
    public static FormSobre geraFormSobre() {
        if ( formSobreUnic == null) {
            formSobreUnic = new FormSobre();
        }
        return  formSobreUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtSobreNos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtSobreNos.setEditable(false);
        txtSobreNos.setColumns(20);
        txtSobreNos.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        txtSobreNos.setLineWrap(true);
        txtSobreNos.setRows(5);
        txtSobreNos.setText("   A TechForge Hardware nasceu com o objetivo de oferecer soluções de qualidade para quem busca desempenho confiança e tecnologia.\n\n   Somos uma loja especializada em componentes e equipamentos de hardware trabalhando com produtos como processadores, placas de vídeo, memórias RAM, periféricos, acessórios e peças essenciais para computadores.\n\n    Nosso compromisso é atender cada cliente com responsabilidade, transparência e dedicação, ajudando na escolha dos melhores produtos de acordo com suas necessidades\n\n   Seja para montar um computador gamer, melhorar o desempenho de uma máquina,realizar manutenção ou atualizar equipamentos, a TechForge Hardware está pronta \n\n\"TechForge Hardware — potência que conecta o futuro.\"");
        txtSobreNos.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtSobreNos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("SOBRE NÓS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
        java.awt.EventQueue.invokeLater(() -> new FormSobre().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtSobreNos;
    // End of variables declaration//GEN-END:variables
}
