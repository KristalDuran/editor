/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor;

import Command.Copy;
import Command.Create;
import Command.Cut;
import Command.Invoker;
import Command.Open;
import Command.Paste;
import Command.Redo;
import Command.Save;
import Command.SaveAs;
import Command.Undo;
import SaveAs.*;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author kduran
 */
public class Controller {
    Invoker invoker;
    Text text;
    ISaveAS saveAs;
    Context context;
    String route;
    boolean changes = false;
    String textCopy;
    ArrayList<String> negrita = new ArrayList<>();
    
    public Controller() {
        invoker = new Invoker();
        text = new Text();
        context = new Context();
    }

    public void addNegrita(String text){
        negrita.add(text);
    }
    
    public Text getText() {
        return text;
    }

    public void setSaveAs(String type){
        System.out.println("SaveAs: " + type);
        switch(type) {
            case "csv":
                saveAs = new CSV();
                break;
            case "json":
                saveAs = new JSON();
                break;
            case "txt":
                saveAs = new TXT();
                break;
            case "xml":
                saveAs = new XML();
                break;
        }
        context.setSaveAs(saveAs);
    }
    
    public boolean getChanges(){
        return changes;
    }
    
    public boolean getSaveAs(){
        if(saveAs != null){
            return true;
        }
        return false;
    }
    
    public String[] getListFiles() {
        File carpeta = new File("src/Files");
        String[] listado = carpeta.list();
        if (listado == null || listado.length == 0) {
         System.out.println("No hay elementos dentro de la carpeta actual");
         return null;
        }
        else {
         for (int i=0; i< listado.length; i++) {
         System.out.println(listado[i]);
         }
        }
        return listado;
    }
    
    public Context getContext(){
        return context;
    }
    
    public void setRoute(String route){
        this.route = route;
    }
    
    public String getRoute(){
        return route;
    }
    
    public String getTextCopy(){
        return textCopy;
    }
    
    public void setTextCopy(String textCopy){
        this.textCopy = textCopy;
    }
    
    public void execute(String command) {
        System.out.println("command: " + command);
        switch(command) {
            case "copy":
                invoker.registerCommand(new Copy(textCopy));
                break;
            case "paste":
                invoker.registerCommand(new Paste(textCopy, text));
                break;
            case "cut":
                invoker.registerCommand(new Cut());
                break;
            case "open":
                invoker.registerCommand(new Open(route));
                break;
            case "redo":
                invoker.registerCommand(new Redo());
                break;    
            case "undo":
                invoker.registerCommand(new Undo());
                break;
            case "save":
                invoker.registerCommand(new Save(text, route));
                break;
            case "saveAs":
                invoker.registerCommand(new SaveAs(context, text, route));
                break;
            case "new":
                invoker.registerCommand(new Create());
                break;
        }
        invoker.execute();
    }
    
    
}
