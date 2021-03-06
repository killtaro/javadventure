
package EDA;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.JLabel;

/**
 * @authors Matheus Bencke Nantes Coelho e Thiago Luiz Watambak
 */

public class Monstro extends Ser{
    private int xpDrop;
    private int coinDrop;
    private static ArrayList<String> arrayMonstros = new ArrayList<>();
    private File arquivoMonstros = new File("Monstros.txt");
    public Monstro(int level){
        try {
            Scanner leitor = new Scanner(new FileReader(arquivoMonstros)).useDelimiter("\\n");
            Random x = new Random();
        
            lvl = x.nextInt(level + 5) + 1;

            forca = x.nextInt(lvl) + 1;
            destreza = x.nextInt(lvl) + 1;
            vitalidade = x.nextInt(lvl) + 1;
            inteligencia = x.nextInt(lvl) + 1;
            hp = vitalidade * 10;

            xpDrop = lvl * (forca + destreza + vitalidade + inteligencia);
            coinDrop = lvl * 10;

            defesa = false;
            
            arma = new Arma(this.lvl);
            elmo = new Elmo(this.lvl);
            peito = new Peitoral(this.lvl);
            bota = new Grevas(this.lvl);

            atk = arma.getPropriedade() + forca;

            
            status = EnumStatus.NORMAL;
            
            while(leitor.hasNext()){
                String nomeS = leitor.next();
                arrayMonstros.add(nomeS);
            }
            
            this.nome = arrayMonstros.get(x.nextInt(arrayMonstros.size()));
            
            if(nome.contains("Terminator")){
                aparencia = (new javax.swing.ImageIcon(getClass().getResource("/Images/undo.png")));
            } else if(nome.contains("Zumbi")){
                aparencia = (new javax.swing.ImageIcon(getClass().getResource("/Images/undo (2).png")));
            } else if(nome.contains("sasuke")){
            aparencia = (new javax.swing.ImageIcon(getClass().getResource("/Images/sasuke.png")));
            } else if(nome.contains("sakura")){
                aparencia = (new javax.swing.ImageIcon(getClass().getResource("/Images/sakura.png")));
            } else if(nome.contains("naruto")){
                aparencia = (new javax.swing.ImageIcon(getClass().getResource("/Images/naruto.png")));
            } else if(nome.contains("Esqueleto")){
                aparencia = (new javax.swing.ImageIcon(getClass().getResource("/Images/esqueleto.GIF")));
            }
        } catch (Exception e) {
        }
       
    }

//========== Getters e Setters: Drop de XP =====================================    
    
    /**
     * @return the xpDrop
     */
    public int getXpDrop() {
        return xpDrop;
    }

    /**
     * @param xpDrop the xpDrop to set
     */
    public void setXpDrop(int xpDrop) {
        this.xpDrop = xpDrop;
    }

//========== Getters e Setters: Drop de Dinheiro ===============================
    
    /**
     * @return the coinDrop
     */
    public int getCoinDrop() {
        return coinDrop;
    }

    /**
     * @param coinDrop the coinDrop to set
     */
    public void setCoinDrop(int coinDrop) {
        this.coinDrop = coinDrop;
    }
    
//========== Métodos =========================================================== 
    
    /**
     * Gerencia o turno do monstro.
     * @param inimigo 
     */
    public void turno(Ser inimigo){
        Random x = new Random();
        switch(x.nextInt(3)){
            case 1:
                this.atacar(inimigo);
            case 2:
                this.defender();
            default:
                this.atacar(inimigo);
        }
    }

    /**
     * Retorna a aparência do monstro.
     * @return 
     */
    public Icon aparencia(){
       return aparencia;     
    }

}
