package Main;

import Interface.TelaPrincipal;

public class PalavraManager implements Palavras {
    private final Estilo estilo;
    private final TelaPrincipal tp;
    
    private int casa = 0;
    private int linha = 0;

    public PalavraManager(TelaPrincipal tp) {
        this.tp = tp;
        this.estilo = new Estilo(this.tp);
    }
     
    public void addLetra(String letra) {
        estilo.setLetra(casa, linha, letra);
        proximaCasa();
    }
    
    public void apagarLetra() {
        estilo.setLetra(casa, linha, "");
        casa--;
        if (casa < 0) casa = 4;
        estilo.setSelecionado(linha, casa);
    }
    
    public void proximaLinha() {
        linha++;
        casa = 0;
        estilo.initLinha(linha);
        estilo.setSelecionado(linha, casa);
    }
    
    public void proximaCasa() {
        casa++;
        estilo.setSelecionado(linha, casa);
        if (casa > 4) casa = 0;
    }
}
