/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casoeditor;

import Editor.CareTaker;
import Editor.Originator;
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
    public static Editor editor = new Editor();
    
    public static void main(String[] args) {
        
    
        editor.setVisible(true);
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
        originator.setState(text2);
        caretaker.addMemento( originator.save() );
        originator.setState(text3);
        caretaker.addMemento( originator.save() );
        originator.setState(text4);
        originator.restore( caretaker.getMemento() );*/
        
        Timer timer = new Timer(3000, new ActionListener(){
               
            @Override
            public void actionPerformed(ActionEvent ae) {
                //aqui va la accion de guardar un memento cada 3 segundos
                //hacer un metodo para llamarlo aquí 
            }
            });
    }
    //undo deshacer
    //redo rehacer
    //colocar el guardar estado despues de presionar cada boton
    
    
    
}
