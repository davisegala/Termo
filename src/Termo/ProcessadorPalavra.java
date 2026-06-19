package Termo;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import javax.swing.JLabel;

public class ProcessadorPalavra {
    private String palavraChave;
    private List<String> bancoPalavras;
    private Estilo estilo;

    public ProcessadorPalavra(Estilo estilo) {
        this.estilo = estilo;
        try { 
            bancoPalavras = Files.readAllLines(Paths.get("src/Termo/BancoDePalavras.txt")); 
        } catch (IOException e) {
        }
    }
    
    public void setPalavra(int linha, String palavra) {
        String[] letras = palavra.split("");        
        verificadorLetra(letras, linha - 1);
    }

    private void verificadorLetra(String[] letras, int linha) {
        
    }
    
    public String palavraAleatoria() {
        Random random = new Random();

        while (true) {
            int indice = random.nextInt(bancoPalavras.size());
            String palavra = bancoPalavras.get(indice)
                .trim()
                .toLowerCase();
            if (palavra.matches("[a-z]{5}")) {
                return palavra;
            }
        }
    }

    public boolean isPalavra(String palavra) {
        String[] letras = palavra.split("");
        for (String i : letras) if (i.equals(" ")) return false;
        if  (letras.length != 5) return false;
        for (int i = 0; i < bancoPalavras.size(); i++) {
            if (palavra.equals( bancoPalavras.get(i).trim().toLowerCase()) ) return true;
        }
        return false;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getPalavraChave() {
        return palavraChave;
    }
    
    public void iniciarNovoJogo(JLabel jTxtUltimaPalavra) {
        estilo.reiniciarTela(palavraChave, jTxtUltimaPalavra);
        
        this.palavraChave = palavraAleatoria();
    }
}