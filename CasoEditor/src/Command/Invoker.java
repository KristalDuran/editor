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
public class Invoker {
    private ICommand command;
    
    public void registerCommand(ICommand command){
        this.command = command;
    }
    
    public ICommand getCommand(){
        return this.command;
    }
    
    public void execute(){
        command.execute();
    }
}
