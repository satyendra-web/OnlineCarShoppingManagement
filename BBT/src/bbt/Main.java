/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bbt;

/**
 *
 * @author 45
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
       
    }

}
