package Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public interface Palavras {
    default List<String> getNewBancoPalavras(String caminho) {
        try { 
            return Files.readAllLines(Paths.get(caminho)); 
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    default String getPalavraAleatoria(List<String> bancoPalavras) {
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
        if (palavra.length != 5) {
            return false;
        }

        for (String letra : palavra) {
            if (letra.isBlank()) return false;
        }

        return bancoPalavras.contains(
            String.join("", palavra).toLowerCase()
        );
    }
}