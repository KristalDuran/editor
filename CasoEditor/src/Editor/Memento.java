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
public class Memento {
   private Text state;

    public Memento(Text state) {
        this.state = state;
    }

    public Text getState() {
        return state;
    }
   
   
    
}
