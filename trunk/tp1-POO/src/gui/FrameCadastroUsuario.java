/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameCadastroFornecedores.java
 *
 * Created on 19/11/2010, 15:16:12
 */

package gui;

import gui.Principal;


/**
 *
 * @author isac
 */
public class FrameCadastroUsuario extends javax.swing.JFrame {

	private Principal principal;
    /** Creates new form FrameCadastroFornecedores */
    public FrameCadastroUsuario(Principal principal) {
        initComponents();
		this.principal = principal;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        permissoes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        CadastroUsuarioTextNome = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        CadastroUsuarioBotaoCancelar = new javax.swing.JButton();
        CadastroUsuarioBotaoOk = new javax.swing.JButton();
        CadastroUsuarioBotaoLimparCampos = new javax.swing.JButton();
        CadastroUsuarioBotaoOutroCadastro = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        labelTituloCadastroUsuario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        labelNomeUsuario = new javax.swing.JLabel();
        CadastroUsuarioNomeUsuario = new javax.swing.JTextField();
        labelPasswdUsuario = new javax.swing.JLabel();
        CadastroUsuarioPasswd = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        permissoesAdministrador = new javax.swing.JRadioButton();
        permissoesComprador = new javax.swing.JRadioButton();
        permissoesVendedor = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        jPanel1.setMaximumSize(new java.awt.Dimension(580, 580));
        jPanel1.setMinimumSize(new java.awt.Dimension(580, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 580));

        CadastroUsuarioTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroUsuarioTextNomeActionPerformed(evt);
            }
        });

        labelNome.setText("Nome*:");

        CadastroUsuarioBotaoCancelar.setText("Cancelar");
        CadastroUsuarioBotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroUsuarioBotaoCancelarActionPerformed(evt);
            }
        });

        CadastroUsuarioBotaoOk.setText("Ok");
        CadastroUsuarioBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroUsuarioBotaoOkActionPerformed(evt);
            }
        });

        CadastroUsuarioBotaoLimparCampos.setText("Limpar Campos");
        CadastroUsuarioBotaoLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroUsuarioBotaoLimparCamposActionPerformed(evt);
            }
        });

        CadastroUsuarioBotaoOutroCadastro.setText("Outro Cadastro?");
        CadastroUsuarioBotaoOutroCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroUsuarioBotaoOutroCadastroActionPerformed(evt);
            }
        });

        labelTituloCadastroUsuario.setFont(new java.awt.Font("Ubuntu", 1, 18));
        labelTituloCadastroUsuario.setText("Cadastro de Usuários:");

        labelNomeUsuario.setText("Nome de Usuário*:");

        labelPasswdUsuario.setText("Senha:");

        jLabel1.setText("Permissões:");

        permissoes.add(permissoesAdministrador);
        permissoesAdministrador.setText("Administrador");

        permissoes.add(permissoesComprador);
        permissoesComprador.setText("Comprador");

        permissoes.add(permissoesVendedor);
        permissoesVendedor.setText("Vendedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(CadastroUsuarioBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CadastroUsuarioBotaoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(CadastroUsuarioBotaoOutroCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(CadastroUsuarioBotaoLimparCampos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNomeUsuario)
                                .addGap(1, 1, 1)
                                .addComponent(CadastroUsuarioNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(labelPasswdUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CadastroUsuarioPasswd, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CadastroUsuarioTextNome, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(labelTituloCadastroUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(permissoesComprador)
                                    .addComponent(permissoesAdministrador)
                                    .addComponent(permissoesVendedor))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTituloCadastroUsuario)
                .addGap(31, 31, 31)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeUsuario)
                    .addComponent(CadastroUsuarioNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPasswdUsuario)
                    .addComponent(CadastroUsuarioPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(CadastroUsuarioTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(permissoesAdministrador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permissoesComprador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(permissoesVendedor)
                .addGap(71, 71, 71)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastroUsuarioBotaoOk)
                    .addComponent(CadastroUsuarioBotaoCancelar)
                    .addComponent(CadastroUsuarioBotaoOutroCadastro)
                    .addComponent(CadastroUsuarioBotaoLimparCampos))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void CadastroUsuarioTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroUsuarioTextNomeActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_CadastroUsuarioTextNomeActionPerformed

	private void CadastroUsuarioBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroUsuarioBotaoOkActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_CadastroUsuarioBotaoOkActionPerformed

	private void CadastroUsuarioBotaoLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroUsuarioBotaoLimparCamposActionPerformed
		CadastroUsuarioTextNome.setText("");
        CadastroUsuarioNomeUsuario.setText("");
        CadastroUsuarioPasswd.setText("");
	}//GEN-LAST:event_CadastroUsuarioBotaoLimparCamposActionPerformed

	private void CadastroUsuarioBotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroUsuarioBotaoCancelarActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_CadastroUsuarioBotaoCancelarActionPerformed

	private void CadastroUsuarioBotaoOutroCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroUsuarioBotaoOutroCadastroActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_CadastroUsuarioBotaoOutroCadastroActionPerformed

    /**
    * @param args the command line arguments
    */
  //  public static void main(String args[]) {
   //     java.awt.EventQueue.invokeLater(new Runnable() {
  //          public void run() {
   //             new FrameCadastroFornecedores().setVisible(true);
   //         }
   //     });
   // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastroUsuarioBotaoCancelar;
    private javax.swing.JButton CadastroUsuarioBotaoLimparCampos;
    private javax.swing.JButton CadastroUsuarioBotaoOk;
    private javax.swing.JButton CadastroUsuarioBotaoOutroCadastro;
    private javax.swing.JTextField CadastroUsuarioNomeUsuario;
    private javax.swing.JPasswordField CadastroUsuarioPasswd;
    private javax.swing.JTextField CadastroUsuarioTextNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomeUsuario;
    private javax.swing.JLabel labelPasswdUsuario;
    private javax.swing.JLabel labelTituloCadastroUsuario;
    private javax.swing.ButtonGroup permissoes;
    private javax.swing.JRadioButton permissoesAdministrador;
    private javax.swing.JRadioButton permissoesComprador;
    private javax.swing.JRadioButton permissoesVendedor;
    // End of variables declaration//GEN-END:variables

}