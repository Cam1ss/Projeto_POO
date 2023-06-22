/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal.calcexpress.cadastroo;

import static java.awt.event.KeyEvent.VK_ENTER;

import principal.calcexpress.Login.login;



/**
 *
 * @author Welington
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public static String name;
    public static String username;
    public static String password;
    public static int DISPOSE;
    
    public Cadastro() {
        initComponents();
        obrigatorio.setVisible(false);
        obrigatorio1.setVisible(false);
        obrigatorio2.setVisible(false);
        obrigatorio3.setVisible(false);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        obrigatorio3 = new javax.swing.JLabel();
        obrigatorio = new javax.swing.JLabel();
        obrigatorio1 = new javax.swing.JLabel();
        obrigatorio2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        aviso = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        reptsenha1 = new javax.swing.JPasswordField();
        senha1 = new javax.swing.JPasswordField();
        usuario1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        BarMenu = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(711, 400));
        getContentPane().setLayout(null);

        obrigatorio3.setForeground(new java.awt.Color(51, 0, 51));
        obrigatorio3.setText("*obrigatório");
        getContentPane().add(obrigatorio3);
        obrigatorio3.setBounds(530, 220, 100, 20);

        obrigatorio.setForeground(new java.awt.Color(51, 0, 51));
        obrigatorio.setText("*obrigatório");
        getContentPane().add(obrigatorio);
        obrigatorio.setBounds(530, 100, 70, 20);

        obrigatorio1.setForeground(new java.awt.Color(51, 0, 51));
        obrigatorio1.setText("*obrigatório");
        getContentPane().add(obrigatorio1);
        obrigatorio1.setBounds(530, 140, 70, 20);

        obrigatorio2.setForeground(new java.awt.Color(51, 0, 51));
        obrigatorio2.setText("*obrigatório");
        getContentPane().add(obrigatorio2);
        obrigatorio2.setBounds(530, 180, 80, 20);

        jPanel1.setBackground(new java.awt.Color(189, 49, 63));
        jPanel1.setForeground(new java.awt.Color(212, 66, 79));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(245, 245, 119));
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 100, 60, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(245, 245, 119));
        jLabel4.setText("Username:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 140, 100, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 119));
        jLabel5.setText("Senha:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 180, 60, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(245, 245, 119));
        jLabel6.setText("Confirmar senha:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 220, 150, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/user.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 20, 50, 50);

        cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/b.cadastrar.png"))); // NOI18N
        cadastrar.setBorder(null);
        cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });
        cadastrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarKeyPressed(evt);
            }
        });
        jPanel1.add(cadastrar);
        cadastrar.setBounds(120, 280, 110, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/b.cadastrar.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(110, 270, 130, 50);

        aviso.setForeground(new java.awt.Color(51, 0, 51));
        aviso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(aviso);
        aviso.setBounds(80, 250, 190, 20);

        nome.setBackground(new java.awt.Color(212, 66, 79));
        nome.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        nome.setForeground(new java.awt.Color(245, 245, 119));
        nome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nome.setBorder(null);
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeKeyPressed(evt);
            }
        });
        jPanel1.add(nome);
        nome.setBounds(170, 100, 150, 20);

        reptsenha1.setBackground(new java.awt.Color(212, 66, 79));
        reptsenha1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        reptsenha1.setForeground(new java.awt.Color(245, 245, 119));
        reptsenha1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        reptsenha1.setBorder(null);
        reptsenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reptsenha1ActionPerformed(evt);
            }
        });
        reptsenha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                reptsenha1KeyPressed(evt);
            }
        });
        jPanel1.add(reptsenha1);
        reptsenha1.setBounds(170, 220, 150, 20);

        senha1.setBackground(new java.awt.Color(212, 66, 79));
        senha1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        senha1.setForeground(new java.awt.Color(245, 245, 119));
        senha1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        senha1.setBorder(null);
        senha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha1ActionPerformed(evt);
            }
        });
        senha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senha1KeyPressed(evt);
            }
        });
        jPanel1.add(senha1);
        senha1.setBounds(170, 180, 150, 20);

        usuario1.setBackground(new java.awt.Color(212, 66, 79));
        usuario1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        usuario1.setForeground(new java.awt.Color(245, 245, 119));
        usuario1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usuario1.setBorder(null);
        usuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usuario1KeyPressed(evt);
            }
        });
        jPanel1.add(usuario1);
        usuario1.setBounds(170, 140, 150, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(180, 0, 340, 370);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login/cadastro.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 370);

        jSeparator2.setBackground(new java.awt.Color(245, 245, 119));
        jSeparator2.setForeground(new java.awt.Color(245, 245, 119));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(260, 120, 190, 20);

        jMenu5.setForeground(new java.awt.Color(51, 0, 51));
        jMenu5.setText("Menu");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/retornar.png"))); // NOI18N
        jMenu6.setText("Retornar");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu6);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/sair.png"))); // NOI18N
        jMenu3.setText("Sair");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu3);

        BarMenu.add(jMenu5);

        setJMenuBar(BarMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dados(){
    
        name = nome.getText();
           username = usuario1.getText();
           password = senha1.getText();
           
           if (nome.getText().trim().isEmpty()){
               obrigatorio.setVisible(true);
               
           } else {
               obrigatorio.setVisible(false);
           }
               
                if (usuario1.getText().trim().isEmpty()){
               obrigatorio1.setVisible(true);
                } else {
               obrigatorio1.setVisible(false);
                }
                    
                    if (senha1.getText().trim().isEmpty()){
                    obrigatorio2.setVisible(true);
                     
                    } else {
                    obrigatorio2.setVisible(false);
                    }
                        
                        if (reptsenha1.getText().trim().isEmpty()){
                        obrigatorio3.setVisible(true);

                         } else {
                        obrigatorio3.setVisible(false);
                          if(senha1.getText().equals(reptsenha1.getText())){
                         
                                login lg = new login();
                                lg.setVisible(true);
                                lg.pack();
                                lg.setLocationRelativeTo(null);
                                this.dispose();
                         }
                            else {
                                aviso.setText("A senha está incorreta");
                            }
                               
                        }
                       
        
    }
    
    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:
     dados(); 
    }//GEN-LAST:event_cadastrarActionPerformed

    private void nomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == VK_ENTER){
            usuario1.requestFocus();
        }
        
    }//GEN-LAST:event_nomeKeyPressed

    private void usuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuario1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == VK_ENTER){
            senha1.requestFocus();
        }
    }//GEN-LAST:event_usuario1KeyPressed

    private void senha1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senha1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == VK_ENTER){
            reptsenha1.requestFocus();
        }
    }//GEN-LAST:event_senha1KeyPressed

    private void reptsenha1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reptsenha1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == VK_ENTER){
            cadastrar.requestFocus();
        }
    }//GEN-LAST:event_reptsenha1KeyPressed

    private void senha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senha1ActionPerformed

    private void reptsenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reptsenha1ActionPerformed
        // TODO add your handling code here:
        if(senha1.getText().equals(reptsenha1.getText())){
                            }
                            else {
                                aviso.setText("A senha está incorreta");
                            }
    }//GEN-LAST:event_reptsenha1ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void cadastrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == VK_ENTER){
            dados();
        }
    }//GEN-LAST:event_cadastrarKeyPressed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        login log = new login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked

    }//GEN-LAST:event_jMenu5MouseClicked

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMenu;
    public javax.swing.JLabel aviso;
    public javax.swing.JButton cadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField nome;
    public javax.swing.JLabel obrigatorio;
    public javax.swing.JLabel obrigatorio1;
    public javax.swing.JLabel obrigatorio2;
    public javax.swing.JLabel obrigatorio3;
    public javax.swing.JPasswordField reptsenha1;
    public javax.swing.JPasswordField senha1;
    public javax.swing.JTextField usuario1;
    // End of variables declaration//GEN-END:variables
}
