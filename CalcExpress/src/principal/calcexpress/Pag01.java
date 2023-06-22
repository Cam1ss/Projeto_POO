/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal.calcexpress;

/**
 *
 * @author Welington
 */
public class Pag01 {
    
    public void abert(){
        abertura ab = new abertura();
        ab.setVisible(true);
       
        try {
         Thread.sleep(6600);
  
        ab.dispose();
        }
        catch (Exception e){}
        
    }
}