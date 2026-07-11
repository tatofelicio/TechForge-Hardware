//OTÁVIO FELÍCIO 2768488

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormProcessador extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormProcessador.class.getName());

    private BDEstoque bd = BDEstoque.geraBDEstoque();

    private static FormProcessador formProcUnic;

    private FormProcessador() {
        initComponents();
    }

    //MÉTODO SINGLETON
    public static FormProcessador geraFormProcessador() {
        if (formProcUnic == null) {
            formProcUnic = new FormProcessador();
        }
        return formProcUnic;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rotFormProc = new javax.swing.JLabel();
        rotNome = new javax.swing.JLabel();
        rotQtd = new javax.swing.JLabel();
        rotPreco = new javax.swing.JLabel();
        rotMarca = new javax.swing.JLabel();
        rotCnpj = new javax.swing.JLabel();
        rotNucleos = new javax.swing.JLabel();
        rotFreq = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxQtd = new javax.swing.JTextField();
        cxPreco = new javax.swing.JTextField();
        cxMarca = new javax.swing.JTextField();
        cxCnpj = new javax.swing.JTextField();
        cxNucleos = new javax.swing.JTextField();
        cxFreq = new javax.swing.JTextField();
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

        rotFormProc.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rotFormProc.setText("GERENCIAMENTO PROCESSADOR");

        rotNome.setText("NOME");

        rotQtd.setText("QUANTIDADE");

        rotPreco.setText("PREÇO");

        rotMarca.setText("MARCA");

        rotCnpj.setText("CNPJ (OPCIONAL)");

        rotNucleos.setText("NÚCLEOS");

        rotFreq.setText("FREQUÊNCIA");

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
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(rotNucleos)
                            .addComponent(rotFreq))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cxCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cxFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cxNucleos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rotFormProc)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btLimpar)
                        .addGap(74, 74, 74)
                        .addComponent(btSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btMaisInfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotFormProc)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                            .addComponent(rotNucleos)
                            .addComponent(cxNucleos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btConsultar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(rotFreq))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cxFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btMaisInfo)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btSair))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cxPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxPrecoActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        insere();
    }//GEN-LAST:event_btCadastrarActionPerformed
    public void insere() {
        Processador p = new Processador();
        try {
            if (!cxID.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Atenção: O ID é gerado automaticamente. O campo ID será ignorado na inserção.");
            }
            p.setNome(cxNome.getText());
            p.setPreco(Double.parseDouble(cxPreco.getText()));
            p.setQtdEstoque(Integer.parseInt(cxQtd.getText()));

            p.getFabricante().setMarca(cxMarca.getText()); //REFLEXIVIDADE
            p.getFabricante().setCnpj(cxCnpj.getText()); //REFLEXIVIDADE

            p.setQtdNucleos(Integer.parseInt(cxNucleos.getText()));
            p.setFrequencia(Double.parseDouble(cxFreq.getText()));

            bd.inserir(p);

            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso! (" + p.getTipoComponente() + ")", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limpar();
            int resposta = JOptionPane.showConfirmDialog(this,
                    "Deseja aplicar um desconto promocional de 7% neste produto?",
                    "Promoção",
                    JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    p.aplicarDesconto();
                    bd.alterar(p.getId(), p);

                    JOptionPane.showMessageDialog(this, "Desconto aplicado com sucesso! Novo preço: R$ " + p.getPreco());
                    atualizarTabResumo();

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
        cxNucleos.setText("");
        cxFreq.setText("");
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

            if (!(h instanceof Processador)) {
                JOptionPane.showMessageDialog(this, "Atenção: O ID digitado pertence a outro tipo de peça (" + h.getTipoComponente() + "), não a um Processador.", "Tipo Incompatível", JOptionPane.WARNING_MESSAGE);
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
            if (h instanceof Processador) {

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
                "Processador Selecionado: \n" + valLin,
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

                if (h instanceof Processador) {

                    Processador p = (Processador) h;

                    cxNome.setText(p.getNome());
                    cxPreco.setText(String.valueOf(p.getPreco()));
                    cxQtd.setText(String.valueOf(p.getQtdEstoque()));
                    cxMarca.setText(p.getFabricante().getMarca()); //REFLEXIVIDADE
                    cxCnpj.setText(p.getFabricante().getCnpj()); //REFLEXIVIDADE

                    cxNucleos.setText(String.valueOf(p.getQtdNucleos()));
                    cxFreq.setText(String.valueOf(p.getFrequencia()));

                } else {
                    JOptionPane.showMessageDialog(this, "Atenção: O ID digitado pertence a outro tipo de peça (Ex: Placa de Vídeo), não a um(a) "+ h.getTipoComponente(), "Tipo Incompatível", JOptionPane.WARNING_MESSAGE);
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
            String entraId = JOptionPane.showInputDialog(this, "Digite o ID do Processador que deseja alterar:", "Modificar", JOptionPane.QUESTION_MESSAGE);

            if (entraId == null || entraId.trim().isEmpty()) {
                return;
            }

            int idBusca = Integer.parseInt(entraId.trim());
            Hardware pecaExistente = bd.consultarPorId(idBusca);

            if (pecaExistente != null && pecaExistente instanceof Processador) {
                Processador procAtualizado = (Processador) pecaExistente;

                String novoNome = JOptionPane.showInputDialog(this, "Informe o novo NOME (ou deixe em branco para manter):", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
                if (novoNome != null && !novoNome.trim().isEmpty()) {
                    procAtualizado.setNome(novoNome);
                }

                String novoPreco = JOptionPane.showInputDialog(this, "Informe o novo PREÇO:", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
                if (novoPreco != null && !novoPreco.trim().isEmpty()) {
                    procAtualizado.setPreco(Double.parseDouble(novoPreco.replace(",", ".")));
                }

                String novaQtd = JOptionPane.showInputDialog(this, "Informe a nova QUANTIDADE em estoque:", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
                if (novaQtd != null && !novaQtd.trim().isEmpty()) {
                    procAtualizado.setQtdEstoque(Integer.parseInt(novaQtd));
                }

                String novaMarca = JOptionPane.showInputDialog(this, "Informe a nova MARCA do fabricante:", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
                if (novaMarca != null && !novaMarca.trim().isEmpty()) {
                    procAtualizado.getFabricante().setMarca(novaMarca); //REFLEXIVIDADE
                }

                String novoCnpj = JOptionPane.showInputDialog(this, "Informe o novo CNPJ do fabricante:", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
                if (novoCnpj != null && !novoCnpj.trim().isEmpty()) {
                    procAtualizado.getFabricante().setCnpj(novoCnpj); //REFLEXIVIDADE
                }

                String nucleos = JOptionPane.showInputDialog(this, "Informe a nova quantidade de NÚCLEOS:", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
                if (nucleos != null && !nucleos.trim().isEmpty()) {
                    procAtualizado.setQtdNucleos(Integer.parseInt(nucleos));
                }

                String freq = JOptionPane.showInputDialog(this, "Informe a nova FREQUÊNCIA (GHz):", "Atualizar", JOptionPane.INFORMATION_MESSAGE);
                if (freq != null && !freq.trim().isEmpty()) {
                    procAtualizado.setFrequencia(Double.parseDouble(freq.replace(",", ".")));
                }

                bd.alterar(idBusca, procAtualizado);

                JOptionPane.showMessageDialog(this, (procAtualizado.getTipoComponente()) + " atualizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                atualizarTabResumo();

            } else {
                JOptionPane.showMessageDialog(this, "Processador não encontrado com o ID: " + idBusca, "Erro", JOptionPane.ERROR_MESSAGE);
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
        java.awt.EventQueue.invokeLater(() -> new FormProcessador().setVisible(true));
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
    private javax.swing.JTextField cxFreq;
    private javax.swing.JTextField cxID;
    private javax.swing.JTextField cxMarca;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxNucleos;
    private javax.swing.JTextField cxPreco;
    private javax.swing.JTextField cxQtd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rotCnpj;
    private javax.swing.JLabel rotFormProc;
    private javax.swing.JLabel rotFreq;
    private javax.swing.JLabel rotID;
    private javax.swing.JLabel rotMarca;
    private javax.swing.JLabel rotNome;
    private javax.swing.JLabel rotNucleos;
    private javax.swing.JLabel rotPreco;
    private javax.swing.JLabel rotQtd;
    private javax.swing.JTable tabResumo;
    // End of variables declaration//GEN-END:variables
}
