package Interface;

import Main.Estilo;
import Main.KeyHandler;
import Main.PalavraManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TelaPrincipal extends javax.swing.JFrame {
    private final KeyHandler keyH;
    private final PalavraManager pm;
    
    private JPanel[][] matrixJPanel;
    private JLabel[][] matrixJLabel;
    
    // Configuracoes
    private final int tamanhoQuadrado = 55;

    public TelaPrincipal() {
        initComponents();
        
        Estilo estilo = new Estilo(this);
        pm = new PalavraManager(this, estilo);
        
        keyH = new KeyHandler(pm);
        this.addKeyListener(keyH);
        estilo.initLinha(0);
        estilo.setCorTexto(Color.white);
    }

    public JPanel[][] getMatrixJPanel() {
        return matrixJPanel;
    }

    public JLabel[][] getMatrixJLabel() {
        return matrixJLabel;
    }
    
    public void terminarJogo() {
        int opcao = JOptionPane.showConfirmDialog(
            this,
            "A Palavra era: " + pm.getPalavraChave(),
            "Fim de Jogo",
            JOptionPane.YES_NO_OPTION
        );

        if (opcao == JOptionPane.YES_OPTION) {
            pm.reiniciarJogo();
        } else {
            System.exit(0);
        }
    }
    
    private void initComponents() {
        JPanel jPanelBackground = new JPanel(new BorderLayout(0, 20));
        jPanelBackground.setBackground(new Color(110, 92, 98));
        jPanelBackground.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));
        
        JPanel painelGradeJogo = new JPanel(new GridLayout(6, 5, 6, 6));
        painelGradeJogo.setBackground(new Color(110, 92, 98));

        matrixJPanel = new JPanel[6][5];
        matrixJLabel = new JLabel[6][5];
        
        int tamanhoFonte = (int) (tamanhoQuadrado * 0.45);
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                JLabel label = new JLabel();
                label.setFont(new Font("Segoe UI Variable", Font.BOLD, tamanhoFonte));
                label.setForeground(Color.WHITE);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                matrixJLabel[i][j] = label;

                JPanel panel = new JPanel(new GridLayout(1, 1));
                panel.setBackground(new Color(97, 84, 88));
                panel.setBorder(BorderFactory.createLineBorder(new Color(97, 84, 88), 4, true));
                
                panel.setPreferredSize(new Dimension(tamanhoQuadrado, tamanhoQuadrado));
                
                panel.add(label);
                matrixJPanel[i][j] = panel;
                painelGradeJogo.add(panel);
            }
        }
        
        JPanel containerGrade = new JPanel();
        containerGrade.setBackground(new Color(110, 92, 98));
        containerGrade.add(painelGradeJogo);
        jPanelBackground.add(containerGrade, BorderLayout.CENTER);

        JPanel painelTecladoCompleto = new JPanel(new GridLayout(3, 1, 0, 8));
        painelTecladoCompleto.setBackground(new Color(110, 92, 98));
        
        String[] linha1 = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"};
        String[] linha2 = {"A", "S", "D", "F", "G", "H", "J", "K", "L", "⌫"};
        String[] linha3 = {"Z", "X", "C", "V", "B", "N", "M", "ENTER"};

        painelTecladoCompleto.add(criarLinhaTeclado(linha1));
        painelTecladoCompleto.add(criarLinhaTeclado(linha2));
        painelTecladoCompleto.add(criarLinhaTeclado(linha3));

        jPanelBackground.add(painelTecladoCompleto, BorderLayout.SOUTH);
        this.add(jPanelBackground);
    }
    
    private JPanel criarLinhaTeclado(String[] teclas) {
        JPanel painelLinha = new JPanel();
        painelLinha.setBackground(new Color(110, 92, 98));
        
        for (String tecla : teclas) {
            JButton botao = new JButton(tecla);
            botao.setFont(new Font("Segoe UI Variable", Font.BOLD, 16));
            botao.setForeground(Color.WHITE);
            botao.setBackground(new Color(80, 68, 72));
            botao.setBorder(BorderFactory.createEmptyBorder());
            botao.setFocusable(false);
            
            switch (tecla) {
                case "ENTER" -> {
                    botao.setPreferredSize(new Dimension(110, 45));
                    botao.setBackground(new Color(70, 60, 64));
                }
                case "⌫" -> botao.setPreferredSize(new Dimension(50, 45));
                default -> botao.setPreferredSize(new Dimension(42, 45));
            }
            
            botao.addActionListener(e -> acaoBotaoTeclado(tecla));
            
            painelLinha.add(botao);
        }
        
        return painelLinha;
    }
    
    private void acaoBotaoTeclado(String tecla) {
        switch (tecla) {
            case "ENTER" -> pm.proximaLinha();
            case "⌫" -> pm.apagarLetra();
            default -> pm.addLetra(tecla);
        }
    }
}