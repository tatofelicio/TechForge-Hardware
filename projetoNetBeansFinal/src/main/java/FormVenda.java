//OTÁVIO FELÍCIO 2768488

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormVenda extends javax.swing.JFrame {

    private BDEstoque bd = BDEstoque.geraBDEstoque();
    private BDVendas bdv = BDVendas.geraBDVendas();

    private Venda vendaAtual = new Venda();

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormVenda.class.getName());

    public static FormVenda formVendaUnic;

    private FormVenda() {
        initComponents();
    }

    //MÉTODO SINGLETON
    public static FormVenda geraFormVenda() {
        if (formVendaUnic == null) {

            formVendaUnic = new FormVenda();
        }
        return formVendaUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        rotTitulo = new javax.swing.JLabel();
        rotMatVendedor = new javax.swing.JLabel();
        rotNomeVendedor = new javax.swing.JLabel();
        rotCpfCliente = new javax.swing.JLabel();
        rotNomeCliente = new javax.swing.JLabel();
        cxMatVendedor = new javax.swing.JTextField();
        cxNomeVendedor = new javax.swing.JTextField();
        cxCpfCliente = new javax.swing.JTextField();
        cxEnderCliente = new javax.swing.JTextField();
        btVerCatalogo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabCarrinho = new javax.swing.JTable();
        rotTituloCar = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btFinalizar = new javax.swing.JButton();
        btInserirItem = new javax.swing.JButton();
        btRemoverItem = new javax.swing.JButton();
        rotEnderCliente = new javax.swing.JLabel();
        rotTelCliente = new javax.swing.JLabel();
        cxNomeCliente = new javax.swing.JTextField();
        cxTelCliente = new javax.swing.JTextField();
        rotTotal = new javax.swing.JLabel();
        cxTotal = new javax.swing.JTextField();
        rotObs = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rotTitulo.setText("VENDAS");

        rotMatVendedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotMatVendedor.setText("MATRICULA VENDEDOR");

        rotNomeVendedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNomeVendedor.setText("NOME VENDEDOR");

        rotCpfCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotCpfCliente.setText("CPF CLIENTE");

        rotNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotNomeCliente.setText("NOME CLIENTE");

        cxMatVendedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxMatVendedor.addActionListener(this::cxMatVendedorActionPerformed);

        cxNomeVendedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxNomeVendedor.addActionListener(this::cxNomeVendedorActionPerformed);

        cxCpfCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxCpfCliente.addActionListener(this::cxCpfClienteActionPerformed);

        cxEnderCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxEnderCliente.addActionListener(this::cxEnderClienteActionPerformed);

        btVerCatalogo.setText("VER CATÁLOGO");
        btVerCatalogo.addActionListener(this::btVerCatalogoActionPerformed);

        tabCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "PREÇO", "QUANTIDADE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabCarrinho);

        rotTituloCar.setText("CARRINHO");

        btCancelar.setBackground(new java.awt.Color(255, 204, 204));
        btCancelar.setText("CANCELAR");
        btCancelar.addActionListener(this::btCancelarActionPerformed);

        btFinalizar.setBackground(new java.awt.Color(204, 255, 204));
        btFinalizar.setText("FINALIZAR COMPRA");
        btFinalizar.addActionListener(this::btFinalizarActionPerformed);

        btInserirItem.setText("INSERIR ITEM");
        btInserirItem.addActionListener(this::btInserirItemActionPerformed);

        btRemoverItem.setText("REMOVER ITEM");
        btRemoverItem.addActionListener(this::btRemoverItemActionPerformed);

        rotEnderCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotEnderCliente.setText("ENDEREÇO CLIENTE");

        rotTelCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rotTelCliente.setText("TELEFONE CLIENTE");

        cxNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxNomeCliente.addActionListener(this::cxNomeClienteActionPerformed);

        cxTelCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cxTelCliente.addActionListener(this::cxTelClienteActionPerformed);

        rotTotal.setText("TOTAL:");

        cxTotal.setEditable(false);
        cxTotal.addActionListener(this::cxTotalActionPerformed);

        rotObs.setText("OBS: Vendas acima de R$5000 geram comissão ao vendedor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(rotTitulo)
                .addGap(234, 234, 234))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotNomeVendedor)
                            .addComponent(rotCpfCliente)
                            .addComponent(rotNomeCliente)
                            .addComponent(rotEnderCliente)
                            .addComponent(rotTelCliente)
                            .addComponent(rotMatVendedor))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cxEnderCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(cxNomeCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxCpfCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxNomeVendedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxMatVendedor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxTelCliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(rotTituloCar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(rotObs))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btVerCatalogo)
                                .addGap(62, 62, 62)
                                .addComponent(btInserirItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btRemoverItem))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelar)
                                .addGap(50, 50, 50)
                                .addComponent(btFinalizar)
                                .addGap(37, 37, 37)
                                .addComponent(rotTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cxTotal))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(rotTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotMatVendedor)
                    .addComponent(cxMatVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNomeVendedor)
                    .addComponent(cxNomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotCpfCliente)
                    .addComponent(cxCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNomeCliente)
                    .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotEnderCliente)
                    .addComponent(cxEnderCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotTelCliente)
                    .addComponent(cxTelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotObs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVerCatalogo)
                    .addComponent(btInserirItem)
                    .addComponent(btRemoverItem))
                .addGap(18, 18, 18)
                .addComponent(rotTituloCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btFinalizar)
                    .addComponent(rotTotal)
                    .addComponent(cxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfClienteActionPerformed

    private void cxEnderClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEnderClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEnderClienteActionPerformed

    private void cxMatVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxMatVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxMatVendedorActionPerformed

    private void cxNomeVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeVendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeVendedorActionPerformed

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        finalizarCompra();
    }//GEN-LAST:event_btFinalizarActionPerformed
    public void finalizarCompra() {
        try {

            if (vendaAtual.getCarrinho().isEmpty()) {
                JOptionPane.showMessageDialog(this, "O carrinho está vazio! Adicione produtos antes de finalizar.", "Carrinho Vazio", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String matriculaDigitada = cxMatVendedor.getText().trim();
            String nomeDigitado = cxNomeVendedor.getText().trim();

            for (Venda vendaPassada : bdv.consultarTodos()) {
                if (vendaPassada.getAtendente().getMatricula().equals(matriculaDigitada)) { //REFLEXIVIDADE
                    if (!vendaPassada.getAtendente().getNome().equalsIgnoreCase(nomeDigitado)) { //REFLEXIVIDADE

                        JOptionPane.showMessageDialog(this,
                                "Conflito de Funcionário!\nA matrícula " + matriculaDigitada
                                + " já está registrada para o vendedor: " + vendaPassada.getAtendente().getNome() //REFLEXIVIDADE
                                + ".\nVocê não pode usá-la para " + nomeDigitado + ".",
                                "Matrícula Duplicada", JOptionPane.ERROR_MESSAGE);

                        cxMatVendedor.requestFocus();
                        return; 
                    }
                    break; 
                }
            }

            vendaAtual.getAtendente().setMatricula(matriculaDigitada);
            vendaAtual.getAtendente().setNome(nomeDigitado);

            vendaAtual.getAtendente().setMatricula(cxMatVendedor.getText());
            vendaAtual.getAtendente().setNome(cxNomeVendedor.getText());
            vendaAtual.getComprador().setCpf(cxCpfCliente.getText());
            vendaAtual.getComprador().setNome(cxNomeCliente.getText());

            Cliente c = (Cliente) vendaAtual.getComprador();
            c.setTelefone(cxTelCliente.getText());
            c.setEnderecoEntrega(cxEnderCliente.getText());

            int confirmacao = JOptionPane.showConfirmDialog(this,
                    "Confirma o fechamento desta venda no valor de R$ " + vendaAtual.getValorTotal() + "?",
                    "Confirmar Venda",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacao == JOptionPane.YES_OPTION) {
                processarPagamentoEBaixa();
            }

        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Erro nos dados preenchidos:\n" + e.getMessage(), "Dados Inválidos", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro crítico ao finalizar: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void btVerCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerCatalogoActionPerformed
        FormRelatEstoque.geraFormRelatEstoque().setVisible(true);
    }//GEN-LAST:event_btVerCatalogoActionPerformed

    private void cxNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeClienteActionPerformed

    private void cxTelClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTelClienteActionPerformed

    private void btInserirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirItemActionPerformed
        insereItem();
    }//GEN-LAST:event_btInserirItemActionPerformed

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverItemActionPerformed
        removeItem();
    }//GEN-LAST:event_btRemoverItemActionPerformed

    private void cxTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTotalActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        int resp = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente cancelar a compra?",
                "Cancelamento da compra",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            dispose();
        }
    }//GEN-LAST:event_btCancelarActionPerformed
    public void removeItem() {
        if (vendaAtual.getCarrinho().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O carrinho já está vazio!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String entrada = JOptionPane.showInputDialog(this, "Digite o ID do produto para remover:", "Remover Item", JOptionPane.QUESTION_MESSAGE);

        if (entrada != null && !entrada.trim().isEmpty()) {
            try {
                int idBusca = Integer.parseInt(entrada.trim());

                Hardware itemParaRemover = null;

                for (Hardware item : vendaAtual.getCarrinho()) {
                    if (item.getId() == idBusca) {
                        itemParaRemover = item;
                        break;
                    }
                }

                if (itemParaRemover != null) {
                    vendaAtual.getCarrinho().remove(itemParaRemover);

                    atualizarCarrinho();

                    JOptionPane.showMessageDialog(this, "Item removido do carrinho com sucesso!", "Removido", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "O ID digitado não está presente no carrinho!", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, digite apenas números inteiros para o ID.", "ID Inválido", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public void insereItem() {
        String entrada = JOptionPane.showInputDialog(this, "Digite o ID do produto:", "Inserir Item", JOptionPane.QUESTION_MESSAGE);

        if (entrada != null && !entrada.trim().isEmpty()) {
            try {
                int idBusca = Integer.parseInt(entrada.trim());

                Hardware produtoEncontrado = bd.consultarPorId(idBusca);

                if (produtoEncontrado != null) {
                    if (produtoEncontrado.getQtdEstoque() > 0) {

                        vendaAtual.adicionarItem(produtoEncontrado);
                        atualizarCarrinho();

                    } else {
                        JOptionPane.showMessageDialog(this, "A peça " + produtoEncontrado.getNome() + " está esgotada no estoque físico!", "Estoque Vazio", JOptionPane.WARNING_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Produto não encontrado! Verifique o ID.", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, digite apenas números inteiros para o ID.", "ID Inválido", JOptionPane.WARNING_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void atualizarCarrinho() {
        DefaultTableModel modTab = (DefaultTableModel) tabCarrinho.getModel();
        modTab.setRowCount(0);

        double valorTotalCompra = 0.0;

        for (Hardware item : vendaAtual.getCarrinho()) {
            modTab.addRow(new Object[]{
                item.getId(),
                item.getNome(),
                String.format("R$ %.2f", item.getPreco()),
                1
            });

            valorTotalCompra += item.getPreco();

        }
        cxTotal.setText(String.format("%.2f", valorTotalCompra));
    }

    private void processarPagamentoEBaixa() {
        try {
            for (Hardware itemVendido : vendaAtual.getCarrinho()) {

                Hardware pecaRealNoBanco = bd.consultarPorId(itemVendido.getId());

                pecaRealNoBanco.setQtdEstoque(pecaRealNoBanco.getQtdEstoque() - 1);

                if (pecaRealNoBanco.getQtdEstoque() == 0) {
                    bd.excluir(pecaRealNoBanco.getId());
                }
            }

            JOptionPane.showMessageDialog(this, "Venda finalizada com sucesso!\nTotal: R$ " + vendaAtual.getValorTotal(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            BDVendas.geraBDVendas().inserir(vendaAtual);
            double valorVenda = vendaAtual.getValorTotal();
            String matriculaVendedor = vendaAtual.getAtendente().getMatricula();

            if (valorVenda > 5000) {
                double bonus = 0.0;

                bonus = valorVenda * 0.01;

                BDVendas.geraBDVendas().registrarComissao(matriculaVendedor, bonus);
            }
            limparTelaVenda();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao processar baixa de estoque: " + e.getMessage(), "Erro Interno", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparTelaVenda() {
        vendaAtual = new Venda();

        cxMatVendedor.setText("");
        cxNomeVendedor.setText("");
        cxCpfCliente.setText("");
        cxNomeCliente.setText("");
        cxTelCliente.setText("");
        cxEnderCliente.setText("");

        atualizarCarrinho();

        cxCpfCliente.requestFocus();
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
        java.awt.EventQueue.invokeLater(() -> new FormVenda().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btInserirItem;
    private javax.swing.JButton btRemoverItem;
    private javax.swing.JButton btVerCatalogo;
    private javax.swing.JTextField cxCpfCliente;
    private javax.swing.JTextField cxEnderCliente;
    private javax.swing.JTextField cxMatVendedor;
    private javax.swing.JTextField cxNomeCliente;
    private javax.swing.JTextField cxNomeVendedor;
    private javax.swing.JTextField cxTelCliente;
    private javax.swing.JTextField cxTotal;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCpfCliente;
    private javax.swing.JLabel rotEnderCliente;
    private javax.swing.JLabel rotMatVendedor;
    private javax.swing.JLabel rotNomeCliente;
    private javax.swing.JLabel rotNomeVendedor;
    private javax.swing.JLabel rotObs;
    private javax.swing.JLabel rotTelCliente;
    private javax.swing.JLabel rotTitulo;
    private javax.swing.JLabel rotTituloCar;
    private javax.swing.JLabel rotTotal;
    private javax.swing.JTable tabCarrinho;
    // End of variables declaration//GEN-END:variables
}
