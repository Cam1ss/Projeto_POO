/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.calcexpress;

/**
 *
 * @author Welington
 */
public class Pag02 {
            
        public static javax.swing.JProgressBar barra;
        public static javax.swing.JLabel icon;
        public static javax.swing.JPanel painel;
        
        public void carreg(){
        loading l = new loading();
        l.setVisible(true);
      
        try {
            for (int x = 0; x <= 100; x += 3){
                Thread.sleep(70);
                l.barra.setValue(x);
            }
            
            l.dispose();
        } catch (Exception e){}
}
}
