/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author kduran
 */
public class Copy implements ICommand{
    
    private String text;

    public Copy(String text) {
        this.text = text;
    }
    
    @Override
    public void execute() {
        System.out.println("Texto copiado " + text);
    }
    
}
