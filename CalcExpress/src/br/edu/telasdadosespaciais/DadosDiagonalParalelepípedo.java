/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.telasdadosespaciais;

import br.edu.escolhas.TipoCalculoParalelepípedo;
import br.edu.escolhas.UsarNovamente;
import br.edu.figurasgeometricasespaciais.Paralelepipedo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Andre
 */
public class DadosDiagonalParalelepípedo extends javax.swing.JFrame {

    
    
    
    public DadosDiagonalParalelepípedo() {
        initComponents();
        ImageIcon icon = new ImageIcon((new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/icon.png")).getImage()));  
        setIconImage(icon.getImage());
        this.setResizable(false);
        DiagonalText.setVisible(false);
        DiagonalLabel.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CalculeButton = new javax.swing.JButton();
        ComprimText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LarguraText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AlturaText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DiagonalLabel = new javax.swing.JLabel();
        DiagonalText = new javax.swing.JTextField();
        ResetButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BarMenu1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CalculeButton.setBackground(new java.awt.Color(153, 0, 51));
        CalculeButton.setForeground(new java.awt.Color(255, 255, 255));
        CalculeButton.setText("Calcule");
        CalculeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CalculeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 340, 90, -1));

        ComprimText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComprimTextMouseClicked(evt);
            }
        });
        ComprimText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprimTextActionPerformed(evt);
            }
        });
        getContentPane().add(ComprimText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 320, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Altura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 40));

        LarguraText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LarguraTextMouseClicked(evt);
            }
        });
        LarguraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LarguraTextActionPerformed(evt);
            }
        });
        getContentPane().add(LarguraText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 320, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Largura");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 40));

        AlturaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlturaTextMouseClicked(evt);
            }
        });
        getContentPane().add(AlturaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 320, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Comprimento");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 40));

        DiagonalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DiagonalLabel.setForeground(new java.awt.Color(153, 0, 0));
        DiagonalLabel.setText("Diagonal");
        getContentPane().add(DiagonalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 40));
        getContentPane().add(DiagonalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 320, -1));

        ResetButton3.setBackground(new java.awt.Color(153, 0, 51));
        ResetButton3.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton3.setText("Resetar");
        ResetButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/ParalelepípedoDiagonalDados.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu6.setForeground(new java.awt.Color(51, 0, 51));
        jMenu6.setText("Menu");
        jMenu6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/retornar.png"))); // NOI18N
        jMenu7.setText("Retornar");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu6.add(jMenu7);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/sair.png"))); // NOI18N
        jMenu4.setText("Sair");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu6.add(jMenu4);

        BarMenu1.add(jMenu6);

        setJMenuBar(BarMenu1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ComprimTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprimTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComprimTextActionPerformed

    private void LarguraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LarguraTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LarguraTextActionPerformed

    private void CalculeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculeButtonActionPerformed
            if(CalculeButton.getText().equals("Próximo")){
                UsarNovamente un = new UsarNovamente();
                un.setVisible(true); 
                this.dispose();
            }
            
            try{
            if (LarguraText.getText().trim().equals("")){
                   LarguraText.setText("Campo Vazio");
            }
            else if (Double.parseDouble(LarguraText.getText()) <= 0){
                   LarguraText.setText("Valor Não Aceito");
            }
            
            if (ComprimText.getText().trim().equals("")){
                ComprimText.setText("Campo Vazio");
            }
            else if (Double.parseDouble(ComprimText.getText()) <= 0){
                ComprimText.setText("Valor Não Aceito");
            }
        
            if (AlturaText.getText().trim().equals("")){
                   AlturaText.setText("Campo Vazio");
            }
            else if (Double.parseDouble(AlturaText.getText()) <= 0){
                   AlturaText.setText("Valor Não Aceito");
            }
            } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Não digite letras.");
            }
            
            if ((((Double.parseDouble(LarguraText.getText() ))) > 0) && ((Double.parseDouble(ComprimText.getText() )) > 0) && ((Double.parseDouble(AlturaText.getText() )) > 0)) {
            Paralelepipedo parallp = new Paralelepipedo();
            parallp.setLargura(Double.parseDouble(LarguraText.getText()));
            parallp.setComprim(Double.parseDouble(ComprimText.getText()));
            parallp.setAltura(Double.parseDouble(AlturaText.getText()));
            parallp.calcDiagonais();
            DiagonalLabel.setVisible(true);
            DiagonalText.setText(String.format("%.2f", parallp.getDiagonal()));
            DiagonalText.setVisible(true);
            CalculeButton.setText("Próximo");
            }
    }//GEN-LAST:event_CalculeButtonActionPerformed

    private void ResetButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButton3ActionPerformed
        LarguraText.setText("");
        ComprimText.setText("");
        AlturaText.setText("");
        DiagonalText.setVisible(false);
        DiagonalLabel.setVisible(false);
        CalculeButton.setText("Calcule");

    }//GEN-LAST:event_ResetButton3ActionPerformed

    private void LarguraTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LarguraTextMouseClicked
        if ((LarguraText.getText().equals("Campo Vazio")) || (LarguraText.getText().equals("Valor Não Aceito"))){
                   LarguraText.setText("");
        }
    }//GEN-LAST:event_LarguraTextMouseClicked

    private void ComprimTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComprimTextMouseClicked
         if ((ComprimText.getText().equals("Campo Vazio")) || (ComprimText.getText().equals("Valor Não Aceito"))){
                   ComprimText.setText("");
        }
    }//GEN-LAST:event_ComprimTextMouseClicked

    private void AlturaTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlturaTextMouseClicked
         if ((AlturaText.getText().equals("Campo Vazio")) || (AlturaText.getText().equals("Valor Não Aceito"))){
                   AlturaText.setText("");
        }
    }//GEN-LAST:event_AlturaTextMouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        TipoCalculoParalelepípedo tcp = new TipoCalculoParalelepípedo();
        tcp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked

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
            java.util.logging.Logger.getLogger(DadosDiagonalParalelepípedo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosDiagonalParalelepípedo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosDiagonalParalelepípedo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosDiagonalParalelepípedo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DadosDiagonalParalelepípedo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlturaText;
    private javax.swing.JMenuBar BarMenu1;
    private javax.swing.JButton CalculeButton;
    private javax.swing.JTextField ComprimText;
    private javax.swing.JLabel DiagonalLabel;
    private javax.swing.JTextField DiagonalText;
    private javax.swing.JTextField LarguraText;
    private javax.swing.JButton ResetButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    // End of variables declaration//GEN-END:variables
}
