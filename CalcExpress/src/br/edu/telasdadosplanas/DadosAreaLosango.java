/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.telasdadosplanas;

import br.edu.escolhas.EscolhaFigPlan;
import br.edu.escolhas.UsarNovamente;
import br.edu.figurasgeometricasplanas.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MANUELA
 */
public class DadosAreaLosango extends javax.swing.JFrame {

    

    

    /**
     * Creates new form DadosAreaLosango
     */
    public DadosAreaLosango() {   
        initComponents();
        this.setResizable(false);
        ImageIcon icon = new ImageIcon((new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/icon.png")).getImage()));  
        setIconImage(icon.getImage());
        Caixa_Area.setVisible(false);
        Texto_Area.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Texto_DG = new javax.swing.JLabel();
        Texto_Area = new javax.swing.JLabel();
        Texto_Dm = new javax.swing.JLabel();
        Caixa_Area = new javax.swing.JTextField();
        Caixa_DM = new javax.swing.JTextField();
        Caixa_Dm = new javax.swing.JTextField();
        botao_reset = new javax.swing.JButton();
        botao_calc = new javax.swing.JButton();
        imagem = new javax.swing.JLabel();
        BarMenu1 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Texto_DG.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Texto_DG.setForeground(new java.awt.Color(153, 0, 0));
        Texto_DG.setText("Diagonal Maior");
        getContentPane().add(Texto_DG, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        Texto_Area.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Texto_Area.setForeground(new java.awt.Color(153, 0, 0));
        Texto_Area.setText("Área");
        getContentPane().add(Texto_Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        Texto_Dm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Texto_Dm.setForeground(new java.awt.Color(153, 0, 0));
        Texto_Dm.setText("Diagonal Menor");
        getContentPane().add(Texto_Dm, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        Caixa_Area.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caixa_AreaActionPerformed(evt);
            }
        });
        getContentPane().add(Caixa_Area, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 330, -1));

        Caixa_DM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caixa_DMMouseClicked(evt);
            }
        });
        Caixa_DM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caixa_DMActionPerformed(evt);
            }
        });
        getContentPane().add(Caixa_DM, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 330, -1));

        Caixa_Dm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Caixa_DmMouseClicked(evt);
            }
        });
        Caixa_Dm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Caixa_DmActionPerformed(evt);
            }
        });
        getContentPane().add(Caixa_Dm, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 330, -1));

        botao_reset.setBackground(new java.awt.Color(153, 0, 0));
        botao_reset.setForeground(new java.awt.Color(255, 255, 255));
        botao_reset.setText("Resetar");
        botao_reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_resetActionPerformed(evt);
            }
        });
        getContentPane().add(botao_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        botao_calc.setBackground(new java.awt.Color(153, 0, 0));
        botao_calc.setForeground(new java.awt.Color(255, 255, 255));
        botao_calc.setText("Calcular");
        botao_calc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botao_calc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_calcMouseClicked(evt);
            }
        });
        botao_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_calcActionPerformed(evt);
            }
        });
        getContentPane().add(botao_calc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/telasimagens/LosangoDados.png"))); // NOI18N
        imagem.setMaximumSize(new java.awt.Dimension(699, 374));
        imagem.setMinimumSize(new java.awt.Dimension(699, 374));
        imagem.setPreferredSize(new java.awt.Dimension(699, 374));
        getContentPane().add(imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 370));

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

    private void Caixa_AreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caixa_AreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Caixa_AreaActionPerformed

    private void Caixa_DMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caixa_DMActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_Caixa_DMActionPerformed

    private void botao_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_resetActionPerformed
        
        Caixa_Area.setVisible(false);
        Texto_Area.setVisible(false);
        botao_calc.setVisible(true);
        botao_calc.setText("Calcular");
        Caixa_DM.setText("");
        Caixa_Dm.setText("");
        
    }//GEN-LAST:event_botao_resetActionPerformed

    private void botao_calcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_calcMouseClicked
        
    }//GEN-LAST:event_botao_calcMouseClicked

    private void botao_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_calcActionPerformed
     
        if(botao_calc.getText().equals("Próximo")){
                UsarNovamente un = new UsarNovamente();
                un.setVisible(true); 
                this.dispose();
        }
        try{
        if (Caixa_DM.getText().trim().equals("")){
                   Caixa_DM.setText("Campo Vazio");
        }
        else if (Double.parseDouble(Caixa_DM.getText()) <= 0){
                   Caixa_DM.setText("Valor Não Aceito");
        } 
      
        
       
        if (Caixa_Dm.getText().trim().equals("")){
                Caixa_Dm.setText("Campo Vazio");
        }
        else if (Double.parseDouble(Caixa_Dm.getText()) <= 0){
                Caixa_Dm.setText("Valor Não Aceito");
        }
        else if (Double.parseDouble(Caixa_Dm.getText()) >= (Double.parseDouble(Caixa_DM.getText()))){
                   Caixa_Dm.setText("Diagonal Menor precisa ser menor que a Diagonal Maior.");
        }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Não digite letras.");
        }
        Losango los = new Losango();
            
        if ((((Double.parseDouble(Caixa_Dm.getText() ))) > 0) && ((Double.parseDouble(Caixa_DM.getText() )) > 0)) {
                los.setDiagonalMaior(Double.parseDouble(Caixa_DM.getText()));
                los.setDiagonalMenor(Double.parseDouble(Caixa_Dm.getText()));
                los.CalcArea1();
        
                Caixa_Area.setVisible(true);
                Texto_Area.setVisible(true);
                Caixa_Area.setText(String.format("%.2f", los.getArea()));
        
                botao_calc.setText("Próximo");  
            }
    }//GEN-LAST:event_botao_calcActionPerformed

    private void Caixa_DmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Caixa_DmActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_Caixa_DmActionPerformed

    private void Caixa_DMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caixa_DMMouseClicked
        if ((Caixa_DM.getText().equals("Campo Vazio")) || (Caixa_DM.getText().equals("Valor Não Aceito"))){
                  Caixa_DM.setText("");
        }
    }//GEN-LAST:event_Caixa_DMMouseClicked

    private void Caixa_DmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Caixa_DmMouseClicked
        if ((Caixa_Dm.getText().equals("Campo Vazio")) || (Caixa_Dm.getText().equals("Valor Não Aceito")) || (Caixa_Dm.getText().equals("Diagonal Menor precisa ser menor que a Diagonal Maior."))){
                   Caixa_Dm.setText("");
        }
    }//GEN-LAST:event_Caixa_DmMouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
          EscolhaFigPlan efp = new EscolhaFigPlan();
          efp.setVisible(true);
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
            java.util.logging.Logger.getLogger(DadosAreaLosango.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosAreaLosango.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosAreaLosango.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosAreaLosango.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosAreaLosango().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarMenu1;
    private javax.swing.JTextField Caixa_Area;
    private javax.swing.JTextField Caixa_DM;
    private javax.swing.JTextField Caixa_Dm;
    private javax.swing.JLabel Texto_Area;
    private javax.swing.JLabel Texto_DG;
    private javax.swing.JLabel Texto_Dm;
    private javax.swing.JButton botao_calc;
    private javax.swing.JButton botao_reset;
    private javax.swing.JLabel imagem;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    // End of variables declaration//GEN-END:variables

    private void getText() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
