//OTÁVIO FELÍCIO 2768488

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormPlacaDeVideo extends javax.swing.JFrame {
    
    

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormPlacaDeVideo.class.getName());


    private BDEstoque bd = BDEstoque.geraBDEstoque(); 


    private static FormPlacaDeVideo formPVUnic;


    private FormPlacaDeVideo() {
        initComponents();
    }

    //MÉTODO SINGLETON
    public static FormPlacaDeVideo geraFormPlacaDeVideo() {
        if (formPVUnic == null) {
            formPVUnic = new FormPlacaDeVideo();
        }
        return formPVUnic;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotTitulo = new javax.swing.JLabel();
        rotNome = new javax.swing.JLabel();
        rotQtd = new javax.swing.JLabel();
        rotPreco = new javax.swing.JLabel();
        rotMarca = new javax.swing.JLabel();
        rotCnpj = new javax.swing.JLabel();
        rotVram = new javax.swing.JLabel();
        rotWatts = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxQtd = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxMarca = new javax.swing.JTextField();
        cxCnpj = new javax.swing.JTextField();
        cxVram = new javax.swing.JTextField();
        cxWatts = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        rotID = new javax.swing.JLabel();
        cxID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabResumo = new javax.swing.JTable();
        btMaisInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rotTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rotTitulo.setText("GERENCIAMENTO PLACA DE VIDEO");

        rotNome.setText("NOME");

        rotQtd.setText("QUANTIDADE");

        rotPreco.setText("PREÇO");

        rotMarca.setText("MARCA");

        rotCnpj.setText("CNPJ (OPCIONAL)");

        rotVram.setText("VRAM");

        rotWatts.setText("WATTS");

        cxNome.addActionListener(this::cxNomeActionPerformed);

        cxPreco.addActionListener(this::cxPrecoActionPerformed);

        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(this::btCadastrarActionPerformed);

        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(this::btLimparActionPerformed);

        btSair.setBackground(new java.awt.Color(255, 204, 204));
        btSair.setText("SAIR");
        btSair.addActionListener(this::btSairActionPerformed);

        btDeletar.setText("DELETAR");
        btDeletar.addActionListener(this::btDeletarActionPerformed);

        btModificar.setText("MODIFICAR");
        btModificar.addActionListener(this::btModificarActionPerformed);

        btConsultar.setText("CONSULTAR");
        btConsultar.addActionListener(this::btConsultarActionPerformed);

        rotID.setText("ID");

        cxID.addActionListener(this::cxIDActionPerformed);

        tabResumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NOME"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabResumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabResumoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabResumo);

        btMaisInfo.setText("MAIS INFORMAÇÕES");
        btMaisInfo.addActionListener(this::btMaisInfoActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotNome)
                            .addComponent(rotQtd)
                            .addComponent(rotID))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cxQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotPreco)
                            .addComponent(rotMarca))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rotCnpj)
                            .addComponent(rotVram)
                            .addComponent(rotWatts))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxVram, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxWatts, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(btModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btLimpar)
                        .addGap(74, 74, 74)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(rotTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btMaisInfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotTitulo)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rotID)
                    .addComponent(cxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotNome)
                    .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotQtd)
                            .addComponent(cxQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotPreco)
                            .addComponent(cxPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btDeletar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rotMarca)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btModificar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotCnpj)
                            .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rotVram)
                            .addComponent(cxVram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btConsultar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(rotWatts))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxWatts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btMaisInfo)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPrecoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        insPV();
    }//GEN-LAST:event_btCadastrarActionPerformed
    public void insPV() {
        PlacaDeVideo pv = new PlacaDeVideo();
        try {

            if (!cxID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Atenção: O ID é gerado automaticamente. O campo ID será ignorado na inserção.");
            }
            pv.setNome(cxNome.getText());
            pv.setPreco(Double.parseDouble(cxPreco.getText()));
            pv.setQtdEstoque(Integer.parseInt(cxQtd.getText()));

            pv.getFabricante().setMarca(cxMarca.getText()); //RELEXIVIDADE
            pv.getFabricante().setCnpj(cxCnpj.getText()); //RELEXIVIDADE

            pv.setVeramGb(Integer.parseInt(cxVram.getText()));
            pv.setConsumoWatts(Double.parseDouble(cxWatts.getText()));


            bd.inserir(pv);


            JOptionPane.showMessageDialog(this, pv.getTipoComponente() + " cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limpar();
            int resposta = JOptionPane.showConfirmDialog(this,
                    "Deseja aplicar um desconto promocional de 5% neste produto?",
                    "Promoção",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                try {

                    pv.aplicarDesconto();

                    bd.alterar(pv.getId(), pv);

                    JOptionPane.showMessageDialog(this, "Desconto aplicado com sucesso! Novo preço: R$ " + pv.getPreco());
                    atualizarTabResumo(); // Atualiza a tabela com o novo valor

                } catch (PrecoInvalidoException e) {

                    JOptionPane.showMessageDialog(this, e.getMessage(), "Erro no Desconto", JOptionPane.ERROR_MESSAGE);
                }
            }

            atualizarTabResumo();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro: Verifique se os campos numéricos estão preenchidos corretamente (sem letras).", "Erro de Digitação", JOptionPane.ERROR_MESSAGE);

        } catch (PrecoInvalidoException ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage(), "Preço Inválido", JOptionPane.WARNING_MESSAGE);
            cxPreco.requestFocus(); 

        } catch (EstoqueInvalidoException ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage(), "Estoque Inválido", JOptionPane.WARNING_MESSAGE);
            cxQtd.requestFocus(); 

        } catch (EstoqueExcedidoException ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage(), "Limite Excedido", JOptionPane.WARNING_MESSAGE);
            cxQtd.requestFocus();

        } catch (IllegalArgumentException ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        }

    }
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed
    public void limpar() {
        cxID.setText("");
        cxNome.setText("");
        cxQtd.setText("");
        cxPreco.setText("");
        cxMarca.setText("");
        cxCnpj.setText("");
        cxVram.setText("");
        cxWatts.setText("");
        cxNome.requestFocus();
    }
    private void cxNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        del();
        limpar();
        atualizarTabResumo();
    }//GEN-LAST:event_btDeletarActionPerformed
    public void del() {
        try {

            int idBusca = Integer.parseInt(cxID.getText());

            Hardware h = bd.consultarPorId(idBusca);
 
            if (h == null) {
                JOptionPane.showMessageDialog(this, "Erro: Nenhum produto encontrado com este ID.", "Não Encontrado", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!(h instanceof PlacaDeVideo)) {
                JOptionPane.showMessageDialog(this, "Atenção: O ID digitado pertence a outro tipo de peça (" + h.getTipoComponente() + "), não a uma Placa Mãe.", "Tipo Incompatível", JOptionPane.WARNING_MESSAGE);
                return;
            }
 
 
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir este produto (" + h.getTipoComponente() + ") de ID " + idBusca + "?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
 
            if (resposta == JOptionPane.YES_OPTION) {

                boolean apagou = bd.excluir(idBusca);
 
                if (apagou) {
                    JOptionPane.showMessageDialog(this, "Produto excluído com sucesso do estoque.", "Excluído", JOptionPane.INFORMATION_MESSAGE);
                    atualizarTabResumo();
                } else {
                    JOptionPane.showMessageDialog(this, "Erro: Nenhum produto encontrado com este ID.", "Não Encontrado", JOptionPane.WARNING_MESSAGE);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Para excluir, digite um número de ID válido na caixa correspondente.", "ID Inválido", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void atualizarTabResumo() {
        DefaultTableModel modTab = (DefaultTableModel) tabResumo.getModel();
        int posLin = 0;


        modTab.setRowCount(posLin);


        for (Hardware h : bd.consultarTodos()) {
            if (h instanceof PlacaDeVideo) {
    
                modTab.insertRow(posLin, new Object[]{h.getId(), h.getNome()});
                posLin++;
            }
        }
    }

    public void selectTab() {
        String valLin = "";
        int posLin = tabResumo.getSelectedRow();


        for (int col = 0; col < tabResumo.getColumnCount(); col++) {
            valLin += tabResumo.getModel().getValueAt(posLin, col).toString();

            if (col + 1 < tabResumo.getColumnCount()) {
                valLin += " - "; 
            }
        }


        JOptionPane.showMessageDialog(
                this,
                "gettipo Selecionado: \n" + valLin,
                "Seleção em Tabela",
                1 
        );
    }

    private void cxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxIDActionPerformed

    private void tabResumoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabResumoMouseClicked
        selectTab();
    }//GEN-LAST:event_tabResumoMouseClicked

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        consultar();
    }

    public void consultar() {
        try {
            int idBusca = Integer.parseInt(cxID.getText());
            Hardware h = bd.consultarPorId(idBusca);
            if (h != null) {
    
                if (h instanceof PlacaDeVideo) {


                    PlacaDeVideo pv = (PlacaDeVideo) h;

 
                    cxNome.setText(pv.getNome());
                    cxPreco.setText(String.valueOf(pv.getPreco())); 
                    cxQtd.setText(String.valueOf(pv.getQtdEstoque()));
                    cxMarca.setText(pv.getFabricante().getMarca()); //RELEXIVIDADE
                    cxCnpj.setText(pv.getFabricante().getCnpj()); //RELEXIVIDADE

                    cxVram.setText(String.valueOf(pv.getVeramGb()));
                    cxWatts.setText(String.valueOf(pv.getConsumoWatts()));

                } else {
                    JOptionPane.showMessageDialog(this, "Atenção: O ID digitado pertence a outro tipo de peça (Ex: Processador), não a um(a) " + h.getTipoComponente() , "Tipo Incompatível", JOptionPane.WARNING_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Nenhum produto encontrado com este ID.", "Não Encontrado", JOptionPane.WARNING_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Para consultar, digite um número de ID válido na caixa correspondente.", "ID Inválido", JOptionPane.ERROR_MESSAGE);
            cxID.requestFocus(); 
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        modificar();
    }

   public void modificar() {
    try {
        String entraId = JOptionPane.showInputDialog(this, "Digite o ID da Placa de Vídeo que deseja alterar:", "Modificar", JOptionPane.QUESTION_MESSAGE);
        
        if (entraId == null || entraId.trim().isEmpty()) {
            return; 
        }
        
        int idBusca = Integer.parseInt(entraId.trim());
        Hardware pecaExistente = bd.consultarPorId(idBusca);

        if (pecaExistente != null && pecaExistente instanceof PlacaDeVideo) {
            PlacaDeVideo pvAtualizada = (PlacaDeVideo) pecaExistente;

            String novoNome = JOptionPane.showInputDialog(this, "Informe o novo NOME (ou deixe em branco para manter):", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            if (novoNome != null && !novoNome.trim().isEmpty()) pvAtualizada.setNome(novoNome);

            String novoPreco = JOptionPane.showInputDialog(this, "Informe o novo PREÇO:", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            if (novoPreco != null && !novoPreco.trim().isEmpty()) pvAtualizada.setPreco(Double.parseDouble(novoPreco.replace(",", ".")));

            String novaQtd = JOptionPane.showInputDialog(this, "Informe a nova QUANTIDADE em estoque:", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            if (novaQtd != null && !novaQtd.trim().isEmpty()) pvAtualizada.setQtdEstoque(Integer.parseInt(novaQtd));

            String novaMarca = JOptionPane.showInputDialog(this, "Informe a nova MARCA do fabricante:", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            if (novaMarca != null && !novaMarca.trim().isEmpty()) pvAtualizada.getFabricante().setMarca(novaMarca); //RELEXIVIDADE

            String novoCnpj = JOptionPane.showInputDialog(this, "Informe o novo CNPJ do fabricante:", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            if (novoCnpj != null && !novoCnpj.trim().isEmpty()) pvAtualizada.getFabricante().setCnpj(novoCnpj); //RELEXIVIDADE

            // Dados Específicos da Placa de Vídeo
            String vram = JOptionPane.showInputDialog(this, "Informe a nova VRAM (GB):", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            if (vram != null && !vram.trim().isEmpty()) pvAtualizada.setVeramGb(Integer.parseInt(vram));

            String consumo = JOptionPane.showInputDialog(this, "Informe o novo CONSUMO (Watts):", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
            if (consumo != null && !consumo.trim().isEmpty()) pvAtualizada.setConsumoWatts(Double.parseDouble(consumo.replace(",", ".")));

            bd.alterar(idBusca, pvAtualizada);

            JOptionPane.showMessageDialog(this, "Placa de Vídeo atualizada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabResumo(); 

        } else {
            JOptionPane.showMessageDialog(this, "Placa de Vídeo não encontrada com o ID: " + idBusca, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro: Verifique se os campos numéricos estão preenchidos corretamente (sem letras).", "Erro de Digitação", JOptionPane.ERROR_MESSAGE);

        } catch (PrecoInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Preço Inválido", JOptionPane.WARNING_MESSAGE);
            cxPreco.requestFocus();

        } catch (EstoqueInvalidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Estoque Inválido", JOptionPane.WARNING_MESSAGE);
            cxQtd.requestFocus();

        } catch (EstoqueExcedidoException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Limite Excedido", JOptionPane.WARNING_MESSAGE);
            cxQtd.requestFocus();

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro de Validação", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btModificarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        sair();
    }//GEN-LAST:event_btSairActionPerformed

    private void btMaisInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisInfoActionPerformed
        FormRelatEstoque.geraFormRelatEstoque().setVisible(true);
    }//GEN-LAST:event_btMaisInfoActionPerformed
    public void sair() {
        int resp = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente sair?",
                "Saida do Sistema",
                JOptionPane.YES_NO_OPTION
        );
        if (resp == 0) {
            dispose();
        }
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
        java.awt.EventQueue.invokeLater(() -> new FormPlacaDeVideo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMaisInfo;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxCnpj;
    private javax.swing.JTextField cxID;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxQtd;
    private javax.swing.JTextField cxVram;
    private javax.swing.JTextField cxWatts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCnpj;
    private javax.swing.JLabel rotID;
    private javax.swing.JLabel rotMarca;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotPreco;
    private javax.swing.JLabel rotQtd;
    private javax.swing.JLabel rotTitulo;
    private javax.swing.JLabel rotVram;
    private javax.swing.JLabel rotWatts;
    private javax.swing.JTable tabResumo;
    // End of variables declaration//GEN-END:variables
}
