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
    
    private Color background = new Color(110, 92, 98);
    private Color errada = new Color(49, 42, 44);
    private Color lugarErrado = new Color(211, 173, 105);
    private Color certa = new Color(58, 163, 148);

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
            if (palavra.matches("[a-z]{5}")) {
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
        for (int i = 0; i < 5; i++) {
            matrixJPainel[linha-1][i].setBackground(background);
            matrixJPainel[linha-1][i].setBorder(javax.swing.BorderFactory.createLineBorder(new Color(76, 67, 71), 5));
        }
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
                matrixJPainel[linha][i].setBackground(certa);
                matrixJPainel[linha][i].setBorder(javax.swing.BorderFactory.createLineBorder(certa, 5));
                
            } else if (TD.toLowerCase().contains(String.valueOf(vetorPalavra[i]))) {
                matrixJPainel[linha][i].setBackground(lugarErrado);
                matrixJPainel[linha][i].setBorder(javax.swing.BorderFactory.createLineBorder(lugarErrado, 5));
                
            } else {
                
                matrixJPainel[linha][i].setBackground(errada);
                matrixJPainel[linha][i].setBorder(javax.swing.BorderFactory.createLineBorder(errada, 5));
            }
        }
        
        return isIgual(vetorPalavra, vetorTD);
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

    public String getPalavraChave() {
        return palavraChave;
    }

    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }
    
    public void setTextColor(Color color) {
        for (javax.swing.JLabel[] i : matrixJJLabel) {
            for (javax.swing.JLabel j : i) {
                j.setForeground(color);
            }
        }
    }
}