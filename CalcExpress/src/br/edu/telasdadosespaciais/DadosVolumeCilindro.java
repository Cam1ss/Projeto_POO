/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.telasdadosespaciais;

import br.edu.escolhas.TipoCalculoCilindro;
import br.edu.escolhas.UsarNovamente;
import br.edu.figurasgeometricasespaciais.Cilindro;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Andre
 */
public class DadosVolumeCilindro extends javax.swing.JFrame {

    /**
     * Creates new form DadosAreaLateralCilindro
     */
    public DadosVolumeCilindro() {
         initComponents();
         ImageIcon icon = new ImageIcon((new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/icon.png")).getImage()));  
         setIconImage(icon.getImage());
         this.setResizable(false);
         VolumeLabel.setVisible(false);
         VolumeText.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AlturaText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        RaioText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CalculeButton = new javax.swing.JButton();
        VolumeLabel = new javax.swing.JLabel();
        VolumeText = new javax.swing.JTextField();
        ResetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BarMenu1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AlturaText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AlturaTextMouseClicked(evt);
            }
        });
        AlturaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlturaTextActionPerformed(evt);
            }
        });
        getContentPane().add(AlturaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 320, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Altura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 40));

        RaioText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RaioTextMouseClicked(evt);
            }
        });
        RaioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaioTextActionPerformed(evt);
            }
        });
        getContentPane().add(RaioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 320, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Raio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 40));

        CalculeButton.setBackground(new java.awt.Color(153, 0, 51));
        CalculeButton.setForeground(new java.awt.Color(255, 255, 255));
        CalculeButton.setText("Calcule");
        CalculeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CalculeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 90, -1));

        VolumeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        VolumeLabel.setForeground(new java.awt.Color(153, 0, 0));
        VolumeLabel.setText("Volume");
        getContentPane().add(VolumeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 40));
        getContentPane().add(VolumeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 320, -1));

        ResetButton.setBackground(new java.awt.Color(153, 0, 51));
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setText("Resetar");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ResetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/CilindroVolumeDados.png"))); // NOI18N
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

    private void AlturaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlturaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlturaTextActionPerformed

    private void RaioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RaioTextActionPerformed

    private void CalculeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculeButtonActionPerformed
           if(CalculeButton.getText().equals("Próximo")){
                UsarNovamente un = new UsarNovamente();
                un.setVisible(true); 
                this.dispose();
            }
           
           try{
           if (RaioText.getText().trim().equals("")){
                   RaioText.setText("Campo Vazio");
            }
            else if (Double.parseDouble(RaioText.getText()) <= 0){
                   RaioText.setText("Valor Não Aceito");
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
           
            if ((((Double.parseDouble(RaioText.getText() ))) > 0) && ((Double.parseDouble(AlturaText.getText() )) > 0)) { 
               Cilindro cilin = new Cilindro();
               cilin.setRaio(Double.parseDouble(RaioText.getText()));
               cilin.setAltura(Double.parseDouble(AlturaText.getText()));
               cilin.calcVolume();
               VolumeLabel.setVisible(true);
               VolumeText.setText(String.format("%.2f", cilin.getVolume()));
               VolumeText.setVisible(true);
               CalculeButton.setText("Próximo");
            }
    }//GEN-LAST:event_CalculeButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        RaioText.setText("");
        AlturaText.setText("");
        VolumeText.setVisible(false);
        VolumeLabel.setVisible(false);
        CalculeButton.setText("Calcule");
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void RaioTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RaioTextMouseClicked
         if ((RaioText.getText().equals("Campo Vazio")) || (RaioText.getText().equals("Valor Não Aceito"))){
                   RaioText.setText("");
        }
    }//GEN-LAST:event_RaioTextMouseClicked

    private void AlturaTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AlturaTextMouseClicked
        if ((AlturaText.getText().equals("Campo Vazio")) || (AlturaText.getText().equals("Valor Não Aceito"))){
                   AlturaText.setText("");
        }
    }//GEN-LAST:event_AlturaTextMouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        TipoCalculoCilindro tcc = new TipoCalculoCilindro();
        tcc.setVisible(true);
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
            java.util.logging.Logger.getLogger(DadosVolumeCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosVolumeCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosVolumeCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosVolumeCilindro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //CalculeButton-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosVolumeCilindro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlturaText;
    private javax.swing.JMenuBar BarMenu1;
    private javax.swing.JButton CalculeButton;
    private javax.swing.JTextField RaioText;
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel VolumeLabel;
    private javax.swing.JTextField VolumeText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    // End of variables declaration//GEN-END:variables
}
