
package Presentation;

import Business.BusinessFacade;
import EDA.Arma;
import EDA.Armadura;
import EDA.Elmo;
import EDA.Equipamento;
import EDA.Grevas;
import EDA.Itens;
import EDA.Peitoral;
import EDA.Personagem;
import EDA.Usuario;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 * @author Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class TelaInventario extends javax.swing.JFrame {
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();
    Personagem personagem = usuarioLogado.getPersonagem();
    int xPlayer;
    int yPlayer;

    public TelaInventario(int xPlayer, int yPlayer) {
        initComponents();
        this.xPlayer = xPlayer;
        this.yPlayer = yPlayer;
        atualiza();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEquipamento = new javax.swing.JTable();
        labelArma = new javax.swing.JLabel();
        labelElmo = new javax.swing.JLabel();
        labelPeito = new javax.swing.JLabel();
        labelBota = new javax.swing.JLabel();
        botaoExcluir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaPocao = new javax.swing.JTable();
        buttonVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonEquipar = new javax.swing.JButton();
        labelImgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        tabelaEquipamento.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelaEquipamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEquipamentoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEquipamento);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 110, 560, 340);

        labelArma.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelArma.setForeground(new java.awt.Color(102, 0, 0));
        labelArma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelArma.setText("we");
        getContentPane().add(labelArma);
        labelArma.setBounds(780, 460, 550, 60);

        labelElmo.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelElmo.setForeground(new java.awt.Color(102, 0, 0));
        labelElmo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelElmo.setText("we");
        getContentPane().add(labelElmo);
        labelElmo.setBounds(30, 470, 550, 40);

        labelPeito.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelPeito.setForeground(new java.awt.Color(102, 0, 0));
        labelPeito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPeito.setText("we");
        getContentPane().add(labelPeito);
        labelPeito.setBounds(30, 530, 550, 50);

        labelBota.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        labelBota.setForeground(new java.awt.Color(102, 0, 0));
        labelBota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBota.setText("we");
        getContentPane().add(labelBota);
        labelBota.setBounds(780, 530, 550, 50);

        botaoExcluir.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        botaoExcluir.setContentAreaFilled(false);
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir);
        botaoExcluir.setBounds(610, 310, 140, 50);

        tabelaPocao.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabelaPocao);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(780, 110, 550, 340);

        buttonVoltar.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonVoltar.setContentAreaFilled(false);
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(buttonVoltar);
        buttonVoltar.setBounds(30, 601, 150, 49);

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("consumíveis");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(780, 50, 550, 60);

        jLabel3.setFont(new java.awt.Font("Bebas Neue", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Equipamento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 50, 550, 60);

        buttonEquipar.setFont(new java.awt.Font("Coolvetica Rg", 0, 36)); // NOI18N
        buttonEquipar.setText("Equipar");
        buttonEquipar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        buttonEquipar.setContentAreaFilled(false);
        buttonEquipar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEquiparActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEquipar);
        buttonEquipar.setBounds(610, 190, 140, 50);

        labelImgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backInventario.jpg"))); // NOI18N
        getContentPane().add(labelImgFundo);
        labelImgFundo.setBounds(0, -10, 1370, 780);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaEquipamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEquipamentoMouseClicked

    }//GEN-LAST:event_tabelaEquipamentoMouseClicked

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if(tabelaEquipamento.getSelectedRow() != -1){
            int index = tabelaEquipamento.getSelectedRow();
            BusinessFacade.removeEquipInventario(index, personagem);
            atualiza();
        } else if(tabelaPocao.getSelectedRow() != -1){
            int index = tabelaPocao.getSelectedRow();
            BusinessFacade.removeItensConsumiveis(index, personagem);
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        TelaMundo tela = new TelaMundo(xPlayer, yPlayer);
        Main.abrir(tela);
        this.dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonEquiparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEquiparActionPerformed
        if(tabelaEquipamento.getSelectedRow() != -1){
            int i = tabelaEquipamento.getSelectedRow();
            if(personagem.getInventario().get(i) instanceof Arma){
                Arma aux = personagem.getArma();
                Arma novaArma = (Arma) personagem.getInventario().get(i);
                personagem.setArma(novaArma);
                BusinessFacade.addEquipInventario(aux, personagem);
                BusinessFacade.removeEquipInventario(i, personagem);
                atualiza();
                
            } else if(personagem.getInventario().get(i) instanceof Elmo){
                Elmo aux = personagem.getElmo();
                Elmo novoElmo = (Elmo) personagem.getInventario().get(i);
                personagem.setElmo(novoElmo);
                BusinessFacade.addEquipInventario(aux, personagem);
                BusinessFacade.removeEquipInventario(i, personagem);
                atualiza();
                
            } else if(personagem.getInventario().get(i) instanceof Peitoral){
                Peitoral aux = personagem.getPeito();
                Peitoral novoPeitoral = (Peitoral) personagem.getInventario().get(i);
                personagem.setPeito(novoPeitoral);
                BusinessFacade.addEquipInventario(aux, personagem);
                BusinessFacade.removeEquipInventario(i, personagem);
                atualiza();
                
            } else if(personagem.getInventario().get(i) instanceof Grevas){
                Grevas aux = personagem.getBota();
                Grevas novoGrevas = (Grevas) personagem.getInventario().get(i);
                personagem.setBota(novoGrevas);
                BusinessFacade.addEquipInventario(aux, personagem);
                BusinessFacade.removeEquipInventario(i, personagem);
                atualiza();
            }     
                
        }
    }//GEN-LAST:event_buttonEquiparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton buttonEquipar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelArma;
    private javax.swing.JLabel labelBota;
    private javax.swing.JLabel labelElmo;
    private javax.swing.JLabel labelImgFundo;
    private javax.swing.JLabel labelPeito;
    private javax.swing.JTable tabelaEquipamento;
    private javax.swing.JTable tabelaPocao;
    // End of variables declaration//GEN-END:variables

//========== MÉTODOS ===========================================================
    
    /**
     * Atualiza as informações das tabelas do inventário e dos itens equipados.
     */
    public void atualiza(){
        labelArma.setText(personagem.getArma().getNome());
        labelElmo.setText(personagem.getElmo().getNome());
        labelPeito.setText(personagem.getPeito().getNome());
        labelBota.setText(personagem.getBota().getNome());
        
        DefaultTableModel modelo = new DefaultTableModel(
            new Object [][]{},
            new String []{"Nome", "Lvl", "Dano/Proteção", "Preço"}
        );

        DefaultTableModel modelo3 = new DefaultTableModel(
            new Object [][]{},
            new String[] {"Tipo", "Eficiencia", "Quantidade", "Preço"}
        );
        
        tabelaEquipamento.setModel(modelo);
        tabelaPocao.setModel(modelo3);
        
        if(tabelaEquipamento.getModel() instanceof DefaultTableModel){
            Iterator it = personagem.getInventario().iterator();
            while(it.hasNext()){
                Equipamento equip = (Equipamento) it.next();
                modelo.addRow(new Object[]{equip.getNome(), equip.getLvl(), equip.getPropriedade(), equip.getValorCompra()});
            }
        }
        
        if(tabelaPocao.getModel() instanceof DefaultTableModel){
            Iterator itItens = personagem.getConsumiveis().iterator();
            while(itItens.hasNext()){
                Itens itens = (Itens) itItens.next();
                modelo3.addRow(new Object[]{itens.getTipo(), itens.getEficiencia(), itens.getQuantidade(), itens.getValorCompra()});
            }
        }        
    }
    
}
