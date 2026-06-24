package Main;

import Interface.TelaPrincipal;
import java.util.List;
import javax.swing.JLabel;

public class PalavraManager implements Palavras {
    private final Estilo estilo;
    private final TelaPrincipal tp;
    private final List<String> bancoPalavras = getNewBancoPalavras("src/Main/BancoDePalavras.txt");
    private String palavraChave = getPalavraAleatoria(bancoPalavras);
    
    private int casa = 0;
    private int linha = 0;

    public PalavraManager(TelaPrincipal tp, Estilo estilo) {
        this.tp = tp;
        this.estilo = estilo;
    }
     
    public void addLetra(String letra) {
        estilo.setLetra(casa, linha, letra);
        proximaCasa();
    }
    
    public void apagarLetra() {
        estilo.setLetra(casa, linha, "");
        voltarCasa();
    }
    
    public void voltarCasa() {
        casa--;
        if (casa < 0) {
            casa = 4;
        }
        estilo.setSelecionado(linha, casa);
    }
    
    public void proximaLinha() {
        if (!isPalavra(getPalavra().split(""), bancoPalavras)) {
            return;
        }
        
        enviarPalavra(getPalavra());
        linha++;
        if (linha > 5) tp.terminarJogo();
        casa = 0;
        estilo.initLinha(linha);
        estilo.setSelecionado(linha, casa);
    }
    
    public void proximaCasa() {
        casa++;
        estilo.setSelecionado(linha, casa);
        if (casa > 4) casa = 0;
    }
    
    private void enviarPalavra(String palavra) {
        String[] palavra1 = palavra.split("");
        
        if (!isPalavra(palavra1, bancoPalavras)) {
            return;
        }
        
        verificadorPalavra(palavra);
    }
    
    public void reiniciarJogo() {
        estilo.reiniciarTela();
        casa = 0;
        linha = 0;
        palavraChave = getPalavraAleatoria(bancoPalavras);
    }
    
    private void verificadorPalavra(String palavra) {
        int[] resultado = new int[5];
        boolean[] usado = new boolean[5];
        
        for (int i = 0; i < 5; i++) {
            if (palavra.charAt(i) == palavraChave.charAt(i)) {
                resultado[i] = 2;
                usado[i] = true;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (resultado[i] == 2) continue;

            for (int j = 0; j < 5; j++) {
                if (!usado[j] && palavra.charAt(i) == palavraChave.charAt(j)) {
                    resultado[i] = 1;
                    usado[j] = true;
                    break;
                }
            }
        }

        estilo.resultadoLinha(linha, resultado, palavra.split(""));
    }
    
    private String getPalavra() {
        String palavra = "";
        for (JLabel i : tp.getMatrixJLabel()[linha]) {
            palavra += i.getText();
        }
        return palavra.toLowerCase();
    }

    public String getPalavraChave() {
        return palavraChave;
    }
}
