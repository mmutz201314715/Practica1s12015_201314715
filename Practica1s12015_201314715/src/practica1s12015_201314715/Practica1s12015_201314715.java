/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1s12015_201314715;

/**
 *
 * @author mariopc
 */
public class Practica1s12015_201314715 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //look and feel tipo nimbus
        try{
                 javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            } 
         
         catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
  java.util.logging.Logger.getLogger(Practica1s12015_201314715.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
        Inicio in = new Inicio();
        in.setVisible(true);
        // TODO code application logic here
    }
    
}
