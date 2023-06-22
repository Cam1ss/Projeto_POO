/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package principal.calcexpress.Menu;


/**
 *
 * @author Alunos
 */
public class Sobre extends javax.swing.JFrame {

    /**
     * Creates new form Sobre
     */
    public Sobre() {
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

        decri1 = new javax.swing.JLabel();
        IconMedio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        setaImag = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/menu/icon.png")).getImage());
        setMinimumSize(new java.awt.Dimension(699, 370));
        setUndecorated(true);
        getContentPane().setLayout(null);

        decri1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobrecalc/descricao.png"))); // NOI18N
        getContentPane().add(decri1);
        decri1.setBounds(360, 50, 280, 270);

        IconMedio.setBackground(new java.awt.Color(255, 255, 255));
        IconMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Icon-Medio.png"))); // NOI18N
        getContentPane().add(IconMedio);
        IconMedio.setBounds(100, 100, 220, 228);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobrecalc/circulo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 80, 280, 250);

        setaImag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobrecalc/seta-04.png"))); // NOI18N
        setaImag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setaImagMouseClicked(evt);
            }
        });
        getContentPane().add(setaImag);
        setaImag.setBounds(10, 10, 70, 64);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sobrecalc/sobre.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 370);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setaImagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setaImagMouseClicked
        // TODO add your handling code here:
         Menu mn = new Menu();
         mn.setVisible(true);
         mn.pack();
         mn.setLocationRelativeTo(null);
         this.dispose();
        
    }//GEN-LAST:event_setaImagMouseClicked

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
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconMedio;
    public javax.swing.JLabel decri1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel setaImag;
    // End of variables declaration//GEN-END:variables
}
