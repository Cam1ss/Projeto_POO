/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal.calcexpress.Menu;

import br.edu.escolhas.EscolhaTipFig;
import principal.calcexpress.cadastroo.Cadastro;



/**
 *
 * @author Welington
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        nome7.setText(Cadastro.name + ":)");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nome7 = new javax.swing.JLabel();
        jhora = new javax.swing.JLabel();
        capa = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BarMenu = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(699, 373));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/b.iniciar.png"))); // NOI18N
        iniciar.setBorder(null);
        iniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarMouseClicked(evt);
            }
        });
        getContentPane().add(iniciar);
        iniciar.setBounds(270, 250, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/b.iniciar.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 240, 160, 60);

        nome7.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        nome7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome7.setText("Nome");
        getContentPane().add(nome7);
        nome7.setBounds(160, 180, 380, 40);

        jhora.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        getContentPane().add(jhora);
        jhora.setBounds(10, 320, 80, 20);

        capa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/menu.png"))); // NOI18N
        capa.setText("jLabel1");
        getContentPane().add(capa);
        capa.setBounds(0, -40, 700, 370);

        jPanel1.setBackground(new java.awt.Color(248, 233, 149));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 250, 700, 100);

        jMenu5.setForeground(new java.awt.Color(51, 0, 51));
        jMenu5.setText("Menu");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/grup.png"))); // NOI18N
        jMenu1.setText("Equipe");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/icon.png"))); // NOI18N
        jMenu2.setText("Sobre");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu5.add(jMenu2);

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

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
        
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
         Sobre sb = new Sobre();
         sb.setVisible(true);
         sb.pack();
         sb.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        Equipe eq = new Equipe();
         eq.setVisible(true);
         eq.pack();
         eq.setLocationRelativeTo(null);
         this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
      
    }//GEN-LAST:event_formWindowOpened

    private void iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarMouseClicked
        EscolhaTipFig etf = new EscolhaTipFig();
        etf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_iniciarMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMenu;
    public javax.swing.JLabel capa;
    public javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jhora;
    public javax.swing.JLabel nome7;
    // End of variables declaration//GEN-END:variables
}
