
package EDA;

import java.util.Random;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public abstract class Ser {
    String nome;
    int lvl;
    int atk;
    int hpMaximo;
    int hp;
    boolean defesa;
    int protecaoTotal;
    Arma arma;
    Peitoral peito;
    Elmo elmo;
    Grevas bota;
    int forca;
    int destreza;
    int inteligencia;
    int vitalidade;
    int qtdPot;
    EnumStatus status;
    Icon aparencia;
    
//========== Getters e Setters: Nome ===========================================

    /**
     * Define o nome do ser.
     * @return 
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Retorna o nome do ser.
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

//========== Getters e Setters: Level ==========================================
    
    /**
     * Retorna o nível do ser.
     * @return 
     */
    public int getLvl() {
        return lvl;
    }
    
    /**
     * Define o nível do ser.
     * @param lvl 
     */
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
    
//========== Getters e Setters: Proteção Total =================================
    
    /**
     * Retorna a proteção total.
     * @return the protecaoTotal
     */
    public int getProtecaoTotal() {
        return protecaoTotal;
    }

    /**
     * Define a proteção total.
     * @param protecaoTotal the protecaoTotal to set
     */
    public void setProtecaoTotal(int protecaoTotal) {
        this.protecaoTotal = protecaoTotal;
    }
    
//========== Getters e Setters: Ataque =========================================
    
    /**
     * Retorna a força de ataque do ser.
     * @return 
     */
    public int getAtk() {
        return atk;
    }
    
    /**
     * Define a força de ataque do ser.
     * @param atk 
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

//========== Getters e Setters: HP =============================================
    
    /**
     * Retorna os pontos de vida do ser.
     * @return 
     */
    public int getHp() {
        return hp;
    }
    
    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

//========== Getters e Setters: HP Máximo ======================================
    
    /**
     * 
     * @return 
     */
    public int getHpMaximo(){
        return hpMaximo;
    }
    
    /**
     * Define os pontos de vida do ser.
     */
    public void setHpMaximo() {
        hpMaximo = vitalidade * 100;
    }

//========== Getters e Setters: Força ==========================================
    
    /**
     * Retorna o nível de força do ser.
     * @return 
     */
    public int getForca() {
        return forca;
    }

    /**
     * Define o nível de força do ser.
     * @param forca 
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

//========== Getters e Setters: Destreza =======================================    
    
    /**
     * Retorna o nível de destreza do ser.
     * @return 
     */
    public int getDestreza() {
        return destreza;
    }
    
    /**
     * Define o nível de destreza do ser.
     * @param destreza 
     */
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

//========== Getters e Setters: Inteligência ===================================
    
    /**
     * Retorna o nível de inteligência do ser.
     * @return 
     */
    public int getInteligencia() {
        return inteligencia;
    }
    
    /**
     * Define o nível de inteligência do ser.
     * @param inteligencia 
     */
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

//========== Getters e Setters: Vitalidade =====================================    
    
    /**
     * Retorna o nível de vitalidade do ser.
     * @return 
     */
    public int getVitalidade() {
        return vitalidade;
    }

    /**
     * Define o nível de vitalidade do ser.
     * @param vitalidade 
     */
    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

//========== Getetrs e Setters: Status =========================================

    /**
     * @return the status
     */
    public EnumStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(EnumStatus status) {
        this.status = status;
    }
//========== Getters e Setters: Armas ==========================================
    
    /**
     * Retorna a arma equipada.
     * @return the arma
     */
    public Arma getArma() {
        return arma;
    }

    /**
     * Define a arma equipada.
     * @param arma the arma to set
     */
    public void setArma(Arma arma) {
        this.arma = arma;
        atk = arma.getPropriedade() + forca;
    }    

//========== Getters e Setters: Elmo ===========================================
    
    /**
     * Retorna o elmo equipado.
     * @return the elmo
     */
    public Elmo getElmo() {
        return elmo;
    }

    /**
     * Define o elmo equipado.
     * @param elmo the elmo to set
     */
    public void setElmo(Elmo elmo) {
        this.elmo = elmo;
        protecaoTotal = protecaoTotal + this.elmo.getPropriedade();
    }
    
//========== Getters e Setters: Peitoral =======================================

    /**
     * Retorna o peitoral equipado.
     * @return the peito
     */
    public Peitoral getPeito() {
        return peito;
    }

    /**
     * Define o peitoral equipado.
     * @param peito the peito to set
     */
    public void setPeito(Peitoral peito) {
        this.peito = peito;
        protecaoTotal = protecaoTotal + this.peito.getPropriedade();
    }

//========== Getters e Setters: Grevas =========================================    
    
    /**
     * Retorna as grevas equipadas.
     * @return the bota
     */
    public Grevas getBota() {
        return bota;
        
    }

    /**
     * Define as grevas equipadas.
     * @param bota the bota to set
     */
    public void setBota(Grevas bota) {
        this.bota = bota;
        protecaoTotal = protecaoTotal + this.bota.getPropriedade();
    }

//========== GETTERS E SETTERS: Defesa =========================================
    
    /**
     * @return the defesa
     */
    public boolean isDefesa() {
        return defesa;
    }

    /**
     * @param defesa the defesa to set
     */
    public void setDefesa(boolean defesa) {
        this.defesa = defesa;
    }

//========== GETTERS E SETTERS: Quantidade Poções ==============================    
    
    /**
     * @return the qtdPot
     */
    public int getQtdPot() {
        return qtdPot;
    }

    /**
     * @param qtdPot the qtdPot to set
     */
    public void setQtdPot(int qtdPot) {
        this.qtdPot = qtdPot;
    }
    
 //========== Métodos ==========================================================
    
    /**
     * Gerencia o ataque.
     * @param inimigo 
     */
    public void atacar(Ser inimigo){
        Random x = new Random();
        this.setDefesa(false);
        int hpInimigo = inimigo.getHp();
        int hpt = inimigo.getHp();
        if(inimigo.getHp() > 0){
            if(inimigo.isDefesa() == false){
                if(null != EnumParteCorpo.aleatoriza(x.nextInt(3))){
                    switch (EnumParteCorpo.aleatoriza(x.nextInt(5))) {
                        case CABECA:
                            inimigo.setHp(hpInimigo - this.getAtk() * 2);
                            JOptionPane.showMessageDialog(null, "O pobre " + inimigo.getNome() + " foi atingido e recebeu " + (hpt - inimigo.getHp()), "ATAQUE", JOptionPane.PLAIN_MESSAGE);
                            break;
                        case TORSO:
                            inimigo.setHp(hpInimigo - this.getAtk());
                            JOptionPane.showMessageDialog(null, "O pobre " + inimigo.getNome() + " foi atingido e recebeu " + (hpt - inimigo.getHp()), "ATAQUE", JOptionPane.PLAIN_MESSAGE);
                            break;
                        case PERNAS:
                            inimigo.setHp(hpInimigo - this.getAtk() / 2);
                            JOptionPane.showMessageDialog(null, "O pobre " + inimigo.getNome() + " foi atingido e recebeu " + (hpt - inimigo.getHp()), "ATAQUE", JOptionPane.PLAIN_MESSAGE);
                            break;
                        default:
                            break;
                    }        
                }

                if(null != this.getArma().getTipo()){
                    switch (this.getArma().getTipo()) {
                        case CONTUNDENTE:
                            switch(x.nextInt(5)){
                                case 1:
                                    inimigo.setStatus(EnumStatus.ATORDOADO);
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                default:
                                    break;
                                }   
                            break;
                        case PERFURANTE:
                            switch(x.nextInt(5)){
                                case 1:
                                    inimigo.setStatus(EnumStatus.SANGRANDO);
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                default:
                                    break;
                                }
                            break;
                        case CORTANTE:
                            switch(x.nextInt(5)){
                                case 1:
                                    inimigo.setStatus(EnumStatus.SANGRANDO);
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                default:
                                    break;
                                }
                            break;
                        default:
                            break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "" + inimigo.getNome() + " defendeu o ataque.", "Wow, defesa", JOptionPane.PLAIN_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "" + inimigo.getNome() + " virou estrelinha. " + this.getNome() + " é o vencedor.", "Wow, defesa", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    /**
     * Coloca o ser em modo de defesa.
     */
    public void defender(){
        this.setDefesa(true);
    }
    
    public boolean fugir(Ser inimigo){
        this.setDefesa(false);
        if(this.getDestreza() > inimigo.getDestreza()){
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Retorna a aparência do ser.
     * @return 
     */
    public Icon getAparencia() {
        return aparencia;
    }
    
    /**
     * Cura o ser.
     * @param quanti 
     */
    public void curar(int quanti){
        int hpstatico = getHp();
        if(getHp() < getHpMaximo()){
            /*for(int i = getHp(); i < getHpMaximo(); i++){
                setHp(i + hpstatico);
            }*/
            setHp(getHp() + 100);
            if(getHp() > getHpMaximo()){
                setHp(getHpMaximo());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sua vida tá cheia meu compadre.", "Opa, não rolou", JOptionPane.PLAIN_MESSAGE);
        }
    }
}

