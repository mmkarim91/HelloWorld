/*
    @Name:
    @Subject:
    @Version:
    @Purpose:
*/
import javax.swing.*;
public class OptionPaneExample {
    JFrame f;
    String name;
    OptionPaneExample(){
        f = new JFrame();
        name = JOptionPane.showInputDialog(f, "Enter Name");
    }
    public static void main(String[] args){
        new OptionPaneExample();
    }
}
