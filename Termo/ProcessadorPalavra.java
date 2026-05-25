package Termo;

import java.awt.Color;
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
    private javax.swing.JLabel[][] matrixJJLabel;
    private javax.swing.JPanel[][] matrixJPainel;

    public ProcessadorPalavra(JLabel[][] matrixJJLabel, JPanel[][] matrixJPainel) {
        this.matrixJJLabel = matrixJJLabel;
        this.matrixJPainel = matrixJPainel;
        
        try {
            bancoPalavras = Files.readAllLines(Paths.get("src/Termo/BancoDePalavras.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String palavraAleatoria() {
        Random random = new Random();

        while (true) {
            int indice = random.nextInt(bancoPalavras.size());
            String palavra = bancoPalavras.get(indice)
                .trim()
                .toLowerCase();
            if (palavra.matches("[a-záàâãéêíóôõúç]{5}")) {
                return palavra;
            }
        }
    }
    
    public boolean setPalavra(int linha, String palavra) {
        String[] letras = palavra.split("");
        return LetraLocal(palavraChave, letras, matrixJPainel, linha-1);
    }
    
    public void setLetras(int linha, String palavra) {
        String[] letras = palavra.split("");
        for (int i = 0; i < letras.length; i++) matrixJJLabel[linha - 1][i].setText(letras[i]);
    }
    
    private boolean isIgual(String[] vetor1, String[] vetor2) {
        for (int i = 0; i < vetor1.length; i++) {
            if (!vetor1[i].equals(vetor2[i])) return false;
        }
        return true;
    }

    private boolean LetraLocal (String TD, String[] vetorPalavra, javax.swing.JPanel[][] matrixJPainel, int linha) {
        String[] vetorTD = TD.split("");
        
        for (int i = 0; i <= 4; i++) {            
            if (vetorTD[i].equals(vetorPalavra[i])){
                matrixJPainel[linha][i].setBackground(Color.green);
            } else if (TD.toLowerCase().contains(String.valueOf(vetorPalavra[i]))) {
                matrixJPainel[linha][i].setBackground(Color.yellow);
            } else {
                matrixJPainel[linha][i].setBackground(Color.gray);
            }
        }
        
        return isIgual(vetorPalavra, vetorTD);
    }

    public boolean isPalavra(String palavra) {
        if (ultimaPalavra.equals(palavra)) return false;
        String[] letras = palavra.split("");
        for (String i : letras) if (i.equals(" ")) return false;
        ultimaPalavra = palavra;
        return letras.length == 5;
    }

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }
}