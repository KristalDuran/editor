/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Editor.Text;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kduran
 */
public class Save implements ICommand{
    
    Text text;
    String route;

    public Save(Text text, String route) {
        this.text = text;
        this.route = route;
    }
    
    @Override
    public void execute() {
        try {
        File file = new File("src/Files/"+route);
            if (file.exists()) {
                String textString = text.getWords();
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(textString);
                bw.close();
            }
        } catch (IOException ex) {
                Logger.getLogger(Save.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
