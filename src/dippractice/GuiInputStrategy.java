package dippractice;

import javax.swing.JOptionPane;

public class GuiInputStrategy implements InputStrategy{
    
    @Override
    public String getMessage(){
        String in = JOptionPane.showInputDialog(null, "Enter a word");
        return in;    
    }
    
}
