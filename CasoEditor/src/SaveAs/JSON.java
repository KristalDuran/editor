/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaveAs;

import Editor.Text;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author kduran
 */
public class JSON implements ISaveAS{

    @Override
    public void save(Text text, String route) {
        try {
            File file = new File("src/Files/"+route+".json");
            if (!file.exists()) {
                file.createNewFile();
            }
            String textString = text.getWords();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(textString);
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
