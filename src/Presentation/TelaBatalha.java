
package Presentation;

import Business.BusinessFacade;
import EDA.Monstro;
import EDA.Personagem;
import EDA.Usuario;
import javax.swing.JOptionPane;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class TelaBatalha extends javax.swing.JFrame {
    Monstro monstro;
    int xPlayer;
    int yPlayer;
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();
    Personagem personagem = usuarioLogado.getPersonagem();

    public TelaBatalha(Monstro monstro, int xPlayer, int yPlayer) {
        initComponents();
        this.monstro = monstro;
        this.xPlayer = xPlayer;
        this.yPlayer = yPlayer;
        labelBicho.setIcon(monstro.getAparencia());
        atualizaHP();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonDefender = new javax.swing.JButton();
        buttonAtacar = new javax.swing.JButton();
        buttonPocao = new javax.swing.JButton();
        buttonFugir = new javax.swing.JButton();
        barraHP = new javax.swing.JProgressBar();
        labelBicho = new javax.swing.JLabel();
        labelFala = new javax.swing.JLabel();
        labelHP = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setResizable(false);
        getContentPane().setLayout(null);

        buttonDefender.setFont(new java.awt.Font("Coolvetica Rg", 0, 42)); // NOI18N
        buttonDefender.setText("Defender");
        buttonDefender.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonDefender.setContentAreaFilled(false);
        buttonDefender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDefender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDefenderActionPerformed(evt);
            }
        });
        getContentPane().add(buttonDefender);
        buttonDefender.setBounds(980, 670, 190, 50);

        buttonAtacar.setFont(new java.awt.Font("Coolvetica Rg", 0, 42)); // NOI18N
        buttonAtacar.setText("Atacar");
        buttonAtacar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonAtacar.setContentAreaFilled(false);
        buttonAtacar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtacarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAtacar);
        buttonAtacar.setBounds(510, 670, 150, 50);

        buttonPocao.setFont(new java.awt.Font("Coolvetica Rg", 0, 42)); // NOI18N
        buttonPocao.setText("Usar itens");
        buttonPocao.setToolTipText("");
        buttonPocao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonPocao.setContentAreaFilled(false);
        buttonPocao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPocao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPocaoActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPocao);
        buttonPocao.setBounds(720, 670, 210, 50);

        buttonFugir.setFont(new java.awt.Font("Coolvetica Rg", 0, 42)); // NOI18N
        buttonFugir.setText("Fugir");
        buttonFugir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonFugir.setContentAreaFilled(false);
        buttonFugir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonFugir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFugirActionPerformed(evt);
            }
        });
        getContentPane().add(buttonFugir);
        buttonFugir.setBounds(1210, 670, 130, 50);

        barraHP.setBackground(new java.awt.Color(0, 0, 0));
        barraHP.setForeground(new java.awt.Color(0, 255, 0));
        barraHP.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                barraHPPropertyChange(evt);
            }
        });
        getContentPane().add(barraHP);
        barraHP.setBounds(20, 690, 420, 40);

        labelBicho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBicho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png"))); // NOI18N
        getContentPane().add(labelBicho);
        labelBicho.setBounds(380, 180, 630, 410);

        labelFala.setFont(new java.awt.Font("Regalia Free", 0, 36)); // NOI18N
        labelFala.setForeground(new java.awt.Color(255, 255, 255));
        labelFala.setText("~ vou te quebrar na porrada");
        getContentPane().add(labelFala);
        labelFala.setBounds(780, 160, 490, 50);

        labelHP.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHP.setText("0000 / 0000");
        getContentPane().add(labelHP);
        labelHP.setBounds(20, 650, 420, 40);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 620, 1370, 10);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backBatalha.jpg"))); // NOI18N
        background2.setText("jLabel1");
        background2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        background2.setMinimumSize(new java.awt.Dimension(1366, 768));
        background2.setPreferredSize(new java.awt.Dimension(1366, 768));
        background2.setRequestFocusEnabled(false);
        getContentPane().add(background2);
        background2.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPocaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPocaoActionPerformed
        personagem.curar(100);
        atualizaHP();
    }//GEN-LAST:event_buttonPocaoActionPerformed
    
    private void buttonAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtacarActionPerformed
        if(personagem.getHp() <= 0){
           JOptionPane.showMessageDialog(null, "Você morreu. Fim de jogo parceiro.", "Cabô-se", JOptionPane.PLAIN_MESSAGE);
           TelaSelecaoPersonagem tela = new TelaSelecaoPersonagem();
           Main.abrir(tela);
           this.dispose();
       } else if(monstro.getHp() <= 0){
           JOptionPane.showMessageDialog(null, "Você matou " + monstro.getNome() + ". Você ganhou " + monstro.getXpDrop() + " de XP e " + monstro.getCoinDrop() + " de moedas.", "Cabô-se", JOptionPane.PLAIN_MESSAGE);
           personagem.setDinheiro(personagem.getDinheiro() + monstro.getCoinDrop());
           personagem.setXp(personagem.getXp() + monstro.getXpDrop());
            TelaMundo tela = new TelaMundo(xPlayer, yPlayer);
            Main.abrir(tela);
            this.dispose();
       } else {
            personagem.atacar(monstro);
            monstro.turno(personagem);
       }
        atualizaHP();
    }//GEN-LAST:event_buttonAtacarActionPerformed

    private void buttonDefenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDefenderActionPerformed
        if(personagem.getHp() <= 0){
           JOptionPane.showMessageDialog(null, "Você morreu. Fim de jogo parceiro.", "Cabô-se", JOptionPane.PLAIN_MESSAGE);
           TelaSelecaoPersonagem tela = new TelaSelecaoPersonagem();
           Main.abrir(tela);
           this.dispose();
       } else if(monstro.getHp() <= 0){
           JOptionPane.showMessageDialog(null, "Você matou " + monstro.getNome() + ". Você ganhou " + monstro.getXpDrop() + " de XP e " + monstro.getCoinDrop() + " de moedas.", "Cabô-se", JOptionPane.PLAIN_MESSAGE);
           personagem.setDinheiro(personagem.getDinheiro() + monstro.getCoinDrop());
           personagem.setXp(personagem.getXp() + monstro.getXpDrop());
            TelaMundo tela = new TelaMundo(xPlayer, yPlayer);
            Main.abrir(tela);
            this.dispose();
       } else {
            personagem.setDefesa(true);
            monstro.turno(personagem);
       }
        atualizaHP();
        
    }//GEN-LAST:event_buttonDefenderActionPerformed

    private void buttonFugirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFugirActionPerformed
        TelaMundo tela = new TelaMundo(xPlayer, yPlayer);
        Main.abrir(tela);
        this.dispose();
    }//GEN-LAST:event_buttonFugirActionPerformed

    private void barraHPPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_barraHPPropertyChange

    }//GEN-LAST:event_barraHPPropertyChange
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background2;
    private javax.swing.JProgressBar barraHP;
    private javax.swing.JButton buttonAtacar;
    private javax.swing.JButton buttonDefender;
    private javax.swing.JButton buttonFugir;
    private javax.swing.JButton buttonPocao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelBicho;
    private javax.swing.JLabel labelFala;
    private javax.swing.JLabel labelHP;
    // End of variables declaration//GEN-END:variables

//========== MÉTODOS ===========================================================    
    
    /**
     * Atualiza as informações dos labels relacionados ao HP.
     */
    public void atualizaHP(){
        barraHP.setValue(personagem.getHp());
        labelHP.setText("" + personagem.getHp() + " / " + personagem.getHpMaximo());
    }

}
