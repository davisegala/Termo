package Termo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    private final PalavraGerenciador palavraManager;
    private String tecla;

    public KeyHandler(PalavraGerenciador palavraManager) {
        this.palavraManager = palavraManager;
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        int code = ke.getKeyCode();
        String nomeTecla = KeyEvent.getKeyText(code);

        if (code >= KeyEvent.VK_A && code <= KeyEvent.VK_Z) {
            tecla = nomeTecla.toLowerCase();
            palavraManager.addLetra(tecla);
        }
        
        if (code == KeyEvent.VK_ENTER) {
            palavraManager.enviarPalavra();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        tecla = "";
    }

    public String getTecla() {
        return tecla;
    }
}
