package Main;

import Interface.TelaPrincipal;
import java.awt.Color;
import java.util.Map;
import javax.swing.*;

public class Estilo {
    private final TelaPrincipal tp;
    private final Map<String, JButton> teclas;
    
    private final int ESPESSURA_BORDA = 4;
    
    private final Color background = new Color(110, 92, 98);
    private final Color errada = new Color(49, 42, 44);
    private final Color lugarErrado = new Color(211, 173, 105);
    private final Color certa = new Color(58, 163, 148);
    private final Color vazio = new Color(97,84,88);
    private final Color borda = new Color(76, 67, 71);
    private final Color botao = new Color(80, 68, 72);

    public Estilo(TelaPrincipal tp) {
        this.tp = tp;
        this.teclas = tp.getTeclas();
    }
    
    public void setPalavra(int linha, String palavra) {
        String[] letras = palavra.split("");
        for (int i = 0; i < letras.length; i++) tp.getMatrixJLabel()[linha][i].setText(letras[i].toUpperCase());
        setCorLinha(background, borda, linha);
    }
    
    public void setLetra(int casa, int linha, String letra) {
        tp.getMatrixJLabel()[linha][casa].setText(letra.toUpperCase());
    }

    public void setCorLinha(Color cor, int linha) {
        for (javax.swing.JPanel jPanel : this.tp.getMatrixJPanel()[linha]) {
            jPanel.setBackground(cor);
            jPanel.setBorder(BorderFactory.createMatteBorder(ESPESSURA_BORDA, ESPESSURA_BORDA, ESPESSURA_BORDA, ESPESSURA_BORDA, cor));
            
        }
    }
    
    public void setCorLinha(Color cor, Color corBorda, int linha) {        
        for (javax.swing.JPanel jPanel : this.tp.getMatrixJPanel()[linha]) {
            jPanel.setBackground(cor);
            jPanel.setBorder(BorderFactory.createMatteBorder(ESPESSURA_BORDA, ESPESSURA_BORDA, ESPESSURA_BORDA, ESPESSURA_BORDA, corBorda));
        }
    }
    
    public void setCor(Color cor, int linha, int casa){
        tp.getMatrixJPanel()[linha][casa].setBackground(cor);
        tp.getMatrixJPanel()[linha][casa].setBorder(BorderFactory.createMatteBorder(ESPESSURA_BORDA, ESPESSURA_BORDA, ESPESSURA_BORDA, ESPESSURA_BORDA, cor));
    }
    
    public void setCor(Color cor, Color corBorda,int linha, int casa){
        tp.getMatrixJPanel()[linha][casa].setBackground(cor);
        tp.getMatrixJPanel()[linha][casa].setBorder(BorderFactory.createMatteBorder(ESPESSURA_BORDA, ESPESSURA_BORDA, ESPESSURA_BORDA, ESPESSURA_BORDA, corBorda));
    }
    
    public void setCorTexto(Color cor) {
        for (javax.swing.JLabel[] i : tp.getMatrixJLabel()) {
            for (javax.swing.JLabel j : i) {
                j.setForeground(cor);
            }
        }
    }
    
    public void resultadoLinha(int linha, int[] resultado, String[] palavra) {
        for (int i = 0; i < resultado.length; i++) {
            Color cor = background;

            switch (resultado[i]) {
                case 2 -> cor = certa;
                case 1 ->  cor = lugarErrado;
                default -> cor = errada;
            }

            setCor(cor, linha, i);
            teclas.get(palavra[i]).setBackground(cor);
        }
    }
    
    public void setSelecionado(int linha, int casa) {
        if (casa > 4) casa = 0;
        setCorLinha(background, borda, linha);
        tp.getMatrixJPanel()[linha][casa].setBorder(
            BorderFactory.createMatteBorder(ESPESSURA_BORDA, ESPESSURA_BORDA, ESPESSURA_BORDA * 2, ESPESSURA_BORDA, borda)
        );
    }
    
    public void reiniciarTela() {
        for (int i = 0; i < tp.getMatrixJPanel().length; i++) {
            setCorLinha(vazio, vazio, i);
        }
        
        for (JLabel[] linha : tp.getMatrixJLabel()) {
            for (JLabel j : linha) j.setText("");
        }
        
        for (JButton i : teclas.values()) {
            i.setBackground(botao);
        }
        
        initLinha(0);
    }
    
    public void initLinha(int linha) {
        setCorLinha(background, borda, linha);
    }
}
