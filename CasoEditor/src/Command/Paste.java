/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Editor.Text;

/**
 *
 * @author kduran
 */
public class Paste implements ICommand{

    String textCopy;
    Text text;

    public Paste(String textCopy, Text text) {
        this.textCopy = textCopy;
        this.text = text;
    }
    
    @Override
    public void execute() {
        if(textCopy != null){
            this.text.addWord(this.text.getWords()+textCopy);
        }
    }
    
}
