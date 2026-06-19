package Termo;

public class PalavraGerenciador {    
    private final String[] palavra = new String[5];
    private int posicao = 0;
    
    public void addLetra(String letra) {
        if (posicao > 4) posicao = 0;
        palavra[posicao] = letra;
        posicao++; 
    }
    
    public void popLetra() {
        if (posicao < 0) posicao = 4;
        palavra[posicao] = "";
        posicao--;
    }
    
    public void enviarPalavra() {
        
    }

    public String[] getPalavra() {
        return palavra;
    }
}
