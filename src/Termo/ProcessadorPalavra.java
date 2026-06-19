package Termo;

import java.util.List;
import java.util.Random;

public class ProcessadorPalavra {
    public void setPalavra(int linha, String palavra) {
        String[] letras = palavra.split("");        
        verificadorLetra(letras, linha - 1);
    }

    public void verificadorLetra(String[] letras, int linha) {
        
    }
    
    public String palavraAleatoria(List<String> bancoPalavras) {
        while (true) {
            int indice = new Random().nextInt(bancoPalavras.size());
            String palavra = bancoPalavras.get(indice)
                .trim()
                .toLowerCase();
            if (palavra.matches("[a-z]{5}")) {
                return palavra;
            }
        }
    }

    public boolean isPalavra(String[] palavra, List<String> bancoPalavras) {
        for (String i : palavra) if (i.equals(" ")) return false;
        if  (palavra.length != 5) return false;
        for (int i = 0; i < bancoPalavras.size(); i++) {
            if (palavra.equals( bancoPalavras.get(i).trim().toLowerCase()) ) return true;
        }
        return false;
    }
}