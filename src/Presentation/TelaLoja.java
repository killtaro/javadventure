
package Presentation;

import Business.BusinessFacade;
import EDA.*;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class TelaLoja extends javax.swing.JFrame {
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();
    Personagem personagem = usuarioLogado.getPersonagem();
    Loja lojinha = new Loja(personagem);
    int valortotal = 0;
    int xPlayer;
    int yPlayer;


    public TelaLoja(int xPlayer, int yPlayer) {
        initComponents();
        Random x = new Random();
        if(x.nextInt(2) == 0){
            labelVendedor.setIcon((new javax.swing.ImageIcon(getClass().getResource("/Images/Vendedor.png"))));
        } else {
            labelVendedor.setIcon((new javax.swing.ImageIcon(getClass().getResource("/Images/Vendedor2.png"))));
        }
        BusinessFacade.setArrayLojaEquip(5, personagem.getLvl());
        BusinessFacade.setArrayLojaItens(5);

        this.xPlayer = xPlayer;
        this.yPlayer = yPlayer;
        
        atualizaTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaArmas = new javax.swing.JTable();
        labelValor = new javax.swing.JLabel();
        labelArmas = new javax.swing.JLabel();
        LabelPots = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        botaoComprar = new javax.swing.JButton();
        labelFalaVendedor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelGrana = new javax.swing.JLabel();
        labelVendedor = new javax.swing.JLabel();
        labelImgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem-Vindo a Loja");
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaItensMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaItens);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(770, 90, 560, 230);

        tabelaArmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaArmas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabelaArmasFocusGained(evt);
            }
        });
        tabelaArmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaArmasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaArmas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 560, 230);

        labelValor.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelValor.setForeground(new java.awt.Color(255, 255, 255));
        labelValor.setText("0");
        getContentPane().add(labelValor);
        labelValor.setBounds(1180, 530, 120, 50);

        labelArmas.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        labelArmas.setForeground(new java.awt.Color(255, 255, 255));
        labelArmas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelArmas.setText("Equipamento");
        getContentPane().add(labelArmas);
        labelArmas.setBounds(10, 40, 560, 50);

        LabelPots.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        LabelPots.setForeground(new java.awt.Color(255, 255, 255));
        LabelPots.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelPots.setText("Poções");
        getContentPane().add(LabelPots);
        LabelPots.setBounds(770, 40, 560, 50);

        botaoSair.setFont(new java.awt.Font("Coolvetica Rg", 0, 48)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(255, 255, 255));
        botaoSair.setText("Sair");
        botaoSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoSair.setContentAreaFilled(false);
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair);
        botaoSair.setBounds(20, 610, 120, 60);

        botaoComprar.setFont(new java.awt.Font("Coolvetica Rg", 0, 48)); // NOI18N
        botaoComprar.setForeground(new java.awt.Color(255, 255, 255));
        botaoComprar.setText("Comprar");
        botaoComprar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoComprar.setContentAreaFilled(false);
        botaoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoComprar);
        botaoComprar.setBounds(1100, 600, 210, 60);

        labelFalaVendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelFalaVendedor.setForeground(new java.awt.Color(255, 255, 255));
        labelFalaVendedor.setText("Ta precisando de que mermão?");
        getContentPane().add(labelFalaVendedor);
        labelFalaVendedor.setBounds(780, 370, 260, 20);

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("seu dinheiro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 560, 120, 30);

        jLabel3.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(1120, 540, 51, 30);

        labelGrana.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        labelGrana.setForeground(new java.awt.Color(255, 255, 255));
        labelGrana.setText("0");
        getContentPane().add(labelGrana);
        labelGrana.setBounds(140, 560, 60, 30);

        labelVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Vendedor.png"))); // NOI18N
        labelVendedor.setText("jLabel4");
        getContentPane().add(labelVendedor);
        labelVendedor.setBounds(540, 60, 240, 590);

        labelImgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backLoja.png"))); // NOI18N
        labelImgFundo.setMaximumSize(new java.awt.Dimension(1366, 768));
        labelImgFundo.setMinimumSize(new java.awt.Dimension(1366, 768));
        labelImgFundo.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(labelImgFundo);
        labelImgFundo.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaArmasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaArmasFocusGained
    }//GEN-LAST:event_tabelaArmasFocusGained

    private void tabelaArmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaArmasMouseClicked
        valortotal = 0;
        
        if(tabelaArmas.getSelectedRow() != -1){
            int index = tabelaArmas.getSelectedRow();
            valortotal = valortotal + BusinessFacade.getArrayEquipIndex(index).getValorCompra();
            labelValor.setText("" + valortotal);
        } 
    }//GEN-LAST:event_tabelaArmasMouseClicked

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        TelaMundo telaMundo = new TelaMundo(xPlayer, yPlayer);
        Main.abrir(telaMundo);
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void tabelaItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaItensMouseClicked
        valortotal = 0;
        if(tabelaItens.getSelectedRow() != -1){
            int index = tabelaItens.getSelectedRow();
            valortotal = valortotal + BusinessFacade.getArrayItensIndex(index).getValorCompra();
            labelValor.setText("" + valortotal);
        }
    }//GEN-LAST:event_tabelaItensMouseClicked

    private void botaoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarActionPerformed
        if(tabelaArmas.getSelectedRow() != -1){
            int index = tabelaArmas.getSelectedRow();
            if(BusinessFacade.comprarEquipamento(index, personagem)){  
                atualizaTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Desculpa bro mas você não tem dinheiro suficiente.", "Opa", JOptionPane.PLAIN_MESSAGE);
            }
        } 
        
        if(tabelaItens.getSelectedRow() != -1){
            int index = tabelaItens.getSelectedRow();
            if(BusinessFacade.comprarItens(index, personagem)){
                atualizaTabela();
            } else {
                JOptionPane.showMessageDialog(null, "Desculpa bro mas você não tem dinheiro suficiente.", "Opa", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoComprarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPots;
    private javax.swing.JButton botaoComprar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelArmas;
    private javax.swing.JLabel labelFalaVendedor;
    private javax.swing.JLabel labelGrana;
    private javax.swing.JLabel labelImgFundo;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelVendedor;
    private javax.swing.JTable tabelaArmas;
    private javax.swing.JTable tabelaItens;
    // End of variables declaration//GEN-END:variables

//========== MÉTODOS ===========================================================    
    
    /**
     * Atualiza as informações da tabela relacionada ao acervo da loja e os
     * labels relacionados ao dinheiro do jogador.
     */
    public void atualizaTabela(){
        labelGrana.setText("" + personagem.getDinheiro());
        tabelaArmas.removeAll();
        tabelaItens.removeAll();
        
        DefaultTableModel modelo = new DefaultTableModel(
            new Object [][]{},
            new String[] {"Nome", "Lvl", "Dano/Defesa", "Preço"}
        );

        DefaultTableModel modelo2 = new DefaultTableModel(
            new Object [][]{},
            new String[] {"Tipo", "Eficiencia", "Quantidade", "Preço"}
        );
        
        tabelaArmas.setModel(modelo);
        tabelaItens.setModel(modelo2);

        
        if(tabelaArmas.getModel() instanceof DefaultTableModel){
            Iterator it = BusinessFacade.getArrayLojaEquip().iterator();
            while(it.hasNext()){
                Equipamento equip = (Equipamento) it.next();
                modelo.addRow(new Object[]{equip.getNome(), equip.getLvl(), equip.getPropriedade(), equip.getValorCompra()});
            }
        }
        
        if(tabelaItens.getModel() instanceof DefaultTableModel){
            Iterator itItens = BusinessFacade.getArrayLojaItens().iterator();
            while(itItens.hasNext()){
                Itens itens = (Itens) itItens.next();
                modelo2.addRow(new Object[]{itens.getTipo(), itens.getEficiencia(), itens.getQuantidade(), itens.getValorCompra()});
            }
        }        
    }
    
}
