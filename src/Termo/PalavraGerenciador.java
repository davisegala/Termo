package Termo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PalavraGerenciador extends ProcessadorPalavra{
    private String palavraChave;
    private List<String> bancoPalavras;
    private final Estilo estilo;

    private final String[] palavra = new String[5];
    private int posicao = 0;
    private int linha = 0;
    
    public PalavraGerenciador(Estilo estilo) {
        this.estilo = estilo;
        try { 
            bancoPalavras = Files.readAllLines(Paths.get("src/Termo/BancoDePalavras.txt")); 
        } catch (IOException e) {
        }
        
        palavraChave = this.palavraAleatoria(bancoPalavras);
    }
    
    public void addLetra(String letra) {
        if (posicao > 4) posicao = 0;
        palavra[posicao] = letra;
        estilo.setLetra(posicao, linha, letra);
        posicao++; 
    }
    
    public void popLetra() {
        palavra[posicao] = "";
        estilo.setLetra(posicao, linha, "");
        posicao--;
        if (posicao < 0) posicao = 4;
        if (posicao > 4) posicao = 0;
    }
    
    public void enviarPalavra() {
        if (!isPalavra(palavra, bancoPalavras)) return;
        linha++;
        posicao = 0;
    }
    
    public void iniciarNovoJogo() {
        estilo.reiniciarTela();
        this.palavraChave = palavraAleatoria(bancoPalavras);
    }

    public String[] getPalavra() {
        return palavra;
    }
}
