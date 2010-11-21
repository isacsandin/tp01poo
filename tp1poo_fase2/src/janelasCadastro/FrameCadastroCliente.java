/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameCadastroFornecedores.java
 *
 * Created on 19/11/2010, 15:16:12
 */

package janelasCadastro;

import janelasPrincipal.Principal;


/**
 *
 * @author isac
 */
public class FrameCadastroCliente extends javax.swing.JFrame {

	private Principal principal;
    /** Creates new form FrameCadastroFornecedores */
    public FrameCadastroCliente(Principal principal) {
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

        jPanel1 = new javax.swing.JPanel();
        CadastroClienteTextNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CadastroClienteTextCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CadastroClienteTextDtaNasc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CadastroClienteTextRua = new javax.swing.JTextField();
        CadastroClienteTextNumero = new javax.swing.JTextField();
        CadastroClienteTextTelefone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CadastroClienteTextBairro = new javax.swing.JTextField();
        CadastroClienteBotaoCancelar = new javax.swing.JButton();
        CadastroClienteBotaoOk = new javax.swing.JButton();
        CadastroClienteBotaoLimparCampos = new javax.swing.JButton();
        CadastroClienteBotaoOutroCadastro = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);

        jPanel1.setMaximumSize(new java.awt.Dimension(580, 580));
        jPanel1.setMinimumSize(new java.awt.Dimension(580, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 580));

        CadastroClienteTextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroClienteTextNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome*:");

        jLabel2.setText("CPF*:");

        jLabel4.setText("Data Nascimento:");

        jLabel5.setText("Endereço:");

        jLabel6.setText("Rua:");

        jLabel7.setText("Bairro:");

        jLabel8.setText("Número:");

        jLabel9.setText("Telefone:");

        CadastroClienteBotaoCancelar.setText("Cancelar");
        CadastroClienteBotaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroClienteBotaoCancelarActionPerformed(evt);
            }
        });

        CadastroClienteBotaoOk.setText("Ok");
        CadastroClienteBotaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroClienteBotaoOkActionPerformed(evt);
            }
        });

        CadastroClienteBotaoLimparCampos.setText("Limpar Campos");
        CadastroClienteBotaoLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroClienteBotaoLimparCamposActionPerformed(evt);
            }
        });

        CadastroClienteBotaoOutroCadastro.setText("Outro Cadastro?");
        CadastroClienteBotaoOutroCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroClienteBotaoOutroCadastroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18));
        jLabel10.setText("Cadastro de Clientes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(CadastroClienteTextRua, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                                    .addComponent(CadastroClienteTextBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel9)
                                                            .addComponent(jLabel8)
                                                            .addComponent(CadastroClienteTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE))
                                                    .addComponent(CadastroClienteTextTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CadastroClienteTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(CadastroClienteTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CadastroClienteTextDtaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(CadastroClienteBotaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CadastroClienteBotaoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(CadastroClienteBotaoOutroCadastro)
                        .addGap(18, 18, 18)
                        .addComponent(CadastroClienteBotaoLimparCampos)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(CadastroClienteTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CadastroClienteTextDtaNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CadastroClienteTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CadastroClienteTextRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CadastroClienteTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CadastroClienteTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CadastroClienteTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)))
                .addGap(54, 54, 54)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastroClienteBotaoOk)
                    .addComponent(CadastroClienteBotaoCancelar)
                    .addComponent(CadastroClienteBotaoOutroCadastro)
                    .addComponent(CadastroClienteBotaoLimparCampos))
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

	private void CadastroClienteTextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroClienteTextNomeActionPerformed
		// TODO add your handling code here:
}//GEN-LAST:event_CadastroClienteTextNomeActionPerformed

	private void CadastroClienteBotaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroClienteBotaoOkActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
}//GEN-LAST:event_CadastroClienteBotaoOkActionPerformed

	private void CadastroClienteBotaoLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroClienteBotaoLimparCamposActionPerformed
		CadastroClienteTextNome.setText("");
		CadastroClienteTextCpf.setText("");
		CadastroClienteTextDtaNasc.setText("");
		CadastroClienteTextBairro.setText("");
		CadastroClienteTextNumero.setText("");
		CadastroClienteTextRua.setText("");
		CadastroClienteTextTelefone.setText("");
}//GEN-LAST:event_CadastroClienteBotaoLimparCamposActionPerformed

	private void CadastroClienteBotaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroClienteBotaoCancelarActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_CadastroClienteBotaoCancelarActionPerformed

	private void CadastroClienteBotaoOutroCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroClienteBotaoOutroCadastroActionPerformed
		this.principal.setEnabled(true);
		this.dispose();
	}//GEN-LAST:event_CadastroClienteBotaoOutroCadastroActionPerformed

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
    private javax.swing.JButton CadastroClienteBotaoCancelar;
    private javax.swing.JButton CadastroClienteBotaoLimparCampos;
    private javax.swing.JButton CadastroClienteBotaoOk;
    private javax.swing.JButton CadastroClienteBotaoOutroCadastro;
    private javax.swing.JTextField CadastroClienteTextBairro;
    private javax.swing.JTextField CadastroClienteTextCpf;
    private javax.swing.JTextField CadastroClienteTextDtaNasc;
    private javax.swing.JTextField CadastroClienteTextNome;
    private javax.swing.JTextField CadastroClienteTextNumero;
    private javax.swing.JTextField CadastroClienteTextRua;
    private javax.swing.JTextField CadastroClienteTextTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables

}
