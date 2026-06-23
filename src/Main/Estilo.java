package Main;

import Interface.TelaPrincipal;
import java.awt.Color;
import javax.swing.JLabel;

public class Estilo {
    private final TelaPrincipal tp;
    
    private final Color background = new Color(110, 92, 98);
    private final Color errada = new Color(49, 42, 44);
    private final Color lugarErrado = new Color(211, 173, 105);
    private final Color certa = new Color(58, 163, 148);
    private final Color vazio = new Color(97,84,88);
    private final Color backgroundBorda = new Color(76, 67, 71);

    public Estilo(TelaPrincipal tp) {
        this.tp = tp;
    }
    
    public void setLetras(int linha, String palavra) {
        String[] letras = palavra.split("");
        for (int i = 0; i < letras.length; i++) tp.getMatrixJLabel()[linha][i].setText(letras[i]);
        setCorLinha(background, new Color(76, 67, 71), linha);
    }
    
    public void setLetra(int casa, int linha, String letra) {
        tp.getMatrixJLabel()[linha][casa].setText(letra);
    }

    public void setCorLinha(Color cor, int linha) {
        for (javax.swing.JPanel jPanel : this.tp.getMatrixJPanel()[linha]) {
            jPanel.setBackground(cor);
        }
    }
    
    public void setCorLinha(Color cor, Color corBorda, int linha) {        
        for (javax.swing.JPanel jPanel : this.tp.getMatrixJPanel()[linha]) {
            jPanel.setBackground(cor);
            jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(corBorda, 5));
        }
    }
    
    public void setCor(Color cor, int linha, int casa){
        tp.getMatrixJPanel()[linha][casa].setBackground(cor);
    }
    
    public void setCor(Color cor, Color corBorda,int linha, int casa){
        tp.getMatrixJPanel()[linha][casa].setBackground(cor);
        tp.getMatrixJPanel()[linha][casa].setBorder(javax.swing.BorderFactory.createLineBorder(corBorda, 5));
    }
    
    public void setCorTexto(Color cor) {
        for (javax.swing.JLabel[] i : tp.getMatrixJLabel()) {
            for (javax.swing.JLabel j : i) {
                j.setForeground(cor);
            }
        }
    }
    
    public void reiniciarTela() {
        for (int i = 0; i < tp.getMatrixJPanel().length; i++) {
            setCorLinha(vazio, vazio, i);
        }
        
        for (JLabel linha[] : tp.getMatrixJLabel()) {
            for (JLabel j : linha) j.setText("");
        }
    }
    
    public void initLinha(int linha) {
        setCorLinha(background, new Color(76, 67, 71), linha);
    }  
}
