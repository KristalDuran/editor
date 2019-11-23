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
public class CSV implements ISaveAS{

    @Override
    public void save(Text text, String route) {
        try {
            File file = new File("src/Files/"+route+".csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text.getWords());
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
