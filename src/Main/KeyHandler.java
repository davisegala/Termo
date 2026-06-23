package Main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    private String tecla;
    private final PalavraManager pm;

    public KeyHandler(PalavraManager pm) {
        this.pm = pm;
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        tecla = "";
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        int code = ke.getKeyCode();
        String nomeTecla = KeyEvent.getKeyText(code);

        if (code >= KeyEvent.VK_A && code <= KeyEvent.VK_Z) {
            tecla = nomeTecla.toLowerCase();
            pm.addLetra(tecla);
        }
        
        if (code == KeyEvent.VK_ENTER) {
            pm.proximaLinha();
        }
        
        if (code == KeyEvent.VK_BACK_SPACE) {
            pm.apagarLetra();
        }
        
        if (code == KeyEvent.VK_SPACE) {
            pm.proximaCasa();
        }
        
        if (code == KeyEvent.VK_RIGHT) {
            pm.proximaCasa();
        }
        
        if (code == KeyEvent.VK_LEFT) {
            pm.voltarCasa();
        }
    }

    public String getTecla() {
        return tecla;
    }
}
