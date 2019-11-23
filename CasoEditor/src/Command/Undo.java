/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Editor.CareTaker;
import Editor.Memento;
import Editor.Originator;
import casoeditor.CasoEditor;

/**
 *
 * @author kduran
 */
public class Undo implements ICommand{
    Originator originator = new Originator();
    
     public void undoMemento(){
        if(CareTaker.mementos.size()>0){
            originator.setState(CareTaker.mementos.get(CasoEditor.currentMemento-2).getState());           
        }else{
            System.out.println("No hay mas registros por deshacer");
        }
  
    }
    @Override
    public void execute() {
        undoMemento();
        
    }
}
