package Termo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Random;

public class ProcessadorPalavra{
    private String ultimaPalavra = "";
    private String palavraChave;
    private List<String> bancoPalavras;
    private Estilo estilo;

    public ProcessadorPalavra(JLabel[][] matrixJJLabel, JPanel[][] matrixJPainel, Estilo estilo) {
        this.estilo = estilo;
        try {bancoPalavras = Files.readAllLines(Paths.get("src/Termo/BancoDePalavras.txt"));} catch (IOException e) {}
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
    
    public boolean setPalavra(int linha, String palavra) {
        String[] letras = palavra.split("");
        return letraLocal(letras, linha-1);
    }

    private boolean letraLocal(String[] letras, int linha) {
        char[] chave = palavraChave.toCharArray();
        boolean[] usados = new boolean[5];
        
        for (int i = 0; i < 5; i++) {
            if (letras[i].charAt(0) == chave[i]) {
                estilo.setCor(estilo.certa, estilo.certa, linha, i);
                usados[i] = true;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if (usados[i]) continue;
            int pos = -1;

            for (int j = 0; j < 5; j++) {
                if (!usados[j] && letras[i].charAt(0) == chave[j]) {
                    pos = j;
                    break;
                }
            }
            
            if (pos != -1) {
                usados[pos] = true;
                estilo.setCor(estilo.lugarErrado, estilo.lugarErrado, linha, i);
            } else {
                estilo.setCor(estilo.errada, estilo.errada, linha, i);
            }
        }

        return palavraChave.equals(String.join("", letras));
    }

    public boolean isPalavra(String palavra) {
        if (ultimaPalavra.equals(palavra)) return false;
        String[] letras = palavra.split("");
        for (String i : letras) if (i.equals(" ")) return false;
        ultimaPalavra = palavra;
        if  (letras.length != 5) return false;
        
        for (int i = 0; i < bancoPalavras.size(); i++) {
            if (palavra.equals( bancoPalavras.get(i).trim().toLowerCase()) ) return true;
        }
        return false;
    }
    
    public void gerarPalavraChave() {
        this.palavraChave = palavraAleatoria();
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getPalavraChave() {
        return palavraChave;
    }
}