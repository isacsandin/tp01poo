/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cliente.java
 *
 * Created on 19/11/2010, 15:12:21
 */

package gui;

import java.awt.Component;

import javax.swing.JOptionPane;

import persistencia.PersistenciaCliente;
import pessoas.Cliente;
import gui.Principal;

/**
 *
 * @author felipe
 */
public class ConsultaCliente extends javax.swing.JFrame {
    private Component principal;
    private Cliente cliente;
    /** Creates new form Cliente */
    public ConsultaCliente(Principal principal) {
        initComponents();
		this.principal = principal;
		ConsultaClienteOpcaoCpf.setSelected(true);
		ConsultaClientePanelCpf.setVisible(true);
		ConsultaClientePanelNome.setVisible(false);
		ConsultaClienteTextPesquisa.setText("");
		ConsultaClienteCpfTextNome.setEditable(false);
		ConsultaClienteCpfTextEndereco.setEditable(false);
		ConsultaClienteCpfTextTelefone.setEditable(false);
		ConsultaClienteNomeTextCpf.setEditable(false);
		ConsultaClienteNomeTextEndereco.setEditable(false);
		ConsultaClienteNomeTextTelefone.setEditable(false);	
		ConsultaClienteBotaoBusca.setEnabled(true);
    }

/**
 * 
 * 
 * @param principal
 */
    public ConsultaCliente(FrameMovimentoPrePedido principal) {
        initComponents();
		this.principal = principal;
		cliente = null;
		ConsultaClienteOpcaoCpf.setSelected(true);
		ConsultaClientePanelCpf.setVisible(true);
		ConsultaClientePanelNome.setVisible(false);
		ConsultaClienteTextPesquisa.setText("");
		ConsultaClienteCpfTextNome.setEditable(false);
		ConsultaClienteCpfTextEndereco.setEditable(false);
		ConsultaClienteCpfTextTelefone.setEditable(false);
		ConsultaClienteNomeTextCpf.setEditable(false);
		ConsultaClienteNomeTextEndereco.setEditable(false);
		ConsultaClienteNomeTextTelefone.setEditable(false);	
		ConsultaClienteBotaoBusca.setEnabled(true);
	}
    
    public ConsultaCliente(FrameCadastroCliente principal) {
        initComponents();
		this.principal = principal;
		cliente = null;
		ConsultaClienteOpcaoCpf.setSelected(true);
		ConsultaClientePanelCpf.setVisible(true);
		ConsultaClientePanelNome.setVisible(false);
		ConsultaClienteTextPesquisa.setText("");
		ConsultaClienteCpfTextNome.setEditable(false);
		ConsultaClienteCpfTextEndereco.setEditable(false);
		ConsultaClienteCpfTextTelefone.setEditable(false);
		ConsultaClienteNomeTextCpf.setEditable(false);
		ConsultaClienteNomeTextEndereco.setEditable(false);
		ConsultaClienteNomeTextTelefone.setEditable(false);	
		ConsultaClienteBotaoBusca.setEnabled(true);
	}

	/** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ConsultaClienteTextPesquisa = new javax.swing.JFormattedTextField();
        ConsultaClienteBotaoBusca = new javax.swing.JButton();
        ConsultaClienteOpcaoNome = new javax.swing.JRadioButton();
        ConsultaClienteOpcaoCpf = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        ConsultaClientePanelCpf = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLCPF = new javax.swing.JLabel();
        ConsultaClienteCpfTextEndereco = new javax.swing.JFormattedTextField();
        ConsultaClienteCpfTextNome = new javax.swing.JFormattedTextField();
        ConsultaClienteCpfTextTelefone = new javax.swing.JFormattedTextField();
        ConsultaClienteCpfBotaoOk = new javax.swing.JButton();
        ConsultaClienteCpfBotaoListar = new javax.swing.JButton();
        ConsultaClienteCpfBotaoCadastro = new javax.swing.JButton();
        ConsultaClientePanelNome = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLCPF1 = new javax.swing.JLabel();
        ConsultaClienteNomeTextEndereco = new javax.swing.JFormattedTextField();
        ConsultaClienteNomeTextCpf = new javax.swing.JFormattedTextField();
        ConsultaClienteNomeTextTelefone = new javax.swing.JFormattedTextField();
        ConsultaClienteNomeBotaoOk = new javax.swing.JButton();
        ConsultaClienteNomeBotaoListar = new javax.swing.JButton();
        ConsultaClienteNomeBotaoCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(514, 401));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        ConsultaClienteTextPesquisa.setText("Pesquisa");
        ConsultaClienteTextPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConsultaClienteTextPesquisaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
//                ConsultaClienteTextPesquisaFocusLost(evt);
            }
        });

        ConsultaClienteBotaoBusca.setText("Buscar");
        ConsultaClienteBotaoBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteBotaoBuscaActionPerformed(evt);
            }
        });

        buttonGroup1.add(ConsultaClienteOpcaoNome);
        ConsultaClienteOpcaoNome.setText("Nome");
        ConsultaClienteOpcaoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteOpcaoNomeActionPerformed(evt);
            }
        });

        buttonGroup1.add(ConsultaClienteOpcaoCpf);
        ConsultaClienteOpcaoCpf.setText("CPF");
        ConsultaClienteOpcaoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteOpcaoCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(ConsultaClienteOpcaoCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultaClienteOpcaoNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultaClienteTextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConsultaClienteBotaoBusca)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClienteTextPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConsultaClienteBotaoBusca)
                    .addComponent(ConsultaClienteOpcaoNome)
                    .addComponent(ConsultaClienteOpcaoCpf))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConsultaClientePanelCpf.setBorder(javax.swing.BorderFactory.createTitledBorder("Cpf"));

        jLabel3.setText("Endereço");

        jLabel4.setText("Tefelone");

        jLCPF.setText("Nome");

        ConsultaClienteCpfTextTelefone.setForeground(new java.awt.Color(58, 57, 59));

        ConsultaClienteCpfBotaoOk.setText("OK");
        ConsultaClienteCpfBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteCpfBotaoOkActionPerformed(evt);
            }
        });

        ConsultaClienteCpfBotaoListar.setText("Litar Todos");
        ConsultaClienteCpfBotaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteCpfBotaoListarActionPerformed(evt);
            }
        });

        ConsultaClienteCpfBotaoCadastro.setText("Cadastrar");
        ConsultaClienteCpfBotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteCpfBotaoCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultaClientePanelCpfLayout = new javax.swing.GroupLayout(ConsultaClientePanelCpf);
        ConsultaClientePanelCpf.setLayout(ConsultaClientePanelCpfLayout);
        ConsultaClientePanelCpfLayout.setHorizontalGroup(
            ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaClientePanelCpfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaClientePanelCpfLayout.createSequentialGroup()
                        .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ConsultaClienteCpfTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(ConsultaClienteCpfTextEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaClientePanelCpfLayout.createSequentialGroup()
                        .addComponent(ConsultaClienteCpfBotaoListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(ConsultaClienteCpfBotaoCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConsultaClienteCpfBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConsultaClientePanelCpfLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(ConsultaClienteCpfTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        ConsultaClientePanelCpfLayout.setVerticalGroup(
            ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaClientePanelCpfLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClienteCpfTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCPF))
                .addGap(33, 33, 33)
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ConsultaClienteCpfTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ConsultaClienteCpfTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(ConsultaClientePanelCpfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClienteCpfBotaoOk)
                    .addComponent(ConsultaClienteCpfBotaoListar)
                    .addComponent(ConsultaClienteCpfBotaoCadastro))
                .addContainerGap())
        );

        ConsultaClientePanelNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        jLabel6.setText("Endereço");

        jLabel7.setText("Tefelone");

        jLCPF1.setText("CPF");

        ConsultaClienteNomeTextTelefone.setForeground(new java.awt.Color(58, 57, 59));

        ConsultaClienteNomeBotaoOk.setText("OK");
        ConsultaClienteNomeBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteNomeBotaoOkActionPerformed(evt);
            }
        });

        ConsultaClienteNomeBotaoListar.setText("Listar Todos");
        ConsultaClienteNomeBotaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteNomeBotaoListarActionPerformed(evt);
            }
        });

        ConsultaClienteNomeBotaoCadastro.setText("Cadastrar");
        ConsultaClienteNomeBotaoCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultaClienteNomeBotaoCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ConsultaClientePanelNomeLayout = new javax.swing.GroupLayout(ConsultaClientePanelNome);
        ConsultaClientePanelNome.setLayout(ConsultaClientePanelNomeLayout);
        ConsultaClientePanelNomeLayout.setHorizontalGroup(
            ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaClientePanelNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaClientePanelNomeLayout.createSequentialGroup()
                        .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLCPF1)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ConsultaClienteNomeTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultaClienteNomeTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConsultaClienteNomeTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(ConsultaClientePanelNomeLayout.createSequentialGroup()
                        .addComponent(ConsultaClienteNomeBotaoListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 240, Short.MAX_VALUE)
                        .addComponent(ConsultaClienteNomeBotaoCadastro)
                        .addGap(95, 95, 95))))
            .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaClientePanelNomeLayout.createSequentialGroup()
                    .addContainerGap(426, Short.MAX_VALUE)
                    .addComponent(ConsultaClienteNomeBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        ConsultaClientePanelNomeLayout.setVerticalGroup(
            ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaClientePanelNomeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCPF1)
                    .addComponent(ConsultaClienteNomeTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClienteNomeTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClienteNomeTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsultaClienteNomeBotaoListar)
                    .addComponent(ConsultaClienteNomeBotaoCadastro))
                .addContainerGap())
            .addGroup(ConsultaClientePanelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaClientePanelNomeLayout.createSequentialGroup()
                    .addContainerGap(223, Short.MAX_VALUE)
                    .addComponent(ConsultaClienteNomeBotaoOk)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConsultaClientePanelCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ConsultaClientePanelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(292, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(110, Short.MAX_VALUE)
                    .addComponent(ConsultaClientePanelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(108, Short.MAX_VALUE)
                    .addComponent(ConsultaClientePanelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultaClienteTextPesquisaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConsultaClienteTextPesquisaFocusGained
        ConsultaClienteTextPesquisa.setText("");
}//GEN-LAST:event_ConsultaClienteTextPesquisaFocusGained

//    private void ConsultaClienteTextPesquisaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConsultaClienteTextPesquisaFocusLost
//        ConsultaClienteTextPesquisa.setText("Pesquisa");
//}//GEN-LAST:event_ConsultaClienteTextPesquisaFocusLost

    /**
     * Campo de busca de um cliente por meio do cpf ou do nome
     * Não aceita campos em branco para pesquisa
     * Retorna caso encontre as informações do cliente
     */
    private void ConsultaClienteBotaoBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteBotaoBuscaActionPerformed
        String busca = null;
        busca = ConsultaClienteTextPesquisa.getText();
        if(busca == null || busca.length() == 0){
            JOptionPane.showMessageDialog(null, "Pesquisa Inválida");
        } 
        else{
            if(ConsultaClienteOpcaoCpf.isSelected() == true){
            	Cliente cliente = PersistenciaCliente.getInstance().searchCliente(busca);
                if(cliente == null){
                	JOptionPane.showMessageDialog(null, "Não Encontrado");
                }
                else{
	            	ConsultaClienteCpfTextNome.setText(cliente.getNome());
	                ConsultaClienteCpfTextEndereco.setText(cliente.getEndereco());
	                ConsultaClienteCpfTextTelefone.setText(cliente.getTelefone());
                }    
             }else{
                if(ConsultaClienteOpcaoNome.isSelected() == true){
                	Cliente cliente = PersistenciaCliente.getInstance().searchCliente(busca);
                    if(cliente == null){
                    	JOptionPane.showMessageDialog(null, "Não Encontrado");
                    }
                    else{
	                	ConsultaClienteNomeTextCpf.setText(cliente.getCpf());
	                    ConsultaClienteNomeTextEndereco.setText(cliente.getEndereco());
	                    ConsultaClienteNomeTextTelefone.setText(cliente.getTelefone());
                    }    
                }
            }       
        }
}//GEN-LAST:event_ConsultaClienteBotaoBuscaActionPerformed
    
    /**
     * Campo de busca através do cpf
     * Desabilita a pesquisa por nome
     * @param evt
     */
	private void ConsultaClienteOpcaoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteOpcaoCpfActionPerformed
		ConsultaClientePanelNome.setVisible(false);
		ConsultaClientePanelCpf.setVisible(true);
		ConsultaClienteCpfTextEndereco.setText("");
		ConsultaClienteCpfTextNome.setText("");
		ConsultaClienteCpfTextTelefone.setText("");
		ConsultaClienteBotaoBusca.setEnabled(true);
	}//GEN-LAST:event_ConsultaClienteOpcaoCpfActionPerformed

	/**
	 * Campo de busca através do nome
	 * Desabilita a pesquisa por cpf
	 * @param evt
	 */
	private void ConsultaClienteOpcaoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteOpcaoNomeActionPerformed
		ConsultaClientePanelCpf.setVisible(false);
		ConsultaClientePanelNome.setVisible(true);
		ConsultaClienteNomeTextCpf.setText("");
		ConsultaClienteNomeTextEndereco.setText("");
		ConsultaClienteNomeTextTelefone.setText("");
		ConsultaClienteBotaoBusca.setEnabled(true);
	}//GEN-LAST:event_ConsultaClienteOpcaoNomeActionPerformed

	/**
	 *Botão que confirma a busca do cliente desejado
	 *Se o cliente não existe retorna uma mensagem
	 * @param evt
	 */
	private void ConsultaClienteNomeBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteNomeBotaoOkActionPerformed
		if(cliente == null){
			JOptionPane.showMessageDialog(null, "Esta nao é uma pesquisa válida");
		}
		else {
			principal.setEnabled(true);
			enviar();
			this.dispose();
		}	
}//GEN-LAST:event_ConsultaClienteNomeBotaoOkActionPerformed

	/**
	 * Botão que confirma a busca pelo cpf 
	 * Caso o cliente não exista retorna uma mensagem
	 * @param evt
	 */
	private void ConsultaClienteCpfBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteCpfBotaoOkActionPerformed
		if(cliente == null){
			JOptionPane.showMessageDialog(null, "Esta nao é uma pesquisa válida");
		}
		else {
			principal.setEnabled(true);
			enviar();
			this.dispose();
		}	
}//GEN-LAST:event_ConsultaClienteCpfBotaoOkActionPerformed

	/**
	 * Botão que lista os clientes do banco de dados pelo cpf
	 * Desabilita a janela anterior
	 * @param evt
	 */
	private void ConsultaClienteCpfBotaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteCpfBotaoListarActionPerformed
		ConsultaListar listar = new ConsultaListar(this);
		listar.setVisible(true);
		this.setEnabled(false);
	}//GEN-LAST:event_ConsultaClienteCpfBotaoListarActionPerformed
	
	/**
	 * Botão que lista os clientes do banco de dados pelo nome
	 * desabilita a janela anterior.
	 * @param evt
	 */
	private void ConsultaClienteNomeBotaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteNomeBotaoListarActionPerformed
		ConsultaListar listar = new ConsultaListar(this);
		listar.setVisible(true);
		this.setEnabled(false);
	}//GEN-LAST:event_ConsultaClienteNomeBotaoListarActionPerformed
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

        private void ConsultaClienteNomeBotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteNomeBotaoCadastroActionPerformed
//            FrameCadastroCliente cliente = new FrameCadastroCliente(this);
//            cliente.setVisible(true);
//            this.setEnabled(false);
        }//GEN-LAST:event_ConsultaClienteNomeBotaoCadastroActionPerformed

        private void ConsultaClienteCpfBotaoCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultaClienteCpfBotaoCadastroActionPerformed
//        	FrameCadastroCliente cliente = new FrameCadastroCliente(this);
//            cliente.setVisible(true);
//            this.setEnabled(false);
        }//GEN-LAST:event_ConsultaClienteCpfBotaoCadastroActionPerformed

    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultaClienteBotaoBusca;
    private javax.swing.JButton ConsultaClienteCpfBotaoCadastro;
    private javax.swing.JButton ConsultaClienteCpfBotaoListar;
    private javax.swing.JButton ConsultaClienteCpfBotaoOk;
    private javax.swing.JButton ConsultaClienteNomeBotaoCadastro;
    private javax.swing.JButton ConsultaClienteNomeBotaoListar;
    private javax.swing.JButton ConsultaClienteNomeBotaoOk;
    private javax.swing.JRadioButton ConsultaClienteOpcaoCpf;
    private javax.swing.JRadioButton ConsultaClienteOpcaoNome;
    private javax.swing.JPanel ConsultaClientePanelCpf;
    private javax.swing.JPanel ConsultaClientePanelNome;
    private javax.swing.JFormattedTextField ConsultaClienteCpfTextEndereco;
    private javax.swing.JFormattedTextField ConsultaClienteCpfTextNome;
    private javax.swing.JFormattedTextField ConsultaClienteTextPesquisa;
    private javax.swing.JFormattedTextField ConsultaClienteCpfTextTelefone;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ConsultaClienteNomeTextCpf;
    private javax.swing.JFormattedTextField ConsultaClienteNomeTextEndereco;
    private javax.swing.JFormattedTextField ConsultaClienteNomeTextTelefone;
    private javax.swing.JLabel jLCPF;
    private javax.swing.JLabel jLCPF1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
	
  /**
   * Protocolo de comunicação entre as classes
   * 
   */
    public void enviar(){
		if(principal instanceof FrameMovimentoPrePedido){
			((FrameMovimentoPrePedido)principal).receber(cliente);
		}	
	}
}