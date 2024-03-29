/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Fornecedor.java
 *
 * Created on 19/11/2010, 15:14:37
 */

package gui;

import interfaces.Communication;

import java.awt.Component;

import javax.swing.JOptionPane;

import persistencia.PersistenciaFornecedor;
import pessoas.Fornecedor;

/**
 *
 * @author felipe
 */
public class ConsultaFornecedor extends javax.swing.JFrame implements Communication{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Component principal;
	private Fornecedor fornecedor;
    /** Creates new form Fornecedor */
    public ConsultaFornecedor(Principal principal) {
        initComponents();
		this.principal = principal;
		this.fornecedor = null;
		this.ConsultaFornecedorOpcaoCnpj.setSelected(true);
		ConsultaFornecedorPanelCnpj.setVisible(true);
		ConsultaFornecedorPanelNome.setVisible(false);
		ConsultaFornecedorTextPesquisa.setText("");
		ConsultaFornecedorCnpjTextNome.setEditable(false);
		ConsultaFornecedorCnpjTextEndereco.setEditable(false);
		ConsultaFornecedorCnpjTextTelefone.setEditable(false);
		ConsultaFornecedorNomeTextCnpj.setEditable(false);
		ConsultaFornecedorNomeTextEndereco.setEditable(false);
		ConsultaFornecedorNomeTextTelefone.setEditable(false);	
		ConsultaFornecedorBotaoBusca.setEnabled(true);
    }

    public ConsultaFornecedor(FrameMovimentoPreCompra principal) {
        initComponents();
		this.principal = principal;
		this.fornecedor = null;
		this.ConsultaFornecedorOpcaoCnpj.setSelected(true);
		ConsultaFornecedorPanelCnpj.setVisible(true);
		ConsultaFornecedorPanelNome.setVisible(false);
		ConsultaFornecedorTextPesquisa.setText("");
		ConsultaFornecedorCnpjTextNome.setEditable(false);
		ConsultaFornecedorCnpjTextEndereco.setEditable(false);
		ConsultaFornecedorCnpjTextTelefone.setEditable(false);
		ConsultaFornecedorNomeTextCnpj.setEditable(false);
		ConsultaFornecedorNomeTextEndereco.setEditable(false);
		ConsultaFornecedorNomeTextTelefone.setEditable(false);	
		ConsultaFornecedorBotaoBusca.setEnabled(true);
	}

	/** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ConsultaFornecedorTextPesquisa = new javax.swing.JFormattedTextField();
        ConsultaFornecedorBotaoBusca = new javax.swing.JButton();
        ConsultaFornecedorOpcaoNome = new javax.swing.JRadioButton();
        ConsultaFornecedorOpcaoCnpj = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        ConsultaFornecedorPanelCnpj = new javax.swing.JPanel();
        jLEndereco = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        ConsultaFornecedorCnpjTextEndereco = new javax.swing.JFormattedTextField();
        ConsultaFornecedorCnpjTextNome = new javax.swing.JFormattedTextField();
        ConsultaFornecedorCnpjTextTelefone = new javax.swing.JFormattedTextField();
        ConsultaFornecedorCnpjBotaoOk = new javax.swing.JButton();
        ConsultaFornecedorCnpjBotaoListar = new javax.swing.JButton();
        ConsultaFornecedorCnpjBotaoCadastro = new javax.swing.JButton();
        ConsultaFornecedorPanelNome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLCNPJ = new javax.swing.JLabel();
        ConsultaFornecedorNomeTextEndereco = new javax.swing.JFormattedTextField();
        ConsultaFornecedorNomeTextCnpj = new javax.swing.JFormattedTextField();
        ConsultaFornecedorNomeTextTelefone = new javax.swing.JFormattedTextField();
        ConsultaFornecedorNomeBotaoOk = new javax.swing.JButton();
        ConsultaFornecedorNomeBotaListar = new javax.swing.JButton();
        ConsultaFornecedorNomeBotaoCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setPreferredSize(new java.awt.Dimension(514, 401));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedor"));

        ConsultaFornecedorTextPesquisa.setText("Pesquisa");
        ConsultaFornecedorTextPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
//                jFPesquisaFocusLost(evt);
            }
        });

        ConsultaFornecedorBotaoBusca.setText("Buscar");
        ConsultaFornecedorBotaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(ConsultaFornecedorOpcaoNome);
        ConsultaFornecedorOpcaoNome.setText("Nome");
        ConsultaFornecedorOpcaoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(ConsultaFornecedorOpcaoCnpj);
        ConsultaFornecedorOpcaoCnpj.setText("CNPJ");
        ConsultaFornecedorOpcaoCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRCNPJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(ConsultaFornecedorOpcaoCnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultaFornecedorOpcaoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultaFornecedorTextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultaFornecedorBotaoBusca)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaFornecedorTextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultaFornecedorBotaoBusca)
                    .addComponent(ConsultaFornecedorOpcaoNome)
                    .addComponent(ConsultaFornecedorOpcaoCnpj))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConsultaFornecedorPanelCnpj.setBorder(javax.swing.BorderFactory.createTitledBorder("CPNJ"));

        jLEndereco.setText("Endereço");

        jLTelefone.setText("Tefelone");

        jLNome.setText("Nome");

        ConsultaFornecedorCnpjTextTelefone.setForeground(new java.awt.Color(58, 57, 59));

        ConsultaFornecedorCnpjBotaoOk.setText("OK");
        ConsultaFornecedorCnpjBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaFornecedorCnpjBotaoOkActionPerformed(evt);
            }
        });

        ConsultaFornecedorCnpjBotaoListar.setText("Listar Todos");
        ConsultaFornecedorCnpjBotaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaFornecedorCnpjBotaoListarActionPerformed(evt);
            }
        });

        ConsultaFornecedorCnpjBotaoCadastro.setText("Cadastro");
        ConsultaFornecedorCnpjBotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaFornecedorCnpjBotaoCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultaFornecedorPanelCnpjLayout = new javax.swing.GroupLayout(ConsultaFornecedorPanelCnpj);
        ConsultaFornecedorPanelCnpj.setLayout(ConsultaFornecedorPanelCnpjLayout);
        ConsultaFornecedorPanelCnpjLayout.setHorizontalGroup(
            ConsultaFornecedorPanelCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaFornecedorPanelCnpjLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaFornecedorPanelCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaFornecedorPanelCnpjLayout.createSequentialGroup()
                        .addComponent(ConsultaFornecedorCnpjBotaoListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                        .addComponent(ConsultaFornecedorCnpjBotaoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConsultaFornecedorCnpjBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(ConsultaFornecedorPanelCnpjLayout.createSequentialGroup()
                        .addGroup(ConsultaFornecedorPanelCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEndereco)
                            .addComponent(jLNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ConsultaFornecedorPanelCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConsultaFornecedorCnpjTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addComponent(ConsultaFornecedorCnpjTextEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(ConsultaFornecedorPanelCnpjLayout.createSequentialGroup()
                        .addComponent(jLTelefone)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultaFornecedorCnpjTextTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addGap(240, 240, 240))))
        );
        ConsultaFornecedorPanelCnpjLayout.setVerticalGroup(
            ConsultaFornecedorPanelCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaFornecedorPanelCnpjLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(ConsultaFornecedorPanelCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(ConsultaFornecedorCnpjTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(ConsultaFornecedorPanelCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEndereco)
                    .addComponent(ConsultaFornecedorCnpjTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(ConsultaFornecedorPanelCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaFornecedorCnpjTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ConsultaFornecedorPanelCnpjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaFornecedorCnpjBotaoOk)
                    .addComponent(ConsultaFornecedorCnpjBotaoListar)
                    .addComponent(ConsultaFornecedorCnpjBotaoCadastro))
                .addContainerGap())
        );

        ConsultaFornecedorPanelNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        jLabel6.setText("Endereço");

        jLabel7.setText("Tefelone");

        jLCNPJ.setText("CNPJ");

        ConsultaFornecedorNomeTextTelefone.setForeground(new java.awt.Color(58, 57, 59));

        ConsultaFornecedorNomeBotaoOk.setText("OK");
        ConsultaFornecedorNomeBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaFornecedorNomeBotaoOkActionPerformed(evt);
            }
        });

        ConsultaFornecedorNomeBotaListar.setText("Listar Todos");
        ConsultaFornecedorNomeBotaListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaFornecedorNomeBotaListarActionPerformed(evt);
            }
        });

        ConsultaFornecedorNomeBotaoCadastro.setText("Cadastro");
        ConsultaFornecedorNomeBotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaFornecedorNomeBotaoCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultaFornecedorPanelNomeLayout = new javax.swing.GroupLayout(ConsultaFornecedorPanelNome);
        ConsultaFornecedorPanelNome.setLayout(ConsultaFornecedorPanelNomeLayout);
        ConsultaFornecedorPanelNomeLayout.setHorizontalGroup(
            ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaFornecedorPanelNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaFornecedorPanelNomeLayout.createSequentialGroup()
                        .addGroup(ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCNPJ)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConsultaFornecedorNomeTextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultaFornecedorNomeTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultaFornecedorNomeTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(ConsultaFornecedorPanelNomeLayout.createSequentialGroup()
                        .addComponent(ConsultaFornecedorNomeBotaListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addComponent(ConsultaFornecedorNomeBotaoCadastro)
                        .addGap(94, 94, 94))))
            .addGroup(ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaFornecedorPanelNomeLayout.createSequentialGroup()
                    .addContainerGap(434, Short.MAX_VALUE)
                    .addComponent(ConsultaFornecedorNomeBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        ConsultaFornecedorPanelNomeLayout.setVerticalGroup(
            ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaFornecedorPanelNomeLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCNPJ)
                    .addComponent(ConsultaFornecedorNomeTextCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaFornecedorNomeTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConsultaFornecedorPanelNomeLayout.createSequentialGroup()
                        .addGroup(ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ConsultaFornecedorNomeTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConsultaFornecedorNomeBotaListar)
                        .addGap(6, 6, 6))
                    .addGroup(ConsultaFornecedorPanelNomeLayout.createSequentialGroup()
                        .addComponent(ConsultaFornecedorNomeBotaoCadastro)
                        .addContainerGap())))
            .addGroup(ConsultaFornecedorPanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaFornecedorPanelNomeLayout.createSequentialGroup()
                    .addContainerGap(218, Short.MAX_VALUE)
                    .addComponent(ConsultaFornecedorNomeBotaoOk)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConsultaFornecedorPanelCnpj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConsultaFornecedorPanelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(120, Short.MAX_VALUE)
                    .addComponent(ConsultaFornecedorPanelCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(116, Short.MAX_VALUE)
                    .addComponent(ConsultaFornecedorPanelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Limpa os campos preenchidos
     * @param evt
     */
    private void jFPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFPesquisaFocusGained
        ConsultaFornecedorTextPesquisa.setText("");
}//GEN-LAST:event_jFPesquisaFocusGained

//    private void jFPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFPesquisaFocusLost
//        ConsultaFornecedorTextPesquisa.setText("Pesquisa");
//}//GEN-LAST:event_jFPesquisaFocusLost
    /**
     *  Campo faz busca de Fornecedor através do CNPJ ou nome
     * Não aceita quando o campo está vazio
     * Se encontra o Fornecedor retorna seus dados 
    
     */
    private void jBBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaActionPerformed
        String busca = null;
        busca = ConsultaFornecedorTextPesquisa.getText();
        if(busca == null || busca.length() == 0){
            JOptionPane.showMessageDialog(null, "Pesquisa Inválida");
        } else{   	
            if(ConsultaFornecedorOpcaoCnpj .isSelected() == true){
            	fornecedor = PersistenciaFornecedor.getInstance().searchFornecedor(busca);
            	if(fornecedor == null){
            		JOptionPane.showMessageDialog(null, "Não Encontrado");
            	}
            	else{
	            	ConsultaFornecedorCnpjTextNome.setText(fornecedor.getNome());
	                ConsultaFornecedorCnpjTextEndereco.setText(fornecedor.getEndereco());
	                ConsultaFornecedorCnpjTextTelefone.setText(fornecedor.getTelefone());
            	} 
             }else{
                if(ConsultaFornecedorOpcaoNome.isSelected() == true){
                	fornecedor = PersistenciaFornecedor.getInstance().searchFornecedor(busca);
                	if(fornecedor == null){
                		JOptionPane.showMessageDialog(null, "Não Encontrado");
                	}
                	else{
	                	ConsultaFornecedorNomeTextCnpj .setText(fornecedor.getCnpj());
	                    ConsultaFornecedorNomeTextEndereco.setText(fornecedor.getEndereco());
	                    ConsultaFornecedorNomeTextTelefone.setText(fornecedor.getTelefone());
                	}    
                }
            }     
        }	
}//GEN-LAST:event_jBBuscaActionPerformed
    /**
     * Não aceita campo vazio
     * @param evt
     */
	private void ConsultaFornecedorCnpjBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaFornecedorCnpjBotaoOkActionPerformed
			principal.setEnabled(true);
			enviar();
			this.dispose();
	}//GEN-LAST:event_ConsultaFornecedorCnpjBotaoOkActionPerformed
	/**
	 *  Não aceita campo vazio
	 * @param evt
	 */
	private void ConsultaFornecedorNomeBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaFornecedorNomeBotaoOkActionPerformed
			principal.setEnabled(true);
			enviar();
			this.dispose();
	}//GEN-LAST:event_ConsultaFornecedorNomeBotaoOkActionPerformed
	/**
	 * Método que esconde o painel do nome e habilita o do CNPJ
	 * @param evt
	 */
	private void jRCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRCNPJActionPerformed
		ConsultaFornecedorPanelCnpj.setVisible(true);
		ConsultaFornecedorPanelNome.setVisible(false);
		ConsultaFornecedorNomeTextCnpj.setText("");
		ConsultaFornecedorNomeTextEndereco.setText("");
		ConsultaFornecedorNomeTextTelefone.setText("");
		ConsultaFornecedorBotaoBusca.setEnabled(true);
	}//GEN-LAST:event_jRCNPJActionPerformed
/**
 * Método que ativa o painel do nome e esconde o painel CNPJ
 * @param evt
 */
	private void jRNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRNomeActionPerformed
		ConsultaFornecedorPanelNome.setVisible(true);
		ConsultaFornecedorPanelCnpj.setVisible(false);
		ConsultaFornecedorCnpjTextEndereco.setText("");
		ConsultaFornecedorCnpjTextNome.setText("");
		ConsultaFornecedorCnpjTextTelefone.setText("");
		ConsultaFornecedorBotaoBusca.setEnabled(true);
	}//GEN-LAST:event_jRNomeActionPerformed
	/**
	 * Método para listar todos os Fornecedores e seus dados
	 * @param evt
	 */
	private void ConsultaFornecedorCnpjBotaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaFornecedorCnpjBotaoListarActionPerformed
		ConsultaListar listar = new ConsultaListar(this);
		listar.setVisible(true);
		this.setEnabled(false);
	}//GEN-LAST:event_ConsultaFornecedorCnpjBotaoListarActionPerformed
	/**
	 * Método para listar todos os Fornecedores e seus dados
	 * @param evt
	 */
	private void ConsultaFornecedorNomeBotaListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaFornecedorNomeBotaListarActionPerformed
		ConsultaListar listar = new ConsultaListar(this);
		listar.setVisible(true);
		this.setEnabled(false);
	}//GEN-LAST:event_ConsultaFornecedorNomeBotaListarActionPerformed

        /**
         * 
         * @param evt
         */
                private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
                    this.principal.setEnabled(true);
                }//GEN-LAST:event_formWindowClosed

                private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                    this.principal.setEnabled(true);
                }//GEN-LAST:event_formWindowClosing
        
        private void ConsultaFornecedorNomeBotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaFornecedorNomeBotaoCadastroActionPerformed
            FrameCadastroFornecedor fornecedor = new FrameCadastroFornecedor(this);
            fornecedor.setVisible(true);
            this.dispose();
        }//GEN-LAST:event_ConsultaFornecedorNomeBotaoCadastroActionPerformed

        private void ConsultaFornecedorCnpjBotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaFornecedorCnpjBotaoCadastroActionPerformed
            FrameCadastroFornecedor fornecedor = new FrameCadastroFornecedor(this);
            fornecedor.setVisible(true);
        	this.dispose();	
        }//GEN-LAST:event_ConsultaFornecedorCnpjBotaoCadastroActionPerformed

    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaFornecedorCnpjBotaoCadastro;
    private javax.swing.JButton ConsultaFornecedorCnpjBotaoListar;
    private javax.swing.JButton ConsultaFornecedorCnpjBotaoOk;
    private javax.swing.JButton ConsultaFornecedorNomeBotaListar;
    private javax.swing.JButton ConsultaFornecedorNomeBotaoCadastro;
    private javax.swing.JButton ConsultaFornecedorNomeBotaoOk;
    private javax.swing.JPanel ConsultaFornecedorPanelCnpj;
    private javax.swing.JPanel ConsultaFornecedorPanelNome;
    private javax.swing.JFormattedTextField ConsultaFornecedorCnpjTextEndereco;
    private javax.swing.JFormattedTextField ConsultaFornecedorCnpjTextNome;
    private javax.swing.JFormattedTextField ConsultaFornecedorCnpjTextTelefone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton ConsultaFornecedorBotaoBusca;
    private javax.swing.JFormattedTextField ConsultaFornecedorNomeTextCnpj;
    private javax.swing.JFormattedTextField ConsultaFornecedorNomeTextEndereco;
    private javax.swing.JFormattedTextField ConsultaFornecedorNomeTextTelefone;
    private javax.swing.JFormattedTextField ConsultaFornecedorTextPesquisa;
    private javax.swing.JLabel jLCNPJ;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton ConsultaFornecedorOpcaoCnpj;
    private javax.swing.JRadioButton ConsultaFornecedorOpcaoNome;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
	@Override
	public void enviar() {
		if(principal instanceof FrameMovimentoPreCompra){
			if (fornecedor == null ){
	    		JOptionPane.showMessageDialog(null, "Esta nao é uma pesquisa válida");
			}
			else{
				((FrameMovimentoPreCompra)principal).receber(fornecedor);
			}	
		}
	}

	@Override
	public void receber(Object o) {
		// TODO Auto-generated method stub
		
	}

}