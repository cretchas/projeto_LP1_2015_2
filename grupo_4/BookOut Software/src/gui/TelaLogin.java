/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;
import repositorio.RepositorioUsuario;
import src.Usuario;



public class TelaLogin extends javax.swing.JFrame {
    
    RepositorioUsuario repusr = new RepositorioUsuario();
    
    /**
     * Creates new form Tela
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lUsuario = new javax.swing.JLabel();
        lSenha = new javax.swing.JLabel();
        bEntrar = new javax.swing.JButton();
        fUsuario = new javax.swing.JTextField();
        fSenha = new javax.swing.JPasswordField();
        lTitulo = new javax.swing.JLabel();
        btUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lTitulo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lUsuario.setText("Usuario:");

        lSenha.setText("Senha:");

        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        lTitulo.setFont(new java.awt.Font("Harrington", 0, 30)); // NOI18N
        lTitulo.setText("Book Out");

        btUsuario.setText("Cadastrar");
        btUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/man7.png"))); // NOI18N

        lTitulo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lTitulo1.setText("A sua ferramenta rápida e prática para aluguel de livros!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lUsuario)
                            .addComponent(lSenha))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(lTitulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(lTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lTitulo1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lSenha))
                .addGap(26, 26, 26)
                .addComponent(bEntrar)
                .addGap(18, 18, 18)
                .addComponent(btUsuario)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    public void AtivarBotoes(TelaPrincipal tP){
           
        tP.btUsuarios.setEnabled (true);
        tP.btLivros.setEnabled(true);
        tP.btReserva.setEnabled(true);
    }
    */
    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        
        // RepositorioUsuario repusr = new RepositorioUsuario();
        
        if(fUsuario.getText().equals("admin") && (fSenha.getText().equals("admin"))) {
            
            TelaPrincipalAdmin tMain = new TelaPrincipalAdmin();
            
            
            tMain.setVisible(true);
            
            this.dispose();
            
        }else{
            Usuario u = new Usuario();
            
            u = RepositorioUsuario.pegarInstancia().procurarUsuario(fUsuario.getText());
            
            if(u != null){
				
                                if(u.getSenha().equals(fSenha.getText())){
                                    
                                    //if(usr.getSenha().equals(fSenha.getText())){
					       
                                    TelaPrincipalUser tMain = new TelaPrincipalUser();
                                    
                                    tMain.setVisible(true);
                                    // tMain.lUsuario.
            
                                    this.dispose();
                                } else{
                                
            JOptionPane.showMessageDialog(null, "Senha incorreta");
                                }
        } else{
                
                JOptionPane.showMessageDialog(null, "Usuário não existe");
            }
    }//GEN-LAST:event_bEntrarActionPerformed
    }
    
    private void btUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuarioActionPerformed
        new TelaUsuariosLogin().setVisible(true);
        
    }//GEN-LAST:event_btUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton btUsuario;
    private javax.swing.JPasswordField fSenha;
    private javax.swing.JTextField fUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lTitulo1;
    private javax.swing.JLabel lUsuario;
    // End of variables declaration//GEN-END:variables
}
