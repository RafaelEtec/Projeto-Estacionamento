/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psv;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author rafae
 */
public class JFUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JFUsuario
     */
    public JFUsuario() {
        initComponents();
        lblMensagem.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbConsulta = new javax.swing.JTable();
        pnlEspaco = new javax.swing.JPanel();
        pnlBotoes7 = new javax.swing.JPanel();
        btnIncluirUsu = new javax.swing.JButton();
        btnAlterarUsu = new javax.swing.JButton();
        btnExcluirUsu = new javax.swing.JButton();
        btnPesquisarUsu = new javax.swing.JButton();
        btnLimparUsu = new javax.swing.JButton();
        btnVoltarUsu = new javax.swing.JButton();
        pnlCentral = new javax.swing.JPanel();
        lvlCodigo = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        rbAdmin = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        pnlTitulo = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        txtTitulo2 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        tbConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Cor", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbConsultaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbConsulta);

        pnlEspaco.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout pnlEspacoLayout = new javax.swing.GroupLayout(pnlEspaco);
        pnlEspaco.setLayout(pnlEspacoLayout);
        pnlEspacoLayout.setHorizontalGroup(
            pnlEspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlEspacoLayout.setVerticalGroup(
            pnlEspacoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlBotoes7.setBackground(new java.awt.Color(255, 255, 255));

        btnIncluirUsu.setText("Incluir");
        btnIncluirUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluirUsuMouseClicked(evt);
            }
        });

        btnAlterarUsu.setText("Alterar");
        btnAlterarUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarUsuMouseClicked(evt);
            }
        });

        btnExcluirUsu.setText("Excluir");
        btnExcluirUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirUsuMouseClicked(evt);
            }
        });

        btnPesquisarUsu.setText("Pesquisar");
        btnPesquisarUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarUsuMouseClicked(evt);
            }
        });
        btnPesquisarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarUsuActionPerformed(evt);
            }
        });

        btnLimparUsu.setText("Limpar");
        btnLimparUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparUsuMouseClicked(evt);
            }
        });

        btnVoltarUsu.setText("Voltar");
        btnVoltarUsu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarUsuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoes7Layout = new javax.swing.GroupLayout(pnlBotoes7);
        pnlBotoes7.setLayout(pnlBotoes7Layout);
        pnlBotoes7Layout.setHorizontalGroup(
            pnlBotoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoes7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnIncluirUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisarUsu)
                .addGap(18, 18, 18)
                .addComponent(btnLimparUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBotoes7Layout.setVerticalGroup(
            pnlBotoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoes7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoes7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltarUsu, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btnIncluirUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterarUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisarUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparUsu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlCentral.setBackground(new java.awt.Color(204, 204, 255));

        lvlCodigo.setText("Código:");

        lblLogin.setText("Login:");

        lblNome.setText("       Nome:");

        lblMensagem.setText("Mensagem");

        txtCodigo.setMargin(new java.awt.Insets(0, 0, 0, 0));

        txtLogin.setMargin(new java.awt.Insets(0, 0, 0, 0));

        lblSenha.setText("Senha:");

        rbAdmin.setBackground(new java.awt.Color(255, 255, 255));
        rbAdmin.setText("Administrador");
        rbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lvlCodigo)
                    .addComponent(lblSenha)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(lblLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin))
                    .addComponent(txtNome)
                    .addComponent(txtSenha))
                .addGap(143, 143, 143))
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(lblMensagem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbAdmin)
                .addGap(36, 36, 36))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvlCodigo)))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogin))))
                .addGap(4, 4, 4)
                .addComponent(rbAdmin)
                .addGap(1, 1, 1)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensagem)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));

        txtTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(204, 204, 255));
        txtTitulo.setText("Cadastramento de Usuários");

        txtTitulo2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTitulo2.setForeground(new java.awt.Color(204, 204, 255));
        txtTitulo2.setText("por Rafael Ferreira Goulart");

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(txtTitulo2)
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTitulo2)
                .addGap(19, 19, 19))
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtTitulo)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBotoes7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlEspaco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane4)
            .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnlBotoes7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlEspaco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbConsultaMouseClicked
        
    }//GEN-LAST:event_tbConsultaMouseClicked

    private void btnIncluirUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirUsuMouseClicked
        //Criando e inserindo valores no Banco de dados
        Connection con = Conexao.abrirConexao();
        UsuarioBean cb = new UsuarioBean();
        UsuarioDAO cd = new UsuarioDAO(con);

        cb.setCodigo(txtCodigo.getText());
        cb.setLogin(txtLogin.getText());
        cb.setNome(txtNome.getText());
        cb.setSenha(txtSenha.getText());
        cb.setAdmin(rbAdmin.isSelected());
        
        lblMensagem.setText(cd.inserirUsuario(cb));
        
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnIncluirUsuMouseClicked

    private void btnAlterarUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarUsuMouseClicked
        //Alterando valores no Banco de dados
        Connection con = Conexao.abrirConexao();
        UsuarioBean cb = new UsuarioBean();
        UsuarioDAO cd = new UsuarioDAO(con);

        cb.setCodigo(txtCodigo.getText());
        cb.setLogin(txtLogin.getText());
        cb.setNome(txtNome.getText());
        cb.setSenha(txtSenha.getText());
        cb.setAdmin(rbAdmin.isSelected());
        
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnAlterarUsuMouseClicked

    private void btnExcluirUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirUsuMouseClicked
        //Excluindo registros da tabela no Banco de dados
        Connection con = Conexao.abrirConexao();
        UsuarioBean cb = new UsuarioBean();
        UsuarioDAO cd = new UsuarioDAO(con);

        cb.setCodigo(txtCodigo.getText());

        Object [] opcoes = {"Sim","Não"};
        int i = JOptionPane.showOptionDialog(
                    null,
                    "Deseja excluir o Usuário: "+txtCodigo.getText()+"?",
                    "Exclusão",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);
        if (i == JOptionPane.YES_NO_OPTION) {
            lblMensagem.setText(cd.excluirUsuario(cb));
        }
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnExcluirUsuMouseClicked

    private void btnPesquisarUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarUsuMouseClicked
        //Pesquisando valores do Banco de dados
        Connection con = Conexao.abrirConexao();

        CarroDAO cd = new CarroDAO(con);

        List<CarroBean> listaCarro = new ArrayList<CarroBean>();
        listaCarro = cd.listarTodos();
        DefaultTableModel tbm = (DefaultTableModel) tbConsulta.getModel();
        
        Conexao.fecharConexao(con);
    }//GEN-LAST:event_btnPesquisarUsuMouseClicked

    private void btnPesquisarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarUsuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarUsuActionPerformed

    private void btnLimparUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparUsuMouseClicked
        
    }//GEN-LAST:event_btnLimparUsuMouseClicked

    private void btnVoltarUsuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarUsuMouseClicked
        //Fecha a janela
        System.exit(0);
    }//GEN-LAST:event_btnVoltarUsuMouseClicked

    private void rbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdminActionPerformed

    }//GEN-LAST:event_rbAdminActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterar1;
    private javax.swing.JButton btnAlterar2;
    private javax.swing.JButton btnAlterar3;
    private javax.swing.JButton btnAlterar4;
    private javax.swing.JButton btnAlterar5;
    private javax.swing.JButton btnAlterar6;
    private javax.swing.JButton btnAlterarUsu;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnExcluir2;
    private javax.swing.JButton btnExcluir3;
    private javax.swing.JButton btnExcluir4;
    private javax.swing.JButton btnExcluir5;
    private javax.swing.JButton btnExcluir6;
    private javax.swing.JButton btnExcluirUsu;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFechar1;
    private javax.swing.JButton btnFechar2;
    private javax.swing.JButton btnFechar3;
    private javax.swing.JButton btnFechar4;
    private javax.swing.JButton btnFechar5;
    private javax.swing.JButton btnFechar6;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnIncluir1;
    private javax.swing.JButton btnIncluir2;
    private javax.swing.JButton btnIncluir3;
    private javax.swing.JButton btnIncluir4;
    private javax.swing.JButton btnIncluir5;
    private javax.swing.JButton btnIncluir6;
    private javax.swing.JButton btnIncluirUsu;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnLimpar2;
    private javax.swing.JButton btnLimpar3;
    private javax.swing.JButton btnLimpar4;
    private javax.swing.JButton btnLimpar5;
    private javax.swing.JButton btnLimpar6;
    private javax.swing.JButton btnLimparUsu;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisar1;
    private javax.swing.JButton btnPesquisar2;
    private javax.swing.JButton btnPesquisar3;
    private javax.swing.JButton btnPesquisar4;
    private javax.swing.JButton btnPesquisar5;
    private javax.swing.JButton btnPesquisar6;
    private javax.swing.JButton btnPesquisarUsu;
    private javax.swing.JButton btnVoltarUsu;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lvlCodigo;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlBotoes1;
    private javax.swing.JPanel pnlBotoes2;
    private javax.swing.JPanel pnlBotoes3;
    private javax.swing.JPanel pnlBotoes4;
    private javax.swing.JPanel pnlBotoes5;
    private javax.swing.JPanel pnlBotoes6;
    private javax.swing.JPanel pnlBotoes7;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlEspaco;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JRadioButton rbAdmin;
    private javax.swing.JTable tbConsulta;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JLabel txtTitulo2;
    // End of variables declaration//GEN-END:variables
}
