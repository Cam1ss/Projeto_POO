/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.escolhas;

import javax.swing.ImageIcon;
import principal.calcexpress.Menu.Equipe;
import principal.calcexpress.Menu.Menu;
import principal.calcexpress.Menu.Sobre;

/**
 *
 * @author Andre
 */
public class EscolhaTipFig extends javax.swing.JFrame {

    /**
     * Creates new form EscolhaTipFig
     */
    public EscolhaTipFig() {
        initComponents();
        ImageIcon icon = new ImageIcon((new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/icon.png")).getImage()));  
        setIconImage(icon.getImage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        CaminhoEspaciais = new javax.swing.JLabel();
        CaminhoPlanas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BarMenu = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CaminhoEspaciais.setForeground(new java.awt.Color(153, 0, 51));
        CaminhoEspaciais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CaminhoEspaciais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CaminhoEspaciaisMouseClicked(evt);
            }
        });
        getContentPane().add(CaminhoEspaciais, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 150, 140));

        CaminhoPlanas.setBackground(new java.awt.Color(204, 255, 102));
        CaminhoPlanas.setForeground(new java.awt.Color(153, 0, 51));
        CaminhoPlanas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CaminhoPlanas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CaminhoPlanasMouseClicked(evt);
            }
        });
        getContentPane().add(CaminhoPlanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/EscolhaFigura.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, 370));

        jLabel2.setText("tem uma label aqui em cima");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, 20));

        jLabel3.setText("tem uma label aqui em cima");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, -1, 20));

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

    private void CaminhoPlanasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaminhoPlanasMouseClicked
        EscolhaFigPlan efp = new EscolhaFigPlan();
        efp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CaminhoPlanasMouseClicked

    private void CaminhoEspaciaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CaminhoEspaciaisMouseClicked
        EscolhaFigEsp efe = new EscolhaFigEsp();
        efe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CaminhoEspaciaisMouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked

    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        Menu mn = new Menu();
        mn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu6MouseClicked

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
            java.util.logging.Logger.getLogger(EscolhaTipFig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscolhaTipFig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscolhaTipFig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscolhaTipFig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscolhaTipFig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMenu;
    private javax.swing.JLabel CaminhoEspaciais;
    private javax.swing.JLabel CaminhoPlanas;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
