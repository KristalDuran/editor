/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor;

import java.util.ArrayList;

/**
 *
 * @author raque
 */
public class CareTaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento m) {
        if(mementos.size()>20){
            mementos.remove(0);
            mementos.add(m);
        }
        
    }

    public Memento getMemento() {
        return mementos.get(1);
    }
}
