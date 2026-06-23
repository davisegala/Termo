package Main;

import Interface.TelaPrincipal;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaPrincipal.setResizable(false);
        telaPrincipal.setTitle("Termo");
        
        telaPrincipal.setSize(720, 480);
        
        telaPrincipal.setLocationRelativeTo(null);
        telaPrincipal.setVisible(true);
    }
}