/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on 07/11/2010, 20:05:53
 */

package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

import org.jdesktop.layout.GroupLayout;

import persistencia.AccessControl;

/**
 *AccessControl
 * @author isac
 */
public class Principal extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2361602647216949336L;
	/** Creates new form NewJFrame */
    public Principal() {
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new JLayeredPane();
        painelLogin = new JLayeredPane();
        painelLoginLabelCabcalho = new JLabel();
        painelLoginCampoNome = new JTextField();
        painelLoginLabelNome = new JLabel();
        painelLoginCampoSenha = new JPasswordField();
        painelLoginLabelSenha = new JLabel();
        painelLoginBotaoOk = new JButton();
        painelLoginBotaoSair = new JButton();
        painelTeste = new JLayeredPane();
        jLabel1 = new JLabel();
        jMenuBar1 = new JMenuBar();
        menuPrincipalArquivo = new JMenu();
        menuItemArquivoSair = new JMenuItem();
        menuPrincipalCadastros = new JMenu();
        menuItemCadastrosClientes = new JMenuItem();
        menuItemCadastrosFornecedores = new JMenuItem();
        menuItemCadastrosItens = new JMenuItem();
        menuPrincipalConsultas = new JMenu();
        menuItemConsultasClientes = new JMenuItem();
        menuItemConsultasFornecedores = new JMenuItem();
        menuItemConsultasItens = new JMenuItem();
        menuPrincipalMovimento = new JMenu();
        menuItemMovimentoCompras = new JMenuItem();
        menuItemMovimentoVendas = new JMenuItem();
        menuPrincipalAjuda = new JMenu();
        menuItemAjudaDocumentacao = new JMenuItem();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de controle de uma loja");
        setBounds(new Rectangle(0, 0, 600, 600));
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setForeground(Color.white);
        setIconImage(Toolkit.getDefaultToolkit().getImage("fundo.jpg"));
        setIconImages(null);
        setMinimumSize(new Dimension(600, 600));

        painelLoginLabelCabcalho.setText("Nome de usuário e senha para acesso:");
        painelLoginLabelCabcalho.setBounds(30, 20, 280, 18);
        painelLogin.add(painelLoginLabelCabcalho, JLayeredPane.DEFAULT_LAYER);
        painelLoginCampoNome.setBounds(107, 60, 200, 28);
        painelLogin.add(painelLoginCampoNome, JLayeredPane.DEFAULT_LAYER);

        painelLoginLabelNome.setText("Nome:");
        painelLoginLabelNome.setBounds(30, 70, 46, 18);
        painelLogin.add(painelLoginLabelNome, JLayeredPane.DEFAULT_LAYER);
        painelLoginCampoSenha.setBounds(105, 120, 200, 28);
        painelLogin.add(painelLoginCampoSenha, JLayeredPane.DEFAULT_LAYER);

        painelLoginLabelSenha.setText("Senha:");
        painelLoginLabelSenha.setBounds(30, 120, 70, 18);
        painelLogin.add(painelLoginLabelSenha, JLayeredPane.DEFAULT_LAYER);

        painelLoginBotaoOk.setText("Ok");
        painelLoginBotaoOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                painelLoginBotaoOkActionPerformed(evt);
            }
        });
        painelLoginBotaoOk.setBounds(80, 170, 80, 30);
        painelLogin.add(painelLoginBotaoOk, JLayeredPane.DEFAULT_LAYER);

        painelLoginBotaoSair.setText("Sair");
        painelLoginBotaoSair.setBounds(177, 170, 80, 30);
        painelLogin.add(painelLoginBotaoSair, JLayeredPane.DEFAULT_LAYER);

        painelLogin.setBounds(101, 100, 340, 220);
        mainPanel.add(painelLogin, JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText("painel de teste");
        jLabel1.setBounds(140, 180, 330, 18);
        painelTeste.add(jLabel1, JLayeredPane.DEFAULT_LAYER);

        painelTeste.setVisible(false);

        painelTeste.setBounds(0, 0, 580, 580);
        mainPanel.add(painelTeste, JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setToolTipText("Menu Selecao Geral");
        jMenuBar1.setName("MenuPrincipal"); // NOI18N
        jMenuBar1.setPreferredSize(new Dimension(403, 30));

        menuPrincipalArquivo.setBackground(new Color(21, 17, 17));
        menuPrincipalArquivo.setText("Arquivo");
        menuPrincipalArquivo.setPreferredSize(new Dimension(71, 30));

        menuItemArquivoSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
        menuItemArquivoSair.setText("Sair");
        menuItemArquivoSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemArquivoSairActionPerformed(evt);
            }
        });
        menuPrincipalArquivo.add(menuItemArquivoSair);

        jMenuBar1.add(menuPrincipalArquivo);

        menuPrincipalCadastros.setText("Cadastros");
        menuPrincipalCadastros.setToolTipText("Menu onde se pode cadastrar clientes,fornecedores e itens");
        menuPrincipalCadastros.setEnabled(false);

        menuItemCadastrosClientes.setText("Clientes");
        menuItemCadastrosClientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemCadastrosClientesActionPerformed(evt);
            }
        });
        menuPrincipalCadastros.add(menuItemCadastrosClientes);

        menuItemCadastrosFornecedores.setText("Fornecedores");
        menuItemCadastrosFornecedores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemCadastrosFornecedoresActionPerformed(evt);
            }
        });
        menuPrincipalCadastros.add(menuItemCadastrosFornecedores);

        menuItemCadastrosItens.setText("Itens");
        menuItemCadastrosItens.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemCadastrosItensActionPerformed(evt);
            }
        });
        menuPrincipalCadastros.add(menuItemCadastrosItens);

        jMenuBar1.add(menuPrincipalCadastros);

        menuPrincipalConsultas.setText("Consultas");
        menuPrincipalConsultas.setToolTipText("Menu onde se podem realizar pesquisar relacionadas a clientes,fornecedores e itens");
        menuPrincipalConsultas.setEnabled(false);

        menuItemConsultasClientes.setText("Clientes");
        menuItemConsultasClientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemConsultasClientesActionPerformed(evt);
            }
        });
        menuPrincipalConsultas.add(menuItemConsultasClientes);

        menuItemConsultasFornecedores.setText("Fornecedores");
        menuItemConsultasFornecedores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemConsultasFornecedoresActionPerformed(evt);
            }
        });
        menuPrincipalConsultas.add(menuItemConsultasFornecedores);

        menuItemConsultasItens.setText("Itens");
        menuItemConsultasItens.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemConsultasItensActionPerformed(evt);
            }
        });
        menuPrincipalConsultas.add(menuItemConsultasItens);

        jMenuBar1.add(menuPrincipalConsultas);

        menuPrincipalMovimento.setText("Movimento");
        menuPrincipalMovimento.setToolTipText("Menu onde se encontam as operações de compra e venda");
        menuPrincipalMovimento.setEnabled(false);

        menuItemMovimentoCompras.setText("Compras");
        menuItemMovimentoCompras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemMovimentoComprasActionPerformed(evt);
            }
        });
        menuPrincipalMovimento.add(menuItemMovimentoCompras);

        menuItemMovimentoVendas.setText("Vendas");
        menuItemMovimentoVendas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemMovimentoVendasActionPerformed(evt);
            }
        });
        menuPrincipalMovimento.add(menuItemMovimentoVendas);

        jMenuBar1.add(menuPrincipalMovimento);

        menuPrincipalAjuda.setText("Ajuda");
        menuPrincipalAjuda.setToolTipText("Menu Ajuda");

        menuItemAjudaDocumentacao.setText("Documentacao");
        menuItemAjudaDocumentacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuItemAjudaDocumentacaoActionPerformed(evt);
            }
        });
        menuPrincipalAjuda.add(menuItemAjudaDocumentacao);

        jMenuBar1.add(menuPrincipalAjuda);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(mainPanel, GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(mainPanel, GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void menuItemArquivoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemArquivoSairActionPerformed
		this.dispose();
	}//GEN-LAST:event_menuItemArquivoSairActionPerformed

	private void menuItemCadastrosClientesActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrosClientesActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_menuItemCadastrosClientesActionPerformed

	private void menuItemCadastrosFornecedoresActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrosFornecedoresActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_menuItemCadastrosFornecedoresActionPerformed

	private void menuItemCadastrosItensActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemCadastrosItensActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_menuItemCadastrosItensActionPerformed

	private void menuItemConsultasClientesActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemConsultasClientesActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_menuItemConsultasClientesActionPerformed

	private void menuItemConsultasFornecedoresActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemConsultasFornecedoresActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_menuItemConsultasFornecedoresActionPerformed

	private void menuItemConsultasItensActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemConsultasItensActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_menuItemConsultasItensActionPerformed

	private void menuItemMovimentoComprasActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemMovimentoComprasActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_menuItemMovimentoComprasActionPerformed

	private void menuItemMovimentoVendasActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemMovimentoVendasActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_menuItemMovimentoVendasActionPerformed

	private void menuItemAjudaDocumentacaoActionPerformed(ActionEvent evt) {//GEN-FIRST:event_menuItemAjudaDocumentacaoActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_menuItemAjudaDocumentacaoActionPerformed

	private void painelLoginBotaoOkActionPerformed(ActionEvent evt) {//GEN-FIRST:event_painelLoginBotaoOkActionPerformed
	if (AccessControl.login(painelLoginCampoNome.getText(),new String(painelLoginCampoSenha.getPassword()),true)){
		menuPrincipalCadastros.setEnabled(true);
		menuPrincipalConsultas.setEnabled(true);
		menuPrincipalMovimento.setEnabled(true);
		painelLogin.setVisible(false);
		painelTeste.setVisible(true);
		JOptionPane.showConfirmDialog(null,"Bem Vindo "+painelLoginCampoNome.getText(),"mensagem",JOptionPane.CLOSED_OPTION);
		}
		else{
			JOptionPane.showConfirmDialog(null,"Nome de usuário ou senha estão incorretos","mensagem",JOptionPane.CLOSED_OPTION);
			painelLoginCampoNome.setText("");
			painelLoginCampoSenha.setText("");
		}
	}//GEN-LAST:event_painelLoginBotaoOkActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JLabel jLabel1;
    private JMenuBar jMenuBar1;
    private JLayeredPane mainPanel;
    private JMenuItem menuItemAjudaDocumentacao;
    private JMenuItem menuItemArquivoSair;
    private JMenuItem menuItemCadastrosClientes;
    private JMenuItem menuItemCadastrosFornecedores;
    private JMenuItem menuItemCadastrosItens;
    private JMenuItem menuItemConsultasClientes;
    private JMenuItem menuItemConsultasFornecedores;
    private JMenuItem menuItemConsultasItens;
    private JMenuItem menuItemMovimentoCompras;
    private JMenuItem menuItemMovimentoVendas;
    private JMenu menuPrincipalAjuda;
    private JMenu menuPrincipalArquivo;
    private JMenu menuPrincipalCadastros;
    private JMenu menuPrincipalConsultas;
    private JMenu menuPrincipalMovimento;
    private JLayeredPane painelLogin;
    private JButton painelLoginBotaoOk;
    private JButton painelLoginBotaoSair;
    private JTextField painelLoginCampoNome;
    private JPasswordField painelLoginCampoSenha;
    private JLabel painelLoginLabelCabcalho;
    private JLabel painelLoginLabelNome;
    private JLabel painelLoginLabelSenha;
    private JLayeredPane painelTeste;
    // End of variables declaration//GEN-END:variables

}
