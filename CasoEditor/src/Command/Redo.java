/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Editor.CareTaker;
import Editor.Memento;
import casoeditor.CasoEditor;

/**
 *
 * @author kduran
 */
public class Redo implements ICommand{
    
    public Memento redoMemento(){
        if(CareTaker.mementos.size()<=20){
            return CareTaker.mementos.get(CasoEditor.currentMemento+1);
        }
        return null;
        
    }
    @Override
    public void execute() {
        redoMemento();
        
    }
}
