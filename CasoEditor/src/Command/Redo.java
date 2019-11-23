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
public class Redo implements ICommand{
    
    public void redoMemento(){
        if(CareTaker.mementos.size()<=20 && CasoEditor.currentMemento < CareTaker.mementos.size()){
            casoeditor.CasoEditor.originator.setState(CareTaker.mementos.get(CasoEditor.currentMemento).getState());           
        }else{
            System.out.println("No hay mas registros por rehacer");
        }
        casoeditor.CasoEditor.currentMemento = casoeditor.CasoEditor.currentMemento +1;
    }
    
    @Override
    public void execute() {
        redoMemento();
        
    }
}
