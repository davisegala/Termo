package Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public interface Palavras {
    default List<String> getNewBancoPalavras() {
        try { 
            return Files.readAllLines(Paths.get("src/Termo/BancoDePalavras.txt")); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    default String palavraAleatoria(List<String> bancoPalavras) {
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

    default boolean isPalavra(String[] palavra, List<String> bancoPalavras) {
        for (String i : palavra) if (i.equals(" ")) return false;
        if  (palavra.length != 5) return false;
        for (int i = 0; i < bancoPalavras.size(); i++) {
            if (palavra.equals( bancoPalavras.get(i).trim().toLowerCase()) ) return true;
        }
        return false;
    }
}