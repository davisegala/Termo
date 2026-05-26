package Termo;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProcessadorPalavra{
    private String ultimaPalavra = "";
    private String palavraChave;
    private List<String> bancoPalavras;
    private Estilo estilo;

    public ProcessadorPalavra(JLabel[][] matrixJJLabel, JPanel[][] matrixJPainel, Estilo estilo) {
        this.estilo = estilo;
        try { bancoPalavras = Files.readAllLines(Paths.get("src/Termo/BancoDePalavras.txt")); } catch (IOException e) {}
    }
    
    public boolean setPalavra(int linha, String palavra) {
        String[] letras = palavra.split("");
        return letraLocal(letras, linha-1);
    }

    private boolean letraLocal(String[] letras, int linha) {
        int tamanho = 5;
        int[] resultado = new int[tamanho];
        StringBuilder chaveRestante = new StringBuilder(this.palavraChave);

        for (int i = 0; i < tamanho; i++) {            
            if (letras[i].equals(String.valueOf(chaveRestante.charAt(i)))) {
                resultado[i] = 2;
                chaveRestante.setCharAt(i, '_'); 
            }
        }

        for (int i = 0; i < tamanho; i++) {
            if (resultado[i] == 2) continue;

            int index = chaveRestante.indexOf(letras[i]);
            if (index != -1) {
                resultado[i] = 1;
                chaveRestante.setCharAt(index, '_');
            }
        }

        for (int i = 0; i < tamanho; i++) {
            Color cor = (resultado[i] == 2) ? estilo.certa : (resultado[i] == 1) ? estilo.lugarErrado : estilo.errada;
            estilo.setCor(cor, cor, linha, i);
        }

        return palavraChave.equals(String.join("", letras));
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

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }

    public String getPalavraChave() {
        return palavraChave;
    }
}