/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import GUI.Editor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kduran
 */
public class Open implements ICommand{
    String route;

    public Open(String route) {
        this.route = route;
    }
    
    @Override
    public void execute() {
        FileReader f = null;
        try {
            Editor editor = casoeditor.CasoEditor.editor;
            
            String cadena;
            f = new FileReader("src/Files/"+route);
            BufferedReader b = new BufferedReader(f);
            while((cadena = b.readLine())!=null) {
                editor.setText(cadena);
            }   b.close();
            editor.setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                f.close();
            } catch (IOException ex) {
                Logger.getLogger(Open.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
