package Termo;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Estilo {
    private javax.swing.JLabel[][] matrixJJLabel;
    private javax.swing.JPanel[][] matrixJPainel;
    
    protected Color background = new Color(110, 92, 98);
    protected Color errada = new Color(49, 42, 44);
    protected Color lugarErrado = new Color(211, 173, 105);
    protected Color certa = new Color(58, 163, 148);

    public Estilo(JLabel[][] matrixJJLabel, JPanel[][] matrixJPainel) {
        this.matrixJJLabel = matrixJJLabel;
        this.matrixJPainel = matrixJPainel;
    }
    
    public void setLetras(int linha, String palavra) {
        String[] letras = palavra.split("");
        for (int i = 0; i < letras.length; i++) matrixJJLabel[linha][i].setText(letras[i]);
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
        for (javax.swing.JLabel[] i : matrixJJLabel) {
            for (javax.swing.JLabel j : i) {
                j.setForeground(cor);
            }
        }
    }
}
