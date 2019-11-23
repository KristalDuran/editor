/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SaveAs;

import Editor.Text;

/**
 *
 * @author kduran
 */
public class Context {
    private ISaveAS saveAs;

    public ISaveAS getSaveAs() {
        return saveAs;
    }

    public void setSaveAs(ISaveAS saveAs) {
        this.saveAs = saveAs;
    }
    
    public void save(Text text, String route){
        System.out.println("s" + saveAs);
        saveAs.save(text, route);
    }
}
