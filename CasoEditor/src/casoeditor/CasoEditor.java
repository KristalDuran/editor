/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoeditor;

import Command.Redo;
import Command.Undo;
import Editor.CareTaker;
import Editor.Memento;
import Editor.Originator;
import Editor.Save;
import Editor.Text;
import GUI.Editor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author kduran
 */
public class CasoEditor {

    /**
     * @param args the command line arguments
     */
    
    public static CareTaker caretaker = new CareTaker();
    public static Originator originator = new Originator();
    public static Editor editor = new Editor();
    //public static Undo undo = new Undo();
    //ssspublic static Redo redo = new Redo();
    
    public static int currentMemento;
    
    public static void main(String[] args) {
        
    
        editor.setVisible(true);
        Save save = new Save();
        save.start();
        currentMemento = caretaker.mementos.size();
        // TODO code application logic here
        
        /*CareTaker caretaker = new CareTaker();
        Originator originator = new Originator();
        Text text1 = new Text();
        text1.addWord("hola mundo");
        text1.setBlack(true);
        text1.setColor("rojo");
        Text text2 = new Text();
        text2.addWord("hola mundo, Java es el ");
        text2.setBlack(true);
        text2.setColor("azul");
        Text text3 = new Text();
        text3.addWord("hola mundo, Java es el lenguaje");
        text3.setBlack(true);
        text3.setColor("verde");
        Text text4 = new Text();
        text4.addWord("hola mundo, Java es el lenguaje de programación ");
        text4.setBlack(true);
        text4.setColor("negro");
        originator.setState(text1);
        caretaker.addMemento( originator.save() );
        originator.setState(text2);
        caretaker.addMemento( originator.save() );
        originator.setState(text3);
        caretaker.addMemento( originator.save() );
        originator.setState(text4);
        caretaker.addMemento( originator.save() );
        //originator.restore( caretaker.getMemento() );
        
        currentMemento = caretaker.mementos.size();  //4 
        System.out.println(""+currentMemento);
        System.out.println("estoy probando");
        undo.execute();
        currentMemento = currentMemento-1;  //3
        System.out.println(""+currentMemento);
        undo.execute();
        currentMemento = currentMemento-1; //2
         System.out.println(""+currentMemento);
        redo.execute();
        currentMemento = currentMemento+1; //3
        redo.execute();
        System.out.println(""+currentMemento);*/
        
        
        
        
        
        
        /*Timer timer = new Timer(3000, new ActionListener(){
               
            @Override
            public void actionPerformed(ActionEvent ae) {
                 
                
                //ocupo traerme el memento actual y guardarlo
                //caretaker.addMemento(m);
                currentMemento = caretaker.mementos.size();
            }
            });*/
    }

    //colocar el guardar estado despues de presionar cada boton
    
    
    
}
