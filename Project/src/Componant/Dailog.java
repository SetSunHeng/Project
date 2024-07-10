
package Componant;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Dailog {
    static public void error(Component component, String message, String title){
        JOptionPane.showMessageDialog(component, message, title, JOptionPane.ERROR_MESSAGE);
    }
    static public void warning(Component component, String message, String title){
        JOptionPane.showMessageDialog(component, message, title, JOptionPane.WARNING_MESSAGE);
    }
    static public void success(Component component, String message, String title){
        JOptionPane.showMessageDialog(component, message, title, JOptionPane.OK_OPTION);
    }
}
