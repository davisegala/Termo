package Interface;
import Main.KeyHandler;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaPrincipal extends javax.swing.JFrame {
    private final KeyHandler keyH;
    
    JPanel[][] matrixJPanel;
    JLabel[][] matrixJLabel;

    public TelaPrincipal() {
        initComponents();
        initMatrix();
        keyH = new KeyHandler();
        this.addKeyListener(keyH);
    }

    public JPanel[][] getMatrixJPanel() {
        return matrixJPanel;
    }

    public JLabel[][] getMatrixJLabel() {
        return matrixJLabel;
    }
    
    private void initMatrix() {
        matrixJPanel = new JPanel[][] {
            {jPanel01, jPanel02, jPanel03, jPanel04, jPanel05},
            {jPanel06, jPanel07, jPanel08, jPanel09, jPanel10},
            {jPanel11, jPanel12, jPanel13, jPanel14, jPanel15},
            {jPanel16, jPanel17, jPanel18, jPanel19, jPanel20},
            {jPanel31, jPanel32, jPanel33, jPanel34, jPanel35},
            {jPanel36, jPanel37, jPanel38, jPanel39, jPanel40}
        };

        matrixJLabel = new JLabel[][] {
            {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5},
            {jLabel6, jLabel7, jLabel8, jLabel9, jLabel10},
            {jLabel11, jLabel12, jLabel13, jLabel14, jLabel15},
            {jLabel16, jLabel17, jLabel18, jLabel19, jLabel20},
            {jLabel31, jLabel32, jLabel33, jLabel34, jLabel35},
            {jLabel36, jLabel37, jLabel38, jLabel39, jLabel40}
        };
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBackground = new javax.swing.JPanel();
        jPanel01 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel02 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel03 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel04 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel05 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel06 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel07 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel08 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel09 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBackground.setBackground(new java.awt.Color(110, 92, 98));

        jPanel01.setBackground(new java.awt.Color(97, 84, 88));
        jPanel01.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel01.setForeground(new java.awt.Color(255, 255, 255));
        jPanel01.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel01Layout = new javax.swing.GroupLayout(jPanel01);
        jPanel01.setLayout(jPanel01Layout);
        jPanel01Layout.setHorizontalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel01Layout.setVerticalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel02.setBackground(new java.awt.Color(97, 84, 88));
        jPanel02.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel02.setForeground(new java.awt.Color(255, 255, 255));
        jPanel02.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel02Layout = new javax.swing.GroupLayout(jPanel02);
        jPanel02.setLayout(jPanel02Layout);
        jPanel02Layout.setHorizontalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel02Layout.setVerticalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel03.setBackground(new java.awt.Color(97, 84, 88));
        jPanel03.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel03.setForeground(new java.awt.Color(255, 255, 255));
        jPanel03.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel03Layout = new javax.swing.GroupLayout(jPanel03);
        jPanel03.setLayout(jPanel03Layout);
        jPanel03Layout.setHorizontalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel03Layout.setVerticalGroup(
            jPanel03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel04.setBackground(new java.awt.Color(97, 84, 88));
        jPanel04.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel04.setForeground(new java.awt.Color(255, 255, 255));
        jPanel04.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel04Layout = new javax.swing.GroupLayout(jPanel04);
        jPanel04.setLayout(jPanel04Layout);
        jPanel04Layout.setHorizontalGroup(
            jPanel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel04Layout.setVerticalGroup(
            jPanel04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel05.setBackground(new java.awt.Color(97, 84, 88));
        jPanel05.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel05.setForeground(new java.awt.Color(255, 255, 255));
        jPanel05.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel05Layout = new javax.swing.GroupLayout(jPanel05);
        jPanel05.setLayout(jPanel05Layout);
        jPanel05Layout.setHorizontalGroup(
            jPanel05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel05Layout.setVerticalGroup(
            jPanel05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel06.setBackground(new java.awt.Color(97, 84, 88));
        jPanel06.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel06.setForeground(new java.awt.Color(255, 255, 255));
        jPanel06.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel06Layout = new javax.swing.GroupLayout(jPanel06);
        jPanel06.setLayout(jPanel06Layout);
        jPanel06Layout.setHorizontalGroup(
            jPanel06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel06Layout.setVerticalGroup(
            jPanel06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel07.setBackground(new java.awt.Color(97, 84, 88));
        jPanel07.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel07.setForeground(new java.awt.Color(255, 255, 255));
        jPanel07.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel07Layout = new javax.swing.GroupLayout(jPanel07);
        jPanel07.setLayout(jPanel07Layout);
        jPanel07Layout.setHorizontalGroup(
            jPanel07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel07Layout.setVerticalGroup(
            jPanel07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel08.setBackground(new java.awt.Color(97, 84, 88));
        jPanel08.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel08.setForeground(new java.awt.Color(255, 255, 255));
        jPanel08.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel08Layout = new javax.swing.GroupLayout(jPanel08);
        jPanel08.setLayout(jPanel08Layout);
        jPanel08Layout.setHorizontalGroup(
            jPanel08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel08Layout.setVerticalGroup(
            jPanel08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel09.setBackground(new java.awt.Color(97, 84, 88));
        jPanel09.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel09.setForeground(new java.awt.Color(255, 255, 255));
        jPanel09.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel09Layout = new javax.swing.GroupLayout(jPanel09);
        jPanel09.setLayout(jPanel09Layout);
        jPanel09Layout.setHorizontalGroup(
            jPanel09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel09Layout.setVerticalGroup(
            jPanel09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(97, 84, 88));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(97, 84, 88));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(97, 84, 88));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel12.setForeground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(97, 84, 88));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel13.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(97, 84, 88));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(97, 84, 88));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel15.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(97, 84, 88));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(97, 84, 88));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel17.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(97, 84, 88));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel18.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(97, 84, 88));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel19.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel19.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel20.setBackground(new java.awt.Color(97, 84, 88));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel20.setForeground(new java.awt.Color(255, 255, 255));
        jPanel20.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel20.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel31.setBackground(new java.awt.Color(97, 84, 88));
        jPanel31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel31.setForeground(new java.awt.Color(255, 255, 255));
        jPanel31.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel31.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel32.setBackground(new java.awt.Color(97, 84, 88));
        jPanel32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel32.setForeground(new java.awt.Color(255, 255, 255));
        jPanel32.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel32.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel33.setBackground(new java.awt.Color(97, 84, 88));
        jPanel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel33.setForeground(new java.awt.Color(255, 255, 255));
        jPanel33.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel33.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel34.setBackground(new java.awt.Color(97, 84, 88));
        jPanel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel34.setForeground(new java.awt.Color(255, 255, 255));
        jPanel34.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel34.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel35.setBackground(new java.awt.Color(97, 84, 88));
        jPanel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel35.setForeground(new java.awt.Color(255, 255, 255));
        jPanel35.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel35.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel36.setBackground(new java.awt.Color(97, 84, 88));
        jPanel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel36.setForeground(new java.awt.Color(255, 255, 255));
        jPanel36.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel36.setBackground(new java.awt.Color(102, 102, 102));
        jLabel36.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel37.setBackground(new java.awt.Color(97, 84, 88));
        jPanel37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel37.setForeground(new java.awt.Color(255, 255, 255));
        jPanel37.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel37.setBackground(new java.awt.Color(102, 102, 102));
        jLabel37.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel38.setBackground(new java.awt.Color(97, 84, 88));
        jPanel38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel38.setForeground(new java.awt.Color(255, 255, 255));
        jPanel38.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel38.setBackground(new java.awt.Color(102, 102, 102));
        jLabel38.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel39.setBackground(new java.awt.Color(97, 84, 88));
        jPanel39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel39.setForeground(new java.awt.Color(255, 255, 255));
        jPanel39.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel39.setBackground(new java.awt.Color(102, 102, 102));
        jLabel39.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel40.setBackground(new java.awt.Color(97, 84, 88));
        jPanel40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(97, 84, 88), 5, true));
        jPanel40.setForeground(new java.awt.Color(255, 255, 255));
        jPanel40.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel40.setBackground(new java.awt.Color(102, 102, 102));
        jLabel40.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelBackgroundLayout = new javax.swing.GroupLayout(jPanelBackground);
        jPanelBackground.setLayout(jPanelBackgroundLayout);
        jPanelBackgroundLayout.setHorizontalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanel06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanelBackgroundLayout.setVerticalGroup(
            jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBackgroundLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel09, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel08, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new TelaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel01;
    private javax.swing.JPanel jPanel02;
    private javax.swing.JPanel jPanel03;
    private javax.swing.JPanel jPanel04;
    private javax.swing.JPanel jPanel05;
    private javax.swing.JPanel jPanel06;
    private javax.swing.JPanel jPanel07;
    private javax.swing.JPanel jPanel08;
    private javax.swing.JPanel jPanel09;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanelBackground;
    // End of variables declaration//GEN-END:variables
}
