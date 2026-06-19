package Termo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Estilo {
    private final JLabel[][] matrixJLabel;
    private final JPanel[][] matrixJPainel;
    
    protected Color background = new Color(110, 92, 98);
    protected Color errada = new Color(49, 42, 44);
    protected Color lugarErrado = new Color(211, 173, 105);
    protected Color certa = new Color(58, 163, 148);
    protected Color vazio = new Color(97,84,88);

    public Estilo(JLabel[][] matrixJJLabel, JPanel[][] matrixJPainel) {
        this.matrixJLabel = matrixJJLabel;
        this.matrixJPainel = matrixJPainel;
    }
    
    public void setLetras(int linha, String palavra) {
        String[] letras = palavra.split("");
        for (int i = 0; i < letras.length; i++) matrixJLabel[linha][i].setText(letras[i]);
        setCorLinha(background, new Color(76, 67, 71), linha);
    }
    
    public void setLetra(int casa, int linha, String letra) {
        matrixJLabel[linha][casa].setText(letra);
        setCorLinha(background, new Color(76, 67, 71), linha);
    }

    public void setCorLinha(Color cor, int linha) {
        for (javax.swing.JPanel jPanel : this.matrixJPainel[linha]) {
            jPanel.setBackground(cor);
        }
    }
    
    public void setCorLinha(Color cor, Color corBorda, int linha) {        
        for (javax.swing.JPanel jPanel : this.matrixJPainel[linha]) {
            jPanel.setBackground(cor);
            jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(corBorda, 5));
        }
    }
    
    public void setCor(Color cor, int linha, int casa){
        matrixJPainel[linha][casa].setBackground(cor);
    }
    
    public void setCor(Color cor, Color corBorda,int linha, int casa){
        matrixJPainel[linha][casa].setBackground(cor);
        matrixJPainel[linha][casa].setBorder(javax.swing.BorderFactory.createLineBorder(corBorda, 5));
    }
    
    public void setCorTexto(Color cor) {
        for (javax.swing.JLabel[] i : matrixJLabel) {
            for (javax.swing.JLabel j : i) {
                j.setForeground(cor);
            }
        }
    }
    
    public void reiniciarTela() {
        for (int i = 0; i < matrixJPainel.length; i++) {
            setCorLinha(vazio, vazio, i);
        }
        
        for (JLabel linha[] : matrixJLabel) {
            for (JLabel j : linha) j.setText("");
        }
    }
    
}
