/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kduran
 */
public class Save extends Thread{
    public void run()
   {
        try {
            casoeditor.CasoEditor.editor.save();
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
}
